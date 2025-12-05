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
        Metodos.slowPrintln("Hola, " + DatosHistoria.nombreUsuario, 40);

        //Inicio de la aventura

        while(true) {
            Metodos.slowPrintln("¿Quieres iniciar la aventura? Si/No", 40);
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("si")) {
                Metodos.slowPrintln("Despiertas en tu habitación sin recuerdos claros, aunque todo te resulta familiar... sientes que algo no va bien...", 40);
                Metodos.slowPrintln("Pero recuerdas que hoy debes ir con el profesor Oak a elegir tu primer pokemon. Asi que te levantas de la cama y vas hacia el centro pokemon de tu ciudad", 40);
                break;
            }

            if (decision.equalsIgnoreCase("no")) {
                Metodos.slowPrintln("Juego terminado. ¡Hasta pronto!", 40);
                System.exit(0);
            } else {
                Metodos.slowPrintln("Por favor, escribe 'si' o 'no'.", 40);
            }
        }

        Metodos.divider();

        Metodos.slowPrintln("El profesor te da a elegir entre los siguientes tres Pokemons: ", 40);
        Metodos.slowPrintln( Metodos.red + "- Vulpix: pokemon tipo Fuego. Útil contra las sombras y la oscuridad", 40);
        Metodos.slowPrintln(Metodos.blue + "- Staryu: pokemon tipo Agua. Útil para atravesar lagos y rios", 40);
        Metodos.slowPrintln(Metodos.purple + "- Nidoran: pokemon tipo Veneno. Útil contra las ilusiones y reflejos" + Metodos.reset, 40);

        //Eleccion de pokemon

        while(true) {

            String pokemon;
            String ataqueUno;
            String ataqueDos;
            int vidaInicio;

            Metodos.slowPrintln("¿A quien quieres elegir?", 40);
            String EleccionPokemon = sc.nextLine();
            DatosHistoria.Pokemon = EleccionPokemon;

            if (EleccionPokemon.equalsIgnoreCase("Vulpix")) {

                pokemon = "Vulpix";
                ataqueUno = "'Llamarada' que tiene un rango de daño de 0 a 60";
                ataqueDos = "'Placaje' que tiene un rango de daño de 0 a 40";
                vidaInicio = Metodos.vidaInicialPokemon();

                Metodos.slowPrintln("Has elegido a " + pokemon + ". \nY ahora te acompañará durante tu aventura.", 40);
                Metodos.slowPrintln("Su vida es de " + vidaInicio + " y sus ataques son " + ataqueUno + " y " + ataqueDos, 40);
                DatosHistoria.setPokemon(pokemon);
                DatosHistoria.vidaInicial=vidaInicio;
                DatosHistoria.vidaActual=vidaInicio;
                break;

            } else if (EleccionPokemon.equalsIgnoreCase("Staryu")) {

                pokemon = "Staryu";
                ataqueUno = "'Hidropulso' que tiene un rango de daño de 0 a 60";
                ataqueDos = "'Placaje' que tiene un rango de daño de 0 a 40";
                vidaInicio = Metodos.vidaInicialPokemon();

                Metodos.slowPrintln("Has elegido a " + pokemon + ". \nY ahora te acompañará durante tu aventura.", 40);
                Metodos.slowPrintln("Su vida es de " + vidaInicio + " y sus ataques son " + ataqueUno + " y " + ataqueDos, 40);
                DatosHistoria.setPokemon(pokemon);
                DatosHistoria.vidaInicial=vidaInicio;
                DatosHistoria.vidaActual=vidaInicio;
                break;

            } else if (EleccionPokemon.equalsIgnoreCase("Nidoran")) {

                pokemon = "Nidoran";
                ataqueUno = "'Onda toxica' que tiene un rango de daño de 0 a 60";
                ataqueDos = "'Placaje' que tiene un rango de daño de 0 a 40";
                vidaInicio = Metodos.vidaInicialPokemon();

                Metodos.slowPrintln("Has elegido a " + pokemon + ". \nY ahora te acompañará durante tu aventura.", 40);
                Metodos.slowPrintln("Su vida es de " + vidaInicio + " y sus ataques son " + ataqueUno + " y " + ataqueDos, 40);
                DatosHistoria.setPokemon(pokemon);
                DatosHistoria.vidaInicial=vidaInicio;
                DatosHistoria.vidaActual=vidaInicio;
                break;

            } else {
                Metodos.slowPrintln("Por favor, escribe el nombre del pokemon que deseas seleccionar: Vulpix, Staryu o Nidoran.", 40);
            }
        }

        Metodos.slowPrintln("\nEl profesor Oak te dice que vayas a la enfermería del centro pokemon antes de irte.", 40);

        //Elección de inventario

        Metodos.divider();

        Metodos.slowPrintln("Cuando llegas, la enfermera Joy te da a elegir uno de los siguientes objetos que podrán serte de utilidad durante tu viaje", 40);

        Metodos.slowPrintln( Metodos.yellow + "1. Linterna (amplifica la visión en lugares oscuros)", 40);
        Metodos.slowPrintln(Metodos.red + "2. Poción de vida (ayudará a tu pokemon a recuperar algo de vida)", 40);
        Metodos.slowPrintln(Metodos.green+ "3. Revivir (revive a tu pokemon en el caso de quedarse sin vida)" + Metodos.reset, 40);
        Metodos.slowPrintln("Escribe el numero del objeto que quieras obtener ", 40);

        String objetoInventario;

        while (true) {

            objetoInventario = sc.nextLine();

            if (objetoInventario.equalsIgnoreCase("1")) {

                objetoInventario = "Linterna";

                Metodos.slowPrintln("Has elegido la linterna", 40);

                DatosHistoria.setObjetoInicial(objetoInventario);
                DatosHistoria.arrayInventario[0] = DatosHistoria.setObjetoInicial(objetoInventario);
                break;

            } else if (objetoInventario.equalsIgnoreCase("2")) {

                objetoInventario = "Poción de vida";

                Metodos.slowPrintln("Has elegido la poción de vida", 40);
                DatosHistoria.arrayInventario[0] = DatosHistoria.setObjetoInicial(objetoInventario);
                break;

            } else if (objetoInventario.equalsIgnoreCase("3")) {

                objetoInventario = "Revivir";

                Metodos.slowPrintln("Has elegido el revivir", 40);
                DatosHistoria.setObjetoInicial(objetoInventario);
                break;

            } else {
                Metodos.slowPrintln("Por favor, elige un número del 1 al 3", 40);
            }

            DatosHistoria.arrayInventario[0] = objetoInventario;

//            Combates.combates();
        }

        // Elección de ruta

        SelectRoutes.selectRoutes();

        Combates.combates();





        }
    }

