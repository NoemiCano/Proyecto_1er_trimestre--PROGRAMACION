import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Combates {
    public static void main(String[] args) {
        DatosHistoria.Pokemon = "Ninetales";
        String nombrePokemonElegido = DatosHistoria.Pokemon;
        DatosHistoria.vidaActual = 160;
        int vidaActual = DatosHistoria.vidaActual;

        System.out.println("Tu pokemon "  + nombrePokemonElegido );
        System.out.println("Vida Actual: " + vidaActual);

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

            int escribir = sc.nextInt();
            if (escribir == 1) {

                System.out.println("Has hecho " + danoHecho + " de daño");

                vidaActualDarkrai -= danoHecho;

                if (vidaActualDarkrai > 0){
                    System.out.println("A Darkrai le quedan " + vidaActualDarkrai + "PS");
                } else {
                    System.out.println("ENHORABUENA HAS DERROTADO A DARKRAI");
                }

                System.out.println("Te han hecho esta cantidad de daño " + danoRecibido + "PS");

                vidaActual -=  danoRecibido;

                if (vidaActual > 0){
                    System.out.println("Te quedan " + vidaActual + "PS");
                } else {
                    System.out.println("QUE MAL!! HAS PERDIDO");
                }
            }
            if (escribir == 2) {
                System.out.println("Has hecho " + danoHecho2 + " de daño");

                vidaActualDarkrai -= danoHecho2;

                System.out.println("A Darkrai le quedan  " + vidaActualDarkrai + "PS");

                System.out.println("Te han hecho esta cantidad de daño " + danoRecibido2 + "PS");

                vidaActual -=  danoRecibido2;

                if (vidaActual > 0){
                    System.out.println("Te quedan " + vidaActual + "PS");
                }  else {
                    System.out.println("QUE MAL!! HAS PERDIDO");
                }
            }
            if (escribir == 3) {
                System.out.println("Estos son los objetos que tienes: ");
                turno--;
            }
            if (escribir == 4) {
                System.out.println("No puedes huir ante la presencia de Darkrai");
                System.out.println("Como has intentado huir, Darkrai te ha atacado");

                vidaActual = vidaActual - ataque1Darkrai();

                System.out.println("Darkrai te ha quitado " + ataque1Darkrai() + "PS");

                if (vidaActual > 0){
                    System.out.println("Te quedan " + vidaActual + "PS");
                }  else {
                    System.out.println("QUE MAL!! HAS PERDIDO");
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
