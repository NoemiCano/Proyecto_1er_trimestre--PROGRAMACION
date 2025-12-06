import java.util.Scanner;

public class Evolucion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        evolucionPokemon(sc);

    } public static int buscarPiedra(){

        for (int i = 0; i < DatosHistoria.arrayInventario.length; i++) {
            String tienesPiedra = DatosHistoria.arrayInventario[i];

            if (tienesPiedra == null) continue;

            if(tienesPiedra.equalsIgnoreCase("Piedra Lunar") || DatosHistoria.arrayInventario[i].equalsIgnoreCase("Piedra Fuego") || DatosHistoria.arrayInventario[i].equalsIgnoreCase("Piedra Agua")){
                Metodos.slowPrintln("Parece que has obtenido una piedra de evolución.", 40);
                return i;
            }
        }
        return -1;
    }

    public static void evolucionPokemon(Scanner sc) {

        int indicePiedra = buscarPiedra();
        if (indicePiedra == -1) {
            Metodos.slowPrintln("Lamentablemente no sirve para evolucionar a tu pokemon. Debes seguir tu camino", 40);
            return;
        }

        String piedra = DatosHistoria.arrayInventario[indicePiedra];
        String pokemon = DatosHistoria.Pokemon;

        if (piedra.equalsIgnoreCase("Piedra Lunar") && pokemon.equalsIgnoreCase("Nidoran")) {
            preguntarEvolucion(sc, "Nidoking");

        } else if (piedra.equalsIgnoreCase("Piedra Fuego") && pokemon.equalsIgnoreCase("Vulpix")) {
            preguntarEvolucion(sc, "Ninetales");

        } else if (piedra.equalsIgnoreCase("Piedra Agua") && pokemon.equalsIgnoreCase("Staryu")) {
            preguntarEvolucion(sc, "Starmie");

        }
    }

    public static void preguntarEvolucion(Scanner sc, String evolucion) {
        while (true) {

            Metodos.slowPrintln("La piedra de evolución obtenida permite evolucionar a tu Pokémon. ¿Quieres evolucionarlo? (si/no)", 40);
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                DatosHistoria.Pokemon = evolucion;
                Metodos.slowPrintln(Metodos.green + "¡Enhorabuena! Tu Pokémon ha evolucionado a: " + evolucion + Metodos.reset, 40);
                DatosHistoria.vidaActual = Metodos.vidaInicialPokemon();
                break;

            } else if (respuesta.equalsIgnoreCase("no")) {

                Metodos.slowPrintln("¿Estás seguro? (si/no)", 40);
                respuesta = sc.nextLine();

                if (respuesta.equalsIgnoreCase("si")) {
                    break;
                }
                else if (respuesta.equalsIgnoreCase("no")) {
                    continue;
                }
                else {
                    Metodos.slowPrintln(Metodos.red + "Respuesta no válida." + Metodos.reset, 40);
                }

            } else {
                Metodos.slowPrintln(Metodos.red + "Escribe 'si' o 'no'" + Metodos.reset, 40);
            }
        }
    }

}
