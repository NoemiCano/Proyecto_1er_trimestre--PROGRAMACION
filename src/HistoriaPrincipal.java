import java.util.Scanner;

public class HistoriaPrincipal {
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
        DatosHistoria.setNombreUsuario(nombreUsuario);
        Metodos.slowPrintln("Hola, " + DatosHistoria.getNombreUsuario(), 40);

        //Inicio de la aventura

        while(true) {
            Metodos.slowPrintln("¿Quieres iniciar la aventura?", 40);
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("si")) {
                Metodos.slowPrintln("Despiertas en tu habitación sin recuerdos claros, aunque todo te resulta familiar... sientes que algo no va bien...", 40);
                Metodos.slowPrintln("Recuerdas que hoy debes ir con el profesor Oak a elegir tu primer pokemon. Asi que te levantas de la cama y vas hacia el centro pokemon de tu ciudad", 40);
                break;
            }

            if (decision.equalsIgnoreCase("no")) {
                Metodos.slowPrintln("Juego terminado. ¡Hasta pronto!", 40);
                System.exit(0);
            } else {
                Metodos.slowPrintln("Por favor, escribe 'si' o 'no'.", 40);
            }
        }

        System.out.println("------------------\n");

        Metodos.slowPrintln("El profesor te da a elegir entre los siguientes tres Pokemons: \n", 40);
        Metodos.slowPrintln("- Vulpix: pokemon tipo Fuego. Útil contra las sombras y la oscuridad", 40);
        Metodos.slowPrintln("- Staryu: pokemon tipo Agua. Útil para atravesar lagos y rios", 40);
        Metodos.slowPrintln("- Nidoran: pokemon tipo Veneno. Útil contra las ilusiones y reflejos", 40);

        //Eleccion de pokemon

        while(true) {

            String pokemon;
            String ataqueUno;
            String ataqueDos;
            int vidaInicio;

            Metodos.slowPrintln("¿A quien quieres elegir?", 40);
            String EleccionPokemon = sc.nextLine();

            if (EleccionPokemon.equalsIgnoreCase("Vulpix")) {

                pokemon = "Vulpix";
                ataqueUno = "'Llamarada' tiene un rango de dato de 0 a 60";
                ataqueDos = "'Placaje'  tiene un rango de dato de 0 a 40";
                vidaInicio = DatosPokemon.vidaVulpix();

                Metodos.slowPrintln("Has elegido a, " + pokemon + ". \nAhora te acompañará durante tu aventura.", 40);
                Metodos.slowPrintln("Su vida es de, " + vidaInicio + " y sus ataques son " + ataqueUno + " y " + ataqueDos, 40);
                DatosHistoria.setPokemon(pokemon);
                DatosHistoria.setvidaInicial(vidaInicio);
                break;

            } else if (EleccionPokemon.equalsIgnoreCase("Staryu")) {

                pokemon = "Staryu";
                ataqueUno = "'Hidropulso' tiene un rango de dato de 0 a 60";
                ataqueDos = "'Placaje' tiene un rango de dato de 0 a 40";
                vidaInicio = DatosPokemon.vidaStaryu();

                Metodos.slowPrintln("Has elegido a, " + pokemon + ". \nAhora te acompañará durante tu aventura.", 40);
                Metodos.slowPrintln("Su vida es de, " + vidaInicio + " y sus ataques son " + ataqueUno + " y " + ataqueDos, 40);
                DatosHistoria.setPokemon(pokemon);
                DatosHistoria.setvidaInicial(vidaInicio);
                break;

            } else if (EleccionPokemon.equalsIgnoreCase("Nidoran")) {

                pokemon = "Nidoran";
                ataqueUno = "'Onda toxica' tiene un rango de dato de 0 a 60";
                ataqueDos = "'Placaje' tiene un rango de dato de 0 a 40";
                vidaInicio = DatosPokemon.vidaNidoran();

                Metodos.slowPrintln("Has elegido a, " + pokemon + ". \nAhora te acompañará durante tu aventura.", 40);
                Metodos.slowPrintln("Su vida es de, " + vidaInicio + " y sus ataques son " + ataqueUno + " y " + ataqueDos, 40);
                DatosHistoria.setPokemon(pokemon);
                DatosHistoria.setvidaInicial(vidaInicio);
                break;

            } else {
                Metodos.slowPrintln("Por favor, escribe el nombre del pokemon que deseas seleccionar: Vulpix, Staryu o Nidoran.", 40);
            }
        }

        //Eleccion de inventario




        System.out.println("Has elegido: " + DatosHistoria.getPokemon());

        System.out.println("Quieres hacer un ataque? ");
        int ataque = sc.nextInt();
        if(ataque == 1) {
            System.out.println(Metodos.ataque1());
        }













    }
}
