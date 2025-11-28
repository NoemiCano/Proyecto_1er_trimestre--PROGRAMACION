public class DatosHistoria {
    //Guardamos el nombre del usuario

    public static String nombreUsuario;

    public static void setNombreUsuario(String nombre) {
        nombreUsuario = nombre;
    }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    //Guardamos la eleccion del pokemon

    public static String Pokemon;

    public static void setPokemon(String pokemon) { Pokemon = pokemon; }

    public static String getPokemon() {
        return Pokemon;
    };


    //Guardamos los datos de la vida para poder usarla en otras funciones

    public static int vidaTotal(){

        int vidaInicio = 0;

        if(Pokemon.equals("Vulpix")){

            vidaInicio = DatosPokemon.vidaVulpix();

        }else if(Pokemon.equals("Nidoran")){

            vidaInicio = DatosPokemon.vidaNidoran();

        }
        return vidaInicio;
    }

    public static int vidaActual;



}
