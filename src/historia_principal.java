import java.util.Scanner;

public class historia_principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ascii = """
                        .-----------------------------.
                        |  PESADILLA EN LA NOCHE      |
                        |   LA TRAMPA DE DARKRAI      |
                        '-----------------------------'
                """;

        Metodos.slowPrint(ascii, 20);
        String nombreUsuario = Metodos.nombreUsuario();
        Metodos.slowPrintln("Hola, " + nombreUsuario, 40);

        while(true) {
            Metodos.slowPrintln("¿Quieres iniciar la aventura?", 40);
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("si")) {
                Metodos.slowPrintln("Despiertas en tu habitación sin recuerdos claros, aunque todo te resulta familiar... y a la vez extraño.", 40);
                Metodos.slowPrintln("Recuerdas que hoy debes ir con el profesor Oak a elegir tu primer pokemon. Por lo que te levantas de la cama y vas hacia el centro pokemon de tu ciudad", 40);
                return;
            }

            if (decision.equalsIgnoreCase("no")) {
                Metodos.slowPrintln("Juego terminado. ¡Hasta pronto!", 40);
                System.exit(0);
            } else {
                Metodos.slowPrintln("Por favor, escribe 'si' o 'no'.", 40);
            }
        }
    }
}
