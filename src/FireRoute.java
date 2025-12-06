import java.util.Random;
import java.util.Scanner;

public class FireRoute {

    public static void main(String[] args) {
        inicioFireRoute();

    }

    static void inicioFireRoute() {
        int selector = 0;
        opciones(selector);

    }

    static void opciones(int selector) {
        Scanner leer = new Scanner(System.in);

        int vidaInicial = DatosHistoria.vidaInicial;
        DatosHistoria.vidaActual = vidaInicial;
        int vidaPokemon = DatosHistoria.vidaActual;
        String pokemon = DatosHistoria.Pokemon;

        int opciones = 2;

        if (pokemon.equals("Vulpix")) {
            opciones++;
        }

        System.out.println();
        mostrarLento("BIENVENIDO AL CAMINO DE SOMBRAS", 30);
        System.out.println();
        mostrarLento("Te encuentras rodeado de sombras que intentarán atacarte.", 20);
        System.out.println();
        mostrarLento("Tienes " + opciones + " opciones para enfrentar a las sombras:", 20);
        System.out.println();

        while (true) {
            if (opciones == 3) {
                System.out.println("1. Usar la linterna para ahuyentar a las sombras.");
                System.out.println("2. Atacar a las sombras con Vulpix.");
                System.out.println("3. Huir y recibir daño por el camino.");
            } else {
                System.out.println("1. Usar la linterna para ahuyentar a las sombras.");
                System.out.println("2. Huir del camino recibiendo daño por el camino.");
            }

            System.out.print("Elige una opción: ");

            while (true) {
                if (leer.hasNextInt()) {
                    selector = leer.nextInt();

                    if (selector >= 1 && selector <= opciones) {
                        break;
                    } else {
                        System.out.println("Error: Debes elegir un número entre 1 y " + opciones + ".");
                    }

                } else {
                    System.out.println("Error: Debes ingresar solo números.");
                    leer.next();
                }
                System.out.println();
                switch (selector) {
                    case 1:
                        if (DatosHistoria.arrayInventario[0] == "Linterna") {
                            System.out.println("Has usado la linterna.");
                            System.out.println("Haciendo que las sombras se dispersen.");
                            recompensa();
                            break;
                        } else {
                            System.out.println("No tienes la linterna en tu inventario");
                            return;
                        }

                    case 2:
                        if (opciones == 3) {
                            System.out.println("Que ataque quieres que Vulpix realice: ");
                            System.out.println("1. Llamarada");
                            System.out.println("2. Placaje");
                            ataqueVulpix(vidaPokemon);
                        } else {
                            System.out.println("Huyes apresuradamente entre las sombras. Recibiendo daño por el camino.");
                            vidaPokemon -= vidaPokemon / 1.5;
                            System.out.println("La vida de tu pokemon es: " + vidaPokemon);
                            //AQUI SE TIENE Q PONER Q TE LLEVE A LA PARTE FINAL
                        }
                        break;

                    case 3:
                        System.out.println("Huyes apresuradamente entre las sombras. Recibiendo daño por el camino.");
                        vidaPokemon -= vidaPokemon / 1.5;
                        System.out.println("La vida de tu pokemon es: " + vidaPokemon);
                        //AQUI SE TIENE Q PONER Q TE LLEVE A LA PARTE FINAL
                        break;
                }
                System.out.println();
            }
        }
    }

    static int ataqueVulpix(int vidaPokemon) {
        Scanner leer = new Scanner(System.in);
        int ataqueElegido = leer.nextInt();
        System.out.println("\nVulpix tiene: " + vidaPokemon + " de vida.");
        while (vidaPokemon > 0) {
            switch (ataqueElegido) {
                case 1:
                    System.out.println("Vulpix usa Llamarada");
                    System.out.println("Escapas exitosamente de la situacion");
                    recompensa();
                    break;
                case 2:
                    System.out.println("Vulpix usa Placaje");
                    Random aleatorio = new Random();
                    boolean recibeDaño = aleatorio.nextBoolean();

                    if (recibeDaño) {
                        System.out.println("Al usar Placaje vulpix recibe daño de una sombra");
                        vidaPokemon -= vidaPokemon - 15;
                        return ataqueElegido;
                    } else {
                        System.out.println("Escapas exitosamente de la situacion ");
                    }
                    recompensa();
            }
        }
        return ataqueElegido;
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

    static String recompensa() {
        Scanner leer = new Scanner(System.in);
        String abrir;
        mostrarLento("Ahora podras abrir este cofre, solo tienes que escribir 'Abrir' para abrirlo: ", 20);
        abrir = leer.next();

        while (!abrir.equalsIgnoreCase("Abrir")) {
            System.out.println("Solo puedes poner 'Abrir' para abrirlo");
            abrir = leer.next();
        }
        recompensaAleatorio();
        return abrir;
    }

    static void recompensaAleatorio() {
        Random aleatorio = new Random();
        boolean pokeballAleatoria = aleatorio.nextBoolean();

        DatosHistoria.arrayInventario[1] = "Pocion de vida";
        DatosHistoria.arrayInventario[2] = "Piedra Fuego";
        DatosHistoria.arrayInventario[3] = "Pokeball";

        if (pokeballAleatoria == true) {
            System.out.println("Objetos conseguidos: " + DatosHistoria.arrayInventario[1] + ", " + DatosHistoria.arrayInventario[2] + " y " + DatosHistoria.arrayInventario[3]);
        } else {
            System.out.println("Objetos conseguidos: " + DatosHistoria.arrayInventario[1] + " y " + DatosHistoria.arrayInventario[2]);
        }
        finalRuta();
    }

    static void finalRuta() {
        System.out.println();
        mostrarLento("Has llegado al final de la ruta...", 30);
        mostrarLento("Las sombras se desvanecen mientras avanzas.", 30);
        mostrarLento("Pero una presencia oscura te observa...", 30);
    }
}
