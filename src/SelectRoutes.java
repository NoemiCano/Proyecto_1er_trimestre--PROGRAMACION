import java.util.Scanner;

public class SelectRoutes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        selectRoutes();
    }
    public static void selectRoutes() {

        boolean opcion = true;
        boolean inventario = true;
        int choiceRoutes;

        while (opcion) {
        opcion = false;
        Metodos.divider();
        Metodos.slowPrintln("Sales del centro pokemon, muy emocionado por el comienzo de tu viaje y por haber recibido a tu nuevo compañero Pokémon. El aire fresco del exterior \nmarca el verdadero inicio de tu aventura. Tras caminar un rato por un sendero algo gastado, el bosque se abre y revela una gran bifurcación. \nTres caminos se extienden frente a ti, cada uno con un ambiente tan distinto que parece pertenecer a un mundo diferente.\n", 30);

        Metodos.slowPrintln("El primer camino está envuelto en una penumbra inquietante. Los árboles son altos, tan altos que sus copas se entrelazan formando un techo oscuro \nque apenas deja pasar la luz. De entre sus sombras parece moverse algo, aunque cada vez que intentas fijar la vista, desaparece. \nUna brisa fría recorre este sendero, como si te invitara… o te advirtiera.\n", 30);
            Metodos.slowPrintln("El segundo camino está bordeado por un brillo suave y azulado. A lo lejos se escucha el murmullo de agua, y una neblina ligera flota sobre un lago \nque parece reflejar más de lo que muestra. La superficie del agua es tan tranquila que parece un espejo perfecto, pero por alguna razón, \nno puedes evitar sentir que algo se oculta bajo esa calma ilusoria.\n", 30);
            Metodos.slowPrintln("El tercer camino resplandece con un resplandor extraño. No es luz natural, ni parece provenir del sol. Más bien, es como si el aire mismo estuviera distorsionado. \nEntre los árboles se ven destellos, como si espejos invisibles doblaran la realidad. Cada paso que das cerca hace que la luz cambie de forma, \ngenerando ilusiones que pueden confundirte… o guiarte.\n",  30);

        }

        while (inventario) {
            Metodos.slowPrintln(Metodos.red + "1. Camino de las Sombras.", 30);
            Metodos.slowPrintln(Metodos.blue + "2. Camino del Lago Ilusorio.", 30);
            Metodos.slowPrintln(Metodos.purple + "3. Camino de la Luz Distorsionada.", 30);
            Metodos.slowPrintln(Metodos.green + "4. Ver inventario." + Metodos.reset, 30);
            choiceRoutes = errores.comprobar(sc, "Ahora, con tu compañero a tu lado y el cruce de caminos frente a ti, debes decidir cómo continuar tu viaje.\n",1, 4);

            switch (choiceRoutes) {
                case 1-> {
                    inventario = false;
                    FireRoute.inicioFireRoute();
                }
                case 2 -> {
                    inventario = false;
                    WaterRoute.waterRoute();
                }
                case 3 -> {
                    inventario = false;
                    PoisonRoute.inicioPoisonRoute();
                }
                case 4 -> {
                    opcion = false;
                    Metodos.verInventario(DatosHistoria.arrayInventario);
                }
            }
        }
    }
}
