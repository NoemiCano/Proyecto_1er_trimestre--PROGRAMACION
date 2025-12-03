public class DatosHistoria {
    //Guardamos el nombre del usuario

    public static String nombreUsuario;

    public static void setNombreUsuario(String nombre) {
        nombreUsuario = nombre;
    }

    //Guardamos la elección del pokemon

    public static String Pokemon;

    public static void setPokemon(String pokemon) { Pokemon = pokemon; }


    //Guardamos el objeto inicial

    public static String objetoInicial;

    public static String setObjetoInicial(String objetoInventario) { objetoInicial = objetoInventario; return objetoInicial; }


    //Guardamos los datos de la vida inicial para poder usarla en otras funciones

    public static int vidaInicial;

    //Aquí es donde se debería de ir actualizando la vida actual del pokemon

    public static int vidaActual;

    public static String[] arrayInventario = new String[4];

}
