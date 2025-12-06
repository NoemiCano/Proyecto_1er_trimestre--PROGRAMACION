public class Final_Malo {
    public static void main(String[] args) {

        Final_Malo();
    }

    public static void Final_Malo(){
        String ascii = """
          _           _        _ _         _                      _                 _      \s
         | |         | |      | | |       | |                    (_)               | |     \s
         | |__   __ _| |_ __ _| | | __ _  | |_ ___ _ __ _ __ ___  _ _ __   __ _  __| | __ _\s
         | '_ \\ / _` | __/ _` | | |/ _` | | __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |/ _` |/ _` |
         | |_) | (_| | || (_| | | | (_| | | ||  __/ |  | | | | | | | | | | (_| | (_| | (_| |
         |_.__/ \\__,_|\\__\\__,_|_|_|\\__,_|  \\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|\\__,_|\\__,_|
        """;

        System.out.println(Metodos.red + ascii + Metodos.reset);

        Metodos.slowPrintln("Corres a recoger a tu compañero pokemon despues de ser abatido por Darkrai, no puedes creer que despues de toda esta aventura" , 40);
        Metodos.slowPrintln("no haya podido ser suficiente para derrotar al pokemon mitico Darkrai, halzas la mirada para mirar con rabia a Darkrai, pero el desaparece" , 40);
        Metodos.slowPrintln("y resuena en tu cabeza 'PERECERAS AQUI POR TU INCOMPETENCIA'." , 40);

        String ascii2 = "______ _             _  ___  ___      _       \n" +
                "|  ___(_)           | | |  \\/  |     | |      \n" +
                "| |_   _ _ __   __ _| | | .  . | __ _| | ___  \n" +
                "|  _| | | '_ \\ / _` | | | |\\/| |/ _` | |/ _ \\ \n" +
                "| |   | | | | | (_| | | | |  | | (_| | | (_) |\n" +
                "\\_|   |_|_| |_|\\__,_|_| \\_|  |_/\\__,_|_|\\___/ \n" +
                "                    ______                    \n" +
                "                   |______|                   ";

        System.out.println(Metodos.red + ascii2 + Metodos.reset);
    }
}
