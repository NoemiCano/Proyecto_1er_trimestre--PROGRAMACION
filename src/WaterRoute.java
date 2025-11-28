import java.util.Scanner;

public class WaterRoute {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        waterRoute();
    }
    public static void waterRoute() {

        int choiceWater;
        Metodos.divider();

        System.out.println("Al avanzar por el camino de (... ) te encuentras con un lago de aguas cristalinas, al mirar a tu alrededor ves algo que se refleja en el borde del lago \n (sombras familiares - - un camino de árboles que rodea el lago rodeado de unas sombras (?? ), no estás seguro de si seguir mirando o continuar tu camino tratando de cruzar el lago nadando, \n (no estás seguro de si tu pokemon podrá seguir tu ritmo).\n");

        System.out.println(Metodos.purple + "1. Reflejo");
        System.out.println(Metodos.green + "2.Sombras");
        System.out.println(Metodos.blue + "3.Cruzar nadando el lago" + Metodos.reset);

        choiceWater = reintentoSinCrashear.comprobar(sc, "¿Qué decides?",1, 3);

        switch (choiceWater) {
            case 1-> WaterRoute.waterRoute();
            case 2 -> Metodos.divider();
            case 3 -> Metodos.divider();
            default -> Metodos.divider();
        }
    }

}
