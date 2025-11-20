import java.util.Scanner;

public class Metodos {
    public static String nombreUsuario() {
        Scanner sc = new Scanner(System.in);
        slowPrintln("Por favor, introduce tu nombre de usuario: ", 40);
        String nombreUsuario = sc.nextLine();
        return nombreUsuario;
    }

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

}
