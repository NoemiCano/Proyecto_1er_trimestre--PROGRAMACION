import java.util.Scanner;

public class Final_Neutral {
    public static void main(String[] args) {

        finalNeutral();


    } public static void finalNeutral(){

        String ascii = """
          _           _        _ _         _                      _                 _      \s
         | |         | |      | | |       | |                    (_)               | |     \s
         | |__   __ _| |_ __ _| | | __ _  | |_ ___ _ __ _ __ ___  _ _ __   __ _  __| | __ _\s
         | '_ \\ / _` | __/ _` | | |/ _` | | __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |/ _` |/ _` |
         | |_) | (_| | || (_| | | | (_| | | ||  __/ |  | | | | | | | | | | (_| | (_| | (_| |
         |_.__/ \\__,_|\\__\\__,_|_|_|\\__,_|  \\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|\\__,_|\\__,_|
        """;

        System.out.println(ascii + Metodos.reset);

        Metodos.slowPrintln("Estás sentado, apoyado contra un árbol, en mitad de un bosque. \nLa luz del amanecer se filtra entre las ramas. \nA tu lado, tu compañero Pokémon duerme profundamente, como si el combate hubiese sido solo un mal sueño.", 40);

        Metodos.slowPrintln("\nPero entonces lo ves.\n", 40);

        Metodos.slowPrintln("A unos metros, entre los árboles, Darkrai te observa en silencio. \nYa no es la criatura monstruosa de tu pesadilla; su figura es más pequeña, más definida, más… real. \nPor un instante, ambos os quedáis mirándoos, como dos seres que saben lo que ha ocurrido sin necesidad de palabras.\n", 40);

        Metodos.slowPrintln("Todo lo vivido no fue más que ilusiones creadas por Darkrai. \nSu habilidad te había atrapado en una pesadilla profunda. \nPero esa última batalla, ese acto final de resistencia dentro del sueño, te permitió salir.\n", 40);

        Metodos.slowPrintln("Darkrai da un paso atrás. No hay hostilidad en sus ojos, solo una sombra de arrepentimiento… o tal vez de respeto. \nY antes de que puedas pronunciar una palabra, su figura se difumina y desaparece entre los árboles.\n", 40);

        Metodos.slowPrintln("Has escapado de la pesadilla.\nHas ganado… aunque no has conseguido capturarle.\nLas huellas del sueño permanecerán contigo un poco más.", 40);

        String ascii2 = "______ _             _   _   _            _             \n" +
                "|  ___(_)           | | | \\ | |          | |            \n" +
                "| |_   _ _ __   __ _| | |  \\| | ___ _   _| |_ _ __ ___  \n" +
                "|  _| | | '_ \\ / _` | | | . ` |/ _ \\ | | | __| '__/ _ \\ \n" +
                "| |   | | | | | (_| | | | |\\  |  __/ |_| | |_| | | (_) |\n" +
                "\\_|   |_|_| |_|\\__,_|_| \\_| \\_/\\___|\\__,_|\\__|_|  \\___/ \n" +
                "                    ______                              \n" +
                "                   |______|                             ";
        System.out.println(ascii2 + Metodos.reset);

        System.exit(0);

    }
}
