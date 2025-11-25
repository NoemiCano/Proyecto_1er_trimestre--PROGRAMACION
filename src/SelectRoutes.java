import java.util.Scanner;

public class SelectRoutes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        selectRoutes();
    }
    public static void selectRoutes() {

        int choiceRoutes;

        Main.divider();
        System.out.println("Sales de (el laboratorio (??? ns qué es) decidido a comenzar tu aventura con tu nuevo compañero, tras avanzar un trato encuentras una bifurcación de tres caminos.");

        System.out.println("El primer camino parece (...)");
        System.out.println("El segundo camino parece (...)");
        System.out.println("El tercer camino parece (...)\n");

        System.out.println(Main.red + "1. Camino de las Sombras");
        System.out.println(Main.blue + "2. Camino del Lago Ilusorio");
        System.out.println(Main.purple + "3. Camino de la Luz Distorsionada" + Main.reset);

        choiceRoutes = reintentoSinCrashear.comprobar(sc, "¿Por qué camino decides continuar?",1, 3);

        switch (choiceRoutes) {
            case 1-> WaterRoute.waterRoute();
            case 2 -> WaterRoute.waterRoute();
            case 3 -> Main.divider();
            default -> Main.divider();
        }
    }
}
