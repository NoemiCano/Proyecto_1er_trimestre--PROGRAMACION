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
    }


    //Guardamos los datos de la vida inicial para poder usarla en otras funciones

    public static int vidaInicial;

    public static void setVidaInicial(int vidaInicio) { vidaInicial = vidaInicio; }

    public static int getVidaInicial() {
        return vidaInicial;
    }

    //Aquí es donde se debería de ir actualizando la vida actual del pokemon

    public static int vidaActual;



}
