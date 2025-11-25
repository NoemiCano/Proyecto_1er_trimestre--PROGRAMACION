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

}
