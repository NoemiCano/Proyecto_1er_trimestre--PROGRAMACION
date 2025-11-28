import java.util.Random;
import java.util.Scanner;

public class RutaVeneno {
    static String nombrePokemon = "";

    static int vidaSeleccionada = 0;

    static int vidaPokemon = 0;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vidas = 3;

        System.out.println("Elija un Pokémon para tu aventura:");
        System.out.println("1: \u001B[31mVulpix\u001B[0m");
        System.out.println("2: \u001B[34mStaryu\u001B[0m");
        System.out.println("3: \u001B[35mNidoran\u001B[0m");

        seleccionarPokemon();

        System.out.println();
        mostrarLento("BIENVENIDO AL CAMINO DE LUZ DISTORSIONADA", 30);
        System.out.println();
        mostrarLento("Te encuentras en un bosque de espejos engañosos, tienes que resolver un ahorcado para avanzar.", 20);
        mostrarLento("Cada vez que te equivocas en una letra la vida de tu pokemon disminuye, y si muere tu pokemon comienzas de 0 el ahorcado.", 20);
        mostrarLento("Tienes " + vidas + " vidas. Si te quedas sin vidas pierdes.", 20);
        System.out.println();
        mostrarLento("QUE COMIENCE EL JUEGO", 20);

        ahorcado(nombrePokemon, vidas, vidaPokemon);
    }


    static int seleccionarPokemon() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Opción: ");
            String input = sc.next();
            if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                int numero = Character.getNumericValue(input.charAt(0));

                switch (numero) {
                    case 1:
                        nombrePokemon = "Vulpix";
                        System.out.println("FELICIDADES, HAS OBTENIDO A VULPIX");
                        vidaPokemon = obtenerVida(nombrePokemon);
                        return vidaPokemon;
                    case 2:
                        nombrePokemon = "Staryu";
                        System.out.println("FELICIDADES, HAS OBTENIDO A STARYU");
                        vidaPokemon = obtenerVida(nombrePokemon);
                        return vidaPokemon;

                    case 3:
                        nombrePokemon = "Nidoran";
                        System.out.println("FELICIDADES, HAS OBTENIDO A NIDORAN");
                        vidaPokemon = obtenerVida(nombrePokemon);
                        return vidaPokemon;
                    default:
                        System.out.println("Error: debes introducir 1, 2 o 3");
                }

            } else {
                System.out.println("Error: debes introducir un número válido.");
            }
        }
    }

    static void ahorcado(String pokemon, int vidas, int vidaPokemon) {
        Scanner leer = new Scanner(System.in);
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

        mostrarLento("ADIVINA LA PALABRA", 30);

        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        if (pokemon.equalsIgnoreCase("Nidoran")) {
            mostrarLento("Al ser esta la ruta para nidoran tendras una ayuda de poder ver el 25% de las letras de la palabra", 20);
            ayudaLetras(palabra, palabraOculta, 0.25);
        }

        String letrasFalladas = "";

        while (vidaPokemon > 0 && !adivinado) {

            boolean acierto = false;
            System.out.println();

            int elegir;

            while (true) {
                System.out.println("Palabra: " + String.valueOf(palabraOculta));
                System.out.println("\u001B[32mVida del pokemon: " + vidaPokemon + "." + " Vidas restantes: " + vidas + "\u001B[0m");
                System.out.println();
                System.out.println("Que quieres hacer:");
                System.out.println("1: Adivinar palabra");
                System.out.println("2: Adivinar letra");
                System.out.print("Opcion: ");

                if (leer.hasNextInt()) {
                    elegir = leer.nextInt();
                    if (elegir == 1 ||  elegir == 2) {
                        break;
                    } else  {
                        System.out.println();
                        System.out.println("\u001B[31m¡ERROR! Solo puedes introducir 1 o 2\u001B[0m");
                    }

                } else {
                    System.out.println();
                    System.out.println("\u001B[31m¡ERROR! Solo puedes introducir numeros\u001B[0m");
                    leer.next();
                }


            }

            switch (elegir) {
                case 1:
                    System.out.println();
                    System.out.println("Palabra: " + String.valueOf(palabraOculta));
                    System.out.println();
                    System.out.println("Ingresa la palabra: ");

                    String adivinarPalabra = leer.next();

                    adivinarPalabra = adivinarPalabra.toLowerCase();

                    boolean soloLetras = true;

                    for (int i = 0; i < adivinarPalabra.length(); i++) {
                        if (!Character.isLetter(adivinarPalabra.charAt(i))) {
                            soloLetras = false;
                            break;
                        }
                    }

                    if (!soloLetras) {
                        System.out.println();
                        System.out.println("\u001B[31m¡ERROR! Solo se admiten letras\u001B[0m");
                        break;
                    }

                    if (adivinarPalabra.equals(palabra)) {
                        adivinado = true;
                    } else {
                        System.out.println();
                        System.out.println("\u001B[31mINCORRECTO\u001B[0m");
                        vidaPokemon -= 20;
                        break;
                    }
                    if (vidaPokemon <= 0) {
                        reinicio(vidas, vidaPokemon, pokemon);
                    }
                    break;


                case 2:
                    System.out.println();
                    System.out.println("Palabra: " + String.valueOf(palabraOculta));
                    System.out.println("Letras falladas: " + letrasFalladas);
                    System.out.print("Ingresa una letra: ");

                    String unaLetra = leer.next();

                    if (unaLetra.length() != 1) {
                        System.out.println("\n\u001B[31m¡ERROR! Solo se permite ingresar una letra a la vez.\u001B[0m");
                        break;
                    }

                    char letra = Character.toLowerCase(unaLetra.charAt(0));

                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra && palabraOculta[i] == '_') {
                            palabraOculta[i] = letra;
                            acierto = true;
                        }
                    }

                    if (!Character.isLetter(letra)) {
                        System.out.println();
                        System.out.println("\u001B[31m¡ERROR! Solo se admiten letras\u001B[0m");
                        break;
                    }

                    if (!acierto) {
                        System.out.println(" ");
                        vidaPokemon -= 5;
                        System.out.println("\u001B[31mEsta letra no esta en la palabra\u001B[0m");

                        if (!letrasFalladas.contains(String.valueOf(letra))) {
                            letrasFalladas += letra + " ";
                        }
                        if (vidaPokemon <= 0) {
                            reinicio(vidas, vidaPokemon, pokemon);
                            break;
                        }
                    } else {
                        System.out.println(" ");
                        System.out.println("\u001B[32mLETRA CORRECTA\u001B[0m");
                    }

                    if (String.valueOf(palabraOculta).equals(palabra)) {
                        adivinado = true;
                    }
                    break;
            }
        }

        if (adivinado) {
            System.out.println(" ");
            System.out.println("\u001B[32mFELICIDADES ADIVINASTE LA PALABRA");
            System.out.println("GANASTE EL JUEGO\u001B[0m");
            recompensa(vidaPokemon);

        } else {
            reinicio(vidas, vidaPokemon, pokemon);
        }
    }

    static void ayudaLetras(String palabra, char[] palabraOculta, double porcentaje) {
        Random aleatorio = new Random();
        int letrasARevelar = (int) (palabra.length() * porcentaje);
        int reveladas = 0;
        while (reveladas < letrasARevelar) {
            int pos = aleatorio.nextInt(palabra.length());
            if (palabraOculta[pos] == '_') {
                palabraOculta[pos] = palabra.charAt(pos);
                reveladas++;
            }
        }
    }

    static int obtenerVida(String pokemon) {
        switch (pokemon) {
            case "Vulpix":
                mostrarAtaques(pokemon);
                return 100;
            case "Staryu":
                mostrarAtaques(pokemon);
                return 110;
            case "Nidoran":
                mostrarAtaques(pokemon);
                return 120;
            default:
                System.out.println("Pokémon inesistente.");
                return 0;
        }
    }

    static void mostrarAtaques(String pokemon) {
        String ataqueUno = "";
        String ataqueDos = "";
        switch (pokemon) {
            case "Vulpix":
                ataqueUno = "Llamarada";
                ataqueDos = "Placaje";
                System.out.print("Vida de Vulpix: 100");
                System.out.println("El primer ataque de Vulpix es: " + ataqueUno + " Hace un rango de daño de 0 a 60");
                System.out.println("El segundo ataque de Vulpix es: " + ataqueDos + " Hace un rango de daño de 0 a 40");
                break;

            case "Staryu":
                ataqueUno = "Hidropulso";
                ataqueDos = "Placaje";
                System.out.println("Vida de Staryu: 110");
                System.out.println("El primer ataque de Staryu es: " + ataqueUno + " Hace un rango de daño de 0 a 60");
                System.out.println("El segundo ataque de Staryu es: " + ataqueDos + " Hace un rango de daño de 0 a 40");
                break;

            case "Nidoran":
                ataqueUno = "Onda toxica";
                ataqueDos = "Placaje";
                System.out.println("Vida de Nidoran: 120");
                System.out.println("El primer ataque de Nidoran es: " + ataqueUno + " Hace un rango de daño de 0 a 60");
                System.out.println("El segundo ataque de Nidoran es: " + ataqueDos + " Hace un rango de daño de 0 a 40");
                break;
        }
    }

    static void mostrarLento(String texto, int ms) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    static int reinicio (int vidas, int vidaPokemon, String pokemon){
        Scanner leer = new Scanner(System.in);
        if (vidas <= 0){
            System.out.println(" ");
            mostrarLento("\u001B[31mHAS PERIDIDO" + " NO TE QUEDAN MAS VIDAS", 20);
            int opcion = 0;
            while (true){
                System.out.println(" ");
                System.out.println("Que quieres hacer: ");
                System.out.println("1: Volver a intentarlo");
                System.out.println("2: Salir del juego");
                System.out.print("Opcion:\u001B[0m");

                if (leer.hasNextInt()) {
                    opcion = leer.nextInt();
                    break;
                }else {
                    System.out.println("\u001B[31m¡ERROR! Solo puedes introducir numeros\u001B[0m");
                    leer.next();
                }
            }
            switch (opcion) {
                case 1:
                    main(null);
                    return 3;
                case 2:
                    System.exit(0);
                    break;
            }
        }
        if (vidaPokemon <= 0){
            System.out.println();
            vidas--;
            vidaPokemon = vidaSeleccionada;
            mostrarLento("\u001B[31mHAS PERIDIDO" + " TU POKEMON NO TIENE VIDA", 20);
            mostrarLento("VUELVE A INTENTARLO\u001B[0m", 20);

            ahorcado(pokemon,vidas,vidaPokemon);
        }
        return vidas;
    }

    static String recompensa(int vidaPokemon){
        Scanner leer = new Scanner(System.in);
        String abrir;
        mostrarLento("Ahora podras abrir este cofre, solo tienes que escribir 'Abrir' para abrirlo: ",20);
        abrir = leer.next();

        while (!abrir.equalsIgnoreCase("Abrir")){
            System.out.println("Solo puedes poner 'Abrir' para abrirlo");
            abrir = leer.next();
        }
        recompensaAleatorio(vidaPokemon);
        return abrir;
    }

    static void recompensaAleatorio(int vidaPokemon){
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

