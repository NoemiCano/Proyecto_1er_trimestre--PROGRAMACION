import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Metodos {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

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

        if ((DatosHistoria.Pokemon.equalsIgnoreCase("Vulpix")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Nidoran")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Staryu"))) {
            damage = random.nextInt(0, 61);
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Ninetales")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Starmie")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Nidoking"))) {
            damage = random.nextInt(20, 81);
            }
        return damage;
    }

    public static int ataque2() {
        int damage = 0;

        if ((DatosHistoria.Pokemon.equalsIgnoreCase("Vulpix")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Nidoran")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Staryu"))) {
            damage = random.nextInt(0, 41);
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Ninetales")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Starmie")) || (DatosHistoria.Pokemon.equalsIgnoreCase("Nidoking"))) {
            damage = random.nextInt(20, 61);
        }
        return damage;
    }

    public static int vidaInicialPokemon() {
        int totalVida = 0;

        if ((DatosHistoria.Pokemon.equalsIgnoreCase("Vulpix"))) {
            totalVida = 100;
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Nidoran"))) {
            totalVida = 120;
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Staryu"))) {
            totalVida = 110;
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Darkrai"))) {
            totalVida = 180;
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Ninetales"))) {
            totalVida = 160;
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Starmie"))) {
            totalVida = 170;
        } else if ((DatosHistoria.Pokemon.equalsIgnoreCase("Nidoking"))) {
            totalVida = 180;
        }

        return totalVida;
    }

    static void verInventario(String [] inventario) {

        String opcion;

        divider();
        Metodos.slowPrintln("\nObjetos en tu inventario: ", 40);

        for (int i = 0; i < inventario.length; i++) {
            if(inventario[i]==null) {

            }else {
                Metodos.slowPrint(inventario[i] + "\n", 40);
            }
        }

        Metodos.slowPrintln("\n¿Quieres utilizar algún objeto?", 40);
        opcion = errores.comprobarString(sc, "Introduce Si o No\n");

        if(opcion.equalsIgnoreCase("Si")) {
            opcion = errores.comprobarString(sc, "Introduce el nombre del objeto que deseas utilizar: ");

            if(opcion.equalsIgnoreCase("Linterna")) {

                for (int i = 0; i < inventario.length; i++) {
                    if(inventario[i].equalsIgnoreCase("Linterna")) {

                        Metodos.slowPrint("En este momento no puedes utilizar la linterna, continua avanzando en la historia. \n",40);

                    }else if(inventario[i].equalsIgnoreCase(null)) {

                    }else if(!inventario[i].equalsIgnoreCase("Linterna")){

                    }
                }
                Metodos.slowPrint("No tienes linternas en tu inventario. \n",40);

            }else if(opcion.equalsIgnoreCase("Poción de vida")) {

                for (int i = 0; i < inventario.length; i++) {

                    if(inventario[i].equalsIgnoreCase("Poción de vida") || inventario[i].equalsIgnoreCase("Pocion de vida")) {

                        DatosHistoria.vidaActual += 30;
                        Metodos.slowPrint("Has utilizado la poción de vida. \n",40);

                        inventario[i] = null;

                        if(DatosHistoria.vidaActual > DatosHistoria.vidaInicial){

                            DatosHistoria.vidaActual  = DatosHistoria.vidaInicial;
                        }

                        Metodos.slowPrint("La vida de " + DatosHistoria.Pokemon + " es: " + DatosHistoria.vidaActual + "\n",40);

                    }else if(inventario[i].equalsIgnoreCase(null)) {

                    }else if(!inventario[i].equalsIgnoreCase("Poción de vida")){

                    }
                }
                Metodos.slowPrint("No tienes pociones de vida en tu inventario. \n",40);

            }else if(opcion.equalsIgnoreCase("Revivir")) {

                for (int i = 0; i < inventario.length; i++) {

                    if(inventario[i].equalsIgnoreCase("Revivir")) {

                        Metodos.slowPrint("En este momento no puedes utilizar el revivir, tu pokemon continua con vida. \n",40);

                    }else if(inventario[i].equalsIgnoreCase(null)) {

                    }else if(!inventario[i].equalsIgnoreCase("Revivir")){

                    }
                }
                Metodos.slowPrint("No tienes revivir en tu inventario. \n",40);

            }else if(opcion.equalsIgnoreCase("Piedra Agua")||opcion.equalsIgnoreCase("Piedra Fuego")||opcion.equalsIgnoreCase("Piedra Lunar")) {

                Metodos.slowPrintln("No puedes utilizar el objeto elegido, prueba otra vez cuando hayas avanzado en tu aventura.", 40);

            }else {

            }

        }else{
        }
    }
}
