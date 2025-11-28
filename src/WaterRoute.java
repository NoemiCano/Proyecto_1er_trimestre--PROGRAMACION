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

        choiceWater = errores.comprobar(sc, "¿Qué decides?",1, 3);
        System.out.println(Metodos.purple + "1. Reflejo");
        System.out.println(Metodos.green + "2.Sombras");
        System.out.println(Metodos.blue + "3.Cruzar nadando el lago" + Metodos.reset);

        switch (choiceWater) {
            case 1-> reflejos();
            case 2 -> sombras();
            case 3 -> nadar();
        }
    }

    public static void waterRouteReturn() {

        int choiceWater;
        Metodos.divider();

        System.out.println("Al avanzar por el camino de (... ) te encuentras con un lago de aguas cristalinas, al mirar a tu alrededor ves algo que se refleja en el borde del lago \n (sombras familiares - - un camino de árboles que rodea el lago rodeado de unas sombras (?? ), no estás seguro de si seguir mirando o continuar tu camino tratando de cruzar el lago nadando, \n (no estás seguro de si tu pokemon podrá seguir tu ritmo).\n");

        choiceWater = errores.comprobar(sc, "¿Qué decides?",1, 3);
        System.out.println(Metodos.purple + "1. Reflejo");
        System.out.println(Metodos.green + "2.Sombras");
        System.out.println(Metodos.blue + "3.Cruzar nadando el lago" + Metodos.reset);

        switch (choiceWater) {
            case 1-> reflejos();
            case 2 -> sombras();
            case 3 -> nadar();
        }
    }

    static void reflejos(){

        System.out.println("a \n a \n a \n");


    }

    static void sombras(){

        int choiceShadows;
        Metodos.divider();

        System.out.println("Decides cruzar el camino de las sombras, \n sombras similares a () hacen daño a tu pokemon \n a \n.¡Tienes que huir los más rápido posible!");
        System.out.println("Al final del camino entre los árboles ves una luz, puede que tu pokemon y tu podais atravesar el bosque corriendo.");
        System.out.println("Seguís cerca del lago, puede que retroceder sea una mejor opción.");
        System.out.println("¡Estas sombras no podran con nosotros! La mejor opción es atacar.");

        choiceShadows = errores.comprobar(sc, "¿Qué decides?",1, 3);
        System.out.println(Metodos.purple + "1. Pasar corriendo através del lago");
        System.out.println(Metodos.blue + "2. Retroceder y volver al lago");
        System.out.println(Metodos.blue + "3.Cruzar nadando el lago" + Metodos.reset);

        switch (choiceShadows) {
            case 1-> reflejos();
            case 2 -> sombras();
            case 3 -> nadar();
        }


    }

    static void nadar(){

        System.out.println("a \n a \n a \n");


    }

}
