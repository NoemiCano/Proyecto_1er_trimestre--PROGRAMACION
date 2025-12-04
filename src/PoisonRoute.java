import java.util.Random;
import java.util.Scanner;

public class PoisonRoute {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        inicioPoisonRoute();
    }

    static void inicioPoisonRoute() {
        System.out.println();
        Metodos.slowPrintln("BIENVENIDO AL CAMINO DE LUZ DISTORSIONADA", 30);
        System.out.println();
        Metodos.slowPrintln("Te encuentras en un bosque de espejos engañosos, tienes que resolver un ahorcado para avanzar.", 20);
        Metodos.slowPrintln("Cada vez que te equivocas en una letra la vida de tu pokemon disminuye, y si muere tu pokemon comienzas de 0 el ahorcado.", 20);
        Metodos.slowPrintln("Tienes 3 vidas. Si te quedas sin vidas pierdes.", 20);
        System.out.println();
        Metodos.slowPrintln("QUE COMIENCE EL JUEGO", 20);

        ahorcado();
    }

    static void ahorcado() {
        int vidas = 3;
        DatosHistoria.vidaInicial = DatosHistoria.vidaActual;
        int vidaPokemon = DatosHistoria.vidaActual;
        String pokemon = DatosHistoria.Pokemon;
        System.out.println(vidaPokemon+ " y " + pokemon);
        boolean adivinado = false;
        Random aleatorio = new Random();

        String[] box_ahorcado_palabra = {
                "pokeball", "ataque", "pesadilla", "veneno", "entrenador",
                "pokemon", "destino", "rutas", "nivel", "evolucion",
                "tipo", "fuego", "agua", "planta", "sombra",
                "camino", "oscuridad", "vulpix", "nidoran", "starmie"
        };

        String palabra = box_ahorcado_palabra[aleatorio.nextInt(box_ahorcado_palabra.length)];
        char[] palabraOculta = new char[palabra.length()];

        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        if (pokemon.equalsIgnoreCase("Nidoran")) {
            Metodos.slowPrintln("Al ser esta la ruta para nidoran tendras una ayuda de poder ver el 25% de las letras de la palabra", 20);
            ayudaLetras(palabra, palabraOculta, 0.25);
        }

        String letrasFalladas = "";

        while (vidaPokemon > 0 && vidas > 0 && !adivinado) {
            boolean acierto = false;
            System.out.println();
            System.out.println("Palabra: " + String.valueOf(palabraOculta));
            System.out.println("\u001B[32mVida del pokemon: " + vidaPokemon + ". Vidas restantes: " + vidas + "\u001B[0m");
            System.out.println();
            System.out.println("Que quieres hacer:");
            System.out.println("1: Adivinar palabra");
            System.out.println("2: Adivinar letra");
            System.out.print("Opcion: ");

            int elegir;
            while (true) {
                if (leer.hasNextInt()) {
                    elegir = leer.nextInt();
                    if (elegir == 1 || elegir == 2) break;
                    else System.out.println("\u001B[31m¡ERROR! Solo puedes introducir 1 o 2\u001B[0m");
                } else {
                    System.out.println("\u001B[31m¡ERROR! Solo puedes introducir numeros\u001B[0m");
                    leer.next();
                }
            }

            switch (elegir) {
                case 1:
                    System.out.println("Ingresa la palabra: ");
                    String adivinarPalabra = leer.next().toLowerCase();

                    if (!adivinarPalabra.matches("[a-zA-Z]+")) {
                        System.out.println("\u001B[31m¡ERROR! Solo se admiten letras\u001B[0m");
                        break;
                    }

                    if (adivinarPalabra.equals(palabra)) {
                        adivinado = true;
                    } else {
                        System.out.println("\u001B[31mINCORRECTO\u001B[0m");
                        DatosHistoria.vidaActual -= 20;
                        if (vidaPokemon <= 0) {
                            vidas--;
                            if (vidas > 0) {
                                System.out.println("\u001B[31mPS DE TU POKEMON AGOTADOS\u001B[0m");
                                DatosHistoria.vidaActual = DatosHistoria.vidaInicial;
                                palabraOculta = new char[palabra.length()];
                                for (int i = 0; i < palabraOculta.length; i++) palabraOculta[i] = '_';
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingresa una letra: ");
                    String unaLetra = leer.next().toLowerCase();
                    if (unaLetra.length() != 1 || !unaLetra.matches("[a-z]")) {
                        System.out.println("\u001B[31m¡ERROR! Solo se permite ingresar una letra valida\u001B[0m");
                        break;
                    }

                    char letra = unaLetra.charAt(0);
                    if (letrasFalladas.contains(String.valueOf(letra)) || String.valueOf(palabraOculta).contains("" + letra)) {
                        System.out.println("\u001B[31mYa has intentado esta letra\u001B[0m");
                        break;
                    }

                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra && palabraOculta[i] == '_') {
                            palabraOculta[i] = letra;
                            acierto = true;
                        }
                    }

                    if (!acierto) {
                        System.out.println("\u001B[31mEsta letra no esta en la palabra\u001B[0m");
                        DatosHistoria.vidaActual -= 5;
                        vidaPokemon = DatosHistoria.vidaActual;
                        letrasFalladas += letra + " ";
                        if (vidaPokemon <= 0) {
                            vidas--;
                            if (vidas > 0) {
                                System.out.println("\u001B[31mTU POKEMON MURIO, reiniciando ahorcado\u001B[0m");
                                vidaPokemon = DatosHistoria.vidaInicial;
                                palabraOculta = new char[palabra.length()];
                                for (int i = 0; i < palabraOculta.length; i++) palabraOculta[i] = '_';
                                letrasFalladas = "";
                            }
                        }
                    } else {
                        System.out.println("\u001B[32mLETRA CORRECTA\u001B[0m");
                    }

                    if (String.valueOf(palabraOculta).equals(palabra)) adivinado = true;
                    break;
            }
        }

        if (adivinado) {
            System.out.println("\u001B[32mFELICIDADES ADIVINASTE LA PALABRA. GANASTE EL JUEGO\u001B[0m");
            recompensa(vidaPokemon);
        } else {
            System.out.println("\u001B[31mHAS PERDIDO TODAS LAS VIDAS\u001B[0m");
        }
    }

    static void ayudaLetras(String palabra, char[] palabraOculta, double porcentaje) {
        Random aleatorio = new Random();
        int letrasARevelar = Math.max(1, (int) (palabra.length() * porcentaje));
        int reveladas = 0;
        while (reveladas < letrasARevelar) {
            int pos = aleatorio.nextInt(palabra.length());
            if (palabraOculta[pos] == '_') {
                palabraOculta[pos] = palabra.charAt(pos);
                reveladas++;
            }
        }
    }

    static void recompensa(int vidaPokemon) {
        System.out.println("Ahora puedes abrir el cofre, escribe 'Abrir' para abrirlo:");
        String abrir = leer.next();
        while (!abrir.equalsIgnoreCase("Abrir")) {
            System.out.println("Solo puedes poner 'Abrir' para abrirlo");
            abrir = leer.next();
        }
        recompensaAleatorio(vidaPokemon);
    }

    static void recompensaAleatorio(int vidaPokemon) {
        Random aleatorio = new Random();
        boolean pokeballAleatoria = aleatorio.nextBoolean();
        String amuleto = "Amuleto de protección";
        String piedraEvolucion = "Piedra Lunar";
        String pokeball = "Pokeball";

        if (pokeballAleatoria) {
            System.out.println("Objetos conseguidos: " + amuleto + ", " + piedraEvolucion + " y " + pokeball);
        } else {
            System.out.println("Objetos conseguidos: " + amuleto + " y " + piedraEvolucion);
        }
        System.out.println("Tu pokemon tiene "+vidaPokemon+" de vida");
    }
}
