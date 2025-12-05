import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Combates {
    public static void main(String[] args) {
        combates();
    }
    public static void combates() {

        String nombrePokemonElegido = DatosHistoria.Pokemon;
        int vidaInicial = Metodos.vidaInicialPokemon();
        DatosHistoria.vidaActual = vidaInicial;
        int vidaActual = DatosHistoria.vidaActual;
        String objetoInicial = DatosHistoria.arrayInventario[0];
        String objetoDos =  DatosHistoria.arrayInventario[1];
        String objetoTres = DatosHistoria.arrayInventario[2];
        String objetoCuatro = DatosHistoria.arrayInventario[3];
        Scanner leer = new Scanner(System.in);



        System.out.println("Tu pokemon "+ Metodos.blue + nombrePokemonElegido + Metodos.reset );
        System.out.println("Vida Actual: "+ Metodos.green + vidaActual + Metodos.reset );

        System.out.println("Inicias el combate contra Darkrai");
        int vidaDarkrai = 180;
        int vidaActualDarkrai = vidaDarkrai;
        int turno = 1;

        while (vidaActual > 0 && vidaActualDarkrai > 0) {

            Scanner sc = new Scanner(System.in);

            System.out.println("------------------------------");
            System.out.println("Estas en el turno: " + turno);
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Hacer el ataque 1");
            System.out.println("2. Hacer el ataque 2");
            System.out.println("3. Abrir el inventario");
            System.out.println("4. Intentar huir");
            System.out.println("------------------------------");
            int danoHecho = Metodos.ataque1();
            int danoHecho2 = Metodos.ataque2();

            int danoRecibido = ataque1Darkrai();
            int danoRecibido2 = ataque2Darkrai();

            String escribir = sc.nextLine();

            if (escribir.equals("1")) {

                System.out.println("Has hecho " + Metodos.red + danoHecho + " de daño" + Metodos.reset);

                vidaActualDarkrai -= danoHecho;

                if (vidaActualDarkrai > 0){
                    System.out.println("A Darkrai le quedan "+ Metodos.green + vidaActualDarkrai + "PS" +  Metodos.reset);
                } else {
                    System.out.println("ENHORABUENA HAS DERROTADO A DARKRAI");
                }

                System.out.println("Te han hecho esta cantidad de daño " + Metodos.red +  danoRecibido + "PS" + Metodos.reset);

                vidaActual -=  danoRecibido;

                if (vidaActual > 0){
                    System.out.println("Te quedan "+ Metodos.green + vidaActual + "PS" + Metodos.reset);
                } else {
                    System.out.println(Metodos.red +"QUE MAL!! HAS PERDIDO" + Metodos.reset);
                }
            }else if (escribir.equals("2")) {
                System.out.println("Has hecho "+ Metodos.red + danoHecho2 + " de daño" + Metodos.reset);

                vidaActualDarkrai -= danoHecho2;

                System.out.println("A Darkrai le quedan  " + Metodos.green + vidaActualDarkrai + "PS" + Metodos.reset);

                System.out.println("Te han hecho esta cantidad de daño "+ Metodos.red + danoRecibido2 + "PS" + Metodos.reset);

                vidaActual -=  danoRecibido2;

                if (vidaActual > 0){
                    System.out.println("Te quedan "+ Metodos.green + vidaActual + "PS" + Metodos.reset);
                }  else {
                    System.out.println(Metodos.red +"QUE MAL!! HAS PERDIDO" + Metodos.reset);
                }
            }else if (escribir.equals("3")) {

                Random rnd = new Random();
                int r = rnd.nextInt(1,3);

                if (vidaActual != vidaInicial){
                    if (objetoInicial.equalsIgnoreCase("Poción de vida") || objetoDos.equalsIgnoreCase("Poción de vida")) {

                        String Poción = "";
                        System.out.println("Tienes la Poción de vida en tu inventario ¿La quieres usar?");
                        Poción = leer.nextLine();

                        if (Poción.equalsIgnoreCase("Si")) {
                            vidaActual = vidaActual + 30;
                            System.out.println("Tu vida ahora es de : " + Metodos.green + vidaActual +  "PS" +Metodos.reset);
                        }

                    }
                }



                if (objetoCuatro != null){
                    if (objetoCuatro.equalsIgnoreCase("Pokeball")){

                        String pokeball = "";
                        System.out.println("Tienes la Pokeball en tu inventario ¿La quieres usar?");
                        pokeball = leer.nextLine();

                        if (pokeball.equalsIgnoreCase("Si")){

                            if (r == 1){
                                Final_Bueno.Final_Bueno();
                                break;
                            }

                            if (r == 2){

                                System.out.println("!MALA SUERTE¡ NO LO HAS ATRAPADO");
                                DatosHistoria.arrayInventario[3] = null;
                            }

                        }


                    }
                }


                turno--;
            } else if (escribir.equals("4")) {
                System.out.println("No puedes huir ante la presencia de Darkrai");
                System.out.println("Como has intentado huir, Darkrai te ha atacado");

                System.out.println("Darkrai te ha quitado "+ Metodos.red + danoRecibido + "PS" + Metodos.reset);
                vidaActual = vidaActual - danoRecibido;


                if (vidaActual > 0){
                    System.out.println(Metodos.green +"Te quedan " + vidaActual + "PS" + Metodos.reset);
                }  else {
                    System.out.println(Metodos.red + "QUE MAL!! HAS PERDIDO" + Metodos.reset);
                }
            } else {
                System.out.println("Introduce un comando valido");
                turno--;
            }

            if (vidaActualDarkrai < 0){
                Final_Neutral.finalNeutral();
            }


            if (vidaActual < 0){
                if (objetoInicial.equals("Revivir")){

                    String revivir = "";
                    System.out.println("Tienes el Revivir en tu inventario ¿Lo quieres usar?");
                    revivir = leer.nextLine();

                    if (revivir.equalsIgnoreCase("Si")){
                       vidaInicial =  vidaInicial / 2;
                       vidaActual = vidaInicial;
                    } else {
                        Final_Malo.Final_Malo();
                    }
                }else {
                    Final_Malo.Final_Malo();
                }
            }



            turno++;
        }
    }


    static int ataque1Darkrai(){
        Random aleatorio = new Random();
        int damage = aleatorio.nextInt(20, 61);
        return damage;
    }

    static int ataque2Darkrai(){
        Random aleatorio = new Random();
        int damage = aleatorio.nextInt(20, 81);
        return damage;
    }
}
