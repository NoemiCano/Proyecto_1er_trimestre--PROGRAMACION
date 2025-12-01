import java.util.Random;
import java.util.Scanner;

public class FireRoute {

    static int vidaSeleccionada = 0;

    static int seleccionado;

    static void inicioFireRoute() {
        main(null);
    }

    public static void main(String[] args) {
        opciones();
    }

    static void opciones() {
        Scanner leer = new Scanner(System.in);
        boolean linterna = true;
        int opciones = 2;

        if ("Vulpix".equals(leer.nextLine())) {
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

            if (leer.hasNextInt()) {
                seleccionado = leer.nextInt();

                if (seleccionado >= 1 && seleccionado <= opciones) {
                    break;
                } else {
                    System.out.println("Error: Debes elegir un número entre 1 y " + opciones + ".");
                }

            } else {
                System.out.println("Error: Debes ingresar solo números.");
                leer.next();
            }
        }
        System.out.println();

        switch (seleccionado) {
            case 1:
                if (linterna) {
                    System.out.println("Has usado la linterna. Las sombras se dispersan.");
                    recompensa();
                    break;
                } else {
                    System.out.println("No tienes la linterna en tu inventario");
                }
                break;

            case 2:
                if (opciones == 3) {
                    System.out.println("Que ataque quieres que Vulpix realice: ");
                    System.out.println("1. Llamarada");
                    System.out.println("2. Placaje");
                    ataqueVulpix();
                } else {
                    System.out.println("Huyes apresuradamente entre las sombras. Recibiendo daño por el camino.");
                    vidaSeleccionada -= vidaSeleccionada / 1.5;
                    System.out.println(vidaSeleccionada);
                    //AQUI SE TIENE Q PONER Q TE LLEVE A LA PARTE FINAL
                }
                break;

            case 3:
                System.out.println("Escapas del lugar recibiendo daño.");
                break;
        }
        System.out.println();
    }

    static int ataqueVulpix() {
        Scanner leer = new Scanner(System.in);
        int ataqueElegido = leer.nextInt();

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
                    vidaSeleccionada -= vidaSeleccionada - 15;
                    System.out.println(vidaSeleccionada);
                } else {
                    System.out.println("Escapas exitosamente de la situacion ");
                }
                recompensa();
        }
        return ataqueElegido;
    }

    public static int vidaVulpix() {
        int vidaVulpix = 100;
        String pokemon = "Vulpix";
        String ataqueUno = "Llamarada";
        String ataqueDos = "Placaje";
        System.out.println("Vida de Vulpix: " + vidaVulpix);
        System.out.println("El primer ataque de Vulpix es: " + ataqueUno + " Hace un rango de daño de 0 a 60");
        System.out.println("El segundo ataque de Vulpix es: " + ataqueDos + " Hace un rango de daño de 0 a 40");
        return vidaVulpix;
    }

    public static int vidaStaryu() {
        int vidaStaryu = 110;
        String pokemon = "Staryu";
        String ataqueUno = "Hidropulso";
        String ataqueDos = "Placaje";
        System.out.println("Vida de Staryu: " + vidaStaryu);
        System.out.println("El primer ataque de Staryu es: " + ataqueUno + " Hace un rango de daño de 0 a 60");
        System.out.println("El segundo ataque de Staryu es: " + ataqueDos + " Hace un rango de daño de 0 a 40");
        return vidaStaryu;
    }

    public static int vidaNidoran() {
        int vidaNidoran = 120;
        String pokemon = "Nidoran";
        String ataqueUno = "Onda toxica";
        String ataqueDos = "Placaje";
        System.out.println("Vida de Nidoran: " + vidaNidoran);
        System.out.println("El primer ataque de Nidoran es: " + ataqueUno + " Hace un rango de daño de 0 a 60");
        System.out.println("El segundo ataque de Nidoran es: " + ataqueDos + " Hace un rango de daño de 0 a 40");
        return vidaNidoran;
    }

    public static int vidaDarkrai() {
        int vidaDarkrai = 180;
        return vidaDarkrai;
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

        String pocionCurativa = "Pocion de vida";
        String piedraEvolucion = "Piedra Fuego";
        String pokeball = "Pokeball";

        if (pokeballAleatoria == true) {
            System.out.println("Objetos conseguidos: " + pocionCurativa + ", " + piedraEvolucion + " y " + pokeball);
        } else {
            System.out.println("Objetos conseguidos: " + pocionCurativa + " y " + piedraEvolucion);
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
