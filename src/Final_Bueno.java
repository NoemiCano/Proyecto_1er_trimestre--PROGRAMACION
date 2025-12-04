public class Final_Bueno {
    public static void main(String[] args) {
        String ascii = """
          _           _        _ _         _                      _                 _      \s
         | |         | |      | | |       | |                    (_)               | |     \s
         | |__   __ _| |_ __ _| | | __ _  | |_ ___ _ __ _ __ ___  _ _ __   __ _  __| | __ _\s
         | '_ \\ / _` | __/ _` | | |/ _` | | __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |/ _` |/ _` |
         | |_) | (_| | || (_| | | | (_| | | ||  __/ |  | | | | | | | | | | (_| | (_| | (_| |
         |_.__/ \\__,_|\\__\\__,_|_|_|\\__,_|  \\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|\\__,_|\\__,_|
        """;

        System.out.println(Metodos.green + ascii + Metodos.reset);

       Metodos.slowPrintln("Despiertas muy confundido en medio de la primera ruta y te fijas en tu mochila donde notas algo raro", 40);
       Metodos.slowPrintln("Notas que tienes la pokeball de tu inicial \" + DatosHistoria.Pokemon + \" y ves otra pokeball mas, de la cual observas que contiene a Darkrai ", 40);
       Metodos.slowPrintln("Entonces te llega una rafaga de recuerdos, empiezas a ver todas tus aventuras dentro de la pesadilla hasta el momento donde lograste atrapar a Darkrai", 40);
       Metodos.slowPrintln("Una vez has vuelto a la normalidad prosigues con tu aventura a ser el proximo campeon pokemon.", 40);

       String ascii2 = "______ _             _  ______                        \n" +
               "|  ___(_)           | | | ___ \\                       \n" +
               "| |_   _ _ __   __ _| | | |_/ /_   _  ___ _ __   ___  \n" +
               "|  _| | | '_ \\ / _` | | | ___ \\ | | |/ _ \\ '_ \\ / _ \\ \n" +
               "| |   | | | | | (_| | | | |_/ / |_| |  __/ | | | (_) |\n" +
               "\\_|   |_|_| |_|\\__,_|_| \\____/ \\__,_|\\___|_| |_|\\___/ \n" +
               "                    ______                            \n" +
               "                   |______|                           ";
       System.out.println(Metodos.green +ascii2 + Metodos.reset);
    }
}
