import java.util.Scanner;

public class Metodos {

    static String reset = "\u001B[0m";
    static String black = "\u001B[30m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String cyan = "\u001B[36m";
    static String white = "\u001B[37m";

    public static void slowPrint(String text, int delay) {
        for(char c : text.toCharArray()) {
            System.out.print(c);

            try {
                Thread.sleep((long)delay);
            } catch (InterruptedException var7) {
            }
        }
    }

    public static void slowPrintln(String text, int delay) {
        for(char c : text.toCharArray()) {
            System.out.print(c);

            try {
                Thread.sleep((long)delay);
            } catch (InterruptedException var7) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }

    public static String nombreUsuario() {
        Scanner sc = new Scanner(System.in);
        slowPrintln("Por favor, introduce tu nombre de usuario: ", 40);
        String nombreUsuario = sc.nextLine();
        return nombreUsuario;
    }

    static void divider(){

        System.out.println(white + "----------------------------------------------------------------------------" + reset);

    }

    public static int ataque1() {
        int damage = 0;

        if (DatosHistoria.getPokemon().equalsIgnoreCase("Vulpix")) {
            damage =  DatosPokemon.ataque1Vulpix();
        } else if (DatosHistoria.getPokemon().equalsIgnoreCase("Nidoran")) {
            damage =  DatosPokemon.ataque1Nidoran();
        }else if (DatosHistoria.getPokemon().equalsIgnoreCase("Staryu")) {
            damage = DatosPokemon.ataque1Staryu();
        }
    return damage;
    }

    public static int ataque2() {
        int damage = 0;

        if (DatosHistoria.getPokemon().equalsIgnoreCase("Vulpix")) {
            damage =  DatosPokemon.ataque2Vulpix();
        } else if (DatosHistoria.getPokemon().equalsIgnoreCase("Nidoran")) {
            damage =  DatosPokemon.ataque2Nidoran();
        }else if (DatosHistoria.getPokemon().equalsIgnoreCase("Staryu")) {
            damage = DatosPokemon.ataque2Staryu();
        }
        return damage;
    }


    int vidaStaryu = DatosPokemon.vidaStaryu();
    int ataque1Staryu = DatosPokemon.ataque1Staryu();
    int ataque2Staryu = DatosPokemon.ataque2Staryu();

    int vidaNidoran =  DatosPokemon.vidaNidoran();
    int ataque1Nidoran = DatosPokemon.ataque1Nidoran();
    int ataque2Nidoran = DatosPokemon.ataque2Nidoran();


    //Evolución de los pokemon

    public static String evolucionPokemon(){

    }




}
