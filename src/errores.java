import java.util.Scanner;
public class errores {
    public static void main(String[] args) {

    }

    public static int comprobar(Scanner sc, String texto) {

        while (true) {
            Metodos.slowPrint(texto, 40);

            if (sc.hasNextInt()) {

                int valor = sc.nextInt();

                sc.nextLine();
                return valor;

            } else {
                Metodos.slowPrintln( Metodos.red + "Entrada inválida: introduce un número entero." + Metodos.reset, 40);
                sc.nextLine();
            }
        }
    }

    public static int comprobar(Scanner sc, String texto, int min, int max) {

        while (true) {
            int valor = comprobar(sc, texto);

            if (valor < min || valor > max) {

                Metodos.slowPrintln(Metodos.red + "Valor fuera de rango. Debe estar entre " + min + " y " + max + "." + Metodos.reset, 40);

            } else {
                return valor;
            }
        }
    }

    public static double comprobarDouble(Scanner sc, String texto) {
        while (true) {
            Metodos.slowPrint(texto, 40);

            if (sc.hasNextDouble()) {
                double valor = sc.nextDouble();

                sc.nextLine();
                return valor;

            } else {
                Metodos.slowPrintln(Metodos.red + "Entrada inválida: introduce un número (puede tener decimales)." + Metodos.reset, 40);
                sc.nextLine();
            }
        }
    }

    public static double comprobarDouble(Scanner sc, String texto, double min, double max) {
        while (true) {
            double valor = comprobarDouble(sc, texto);

            if (valor < min || valor > max) {

                Metodos.slowPrintln(Metodos.red + "Valor fuera de rango. Debe estar entre " + min + " y " + max + "." + Metodos.reset, 40);

            } else {
                return valor;
            }
        }
    }

    public static String comprobarString(Scanner sc, String prompt) {

        while (true) {
            Metodos.slowPrint(prompt, 40);
            String line = sc.nextLine();

            if (line.trim().isEmpty()) {

                Metodos.slowPrintln(Metodos.red + "Entrada vacía. Introduce algún texto." + Metodos.reset, 40);

            } else {
                return line;
            }
        }
    }

    public static String comprobarStringVacio(Scanner sc, String prompt) {

        Metodos.slowPrint(prompt, 40);
        return sc.nextLine();
    }

}
