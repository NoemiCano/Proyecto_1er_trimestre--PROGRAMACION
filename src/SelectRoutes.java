import java.util.Scanner;

public class SelectRoutes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        selectRoutes();
    }
    public static void selectRoutes() {

        int choiceRoutes;

        Metodos.divider();
        System.out.println("Sales del laboratorio, muy emocionado por el comienzo de tu viaje y por haber recibido a tu nuevo compañero Pokémon. El aire fresco del exterior marca el verdadero inicio de tu aventura. \nTras caminar un rato por un sendero algo gastado, el bosque se abre y revela una gran bifurcación. \nTres caminos se extienden frente a ti, cada uno con un ambiente tan distinto que parece pertenecer a un mundo diferente.\n");
        System.out.println("Sales del centro pokemon. \nTe has decidido a comenzar tu aventura con tu nuevo compañero, tras avanzar un trato encuentras una bifurcación de tres caminos.");

        System.out.println("El primer camino está envuelto en una penumbra inquietante. Los árboles son altos, tan altos que sus copas se entrelazan formando un techo oscuro que apenas deja pasar la luz. \nDe entre sus sombras parece moverse algo, aunque cada vez que intentas fijar la vista, desaparece. Una brisa fría recorre este sendero, como si te invitara… o te advirtiera.\n");
        System.out.println("El segundo camino está bordeado por un brillo suave y azulado. A lo lejos se escucha el murmullo de agua, y una neblina ligera flota sobre un lago que parece reflejar más de lo que muestra. \nLa superficie del agua es tan tranquila que parece un espejo perfecto, pero por alguna razón, no puedes evitar sentir que algo se oculta bajo esa calma ilusoria.\n");
        System.out.println("El tercer camino resplandece con un resplandor extraño. No es luz natural, ni parece provenir del sol. Más bien, es como si el aire mismo estuviera distorsionado. \nEntre los árboles se ven destellos, como si espejos invisibles doblaran la realidad. Cada paso que das cerca hace que la luz cambie de forma, generando ilusiones que pueden confundirte… o guiarte.\n");

        System.out.println(Metodos.red + "1. Camino de las Sombras");
        System.out.println(Metodos.blue + "2. Camino del Lago Ilusorio");
        System.out.println(Metodos.purple + "3. Camino de la Luz Distorsionada" + Metodos.reset);
        choiceRoutes = errores.comprobar(sc, "Ahora, con tu compañero a tu lado y el cruce de caminos frente a ti, debes decidir cómo continuar tu viaje.",1, 3);

        switch (choiceRoutes) {
            case 1-> RutaFuego.opciones();
            case 2 -> WaterRoute.waterRoute();
            case 3 -> WaterRoute.waterRoute(); //RutaVeneno.main();
            default -> Metodos.divider();
        }
    }
}
