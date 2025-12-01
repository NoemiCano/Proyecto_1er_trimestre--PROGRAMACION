import java.util.Random;

public class DatosPokemon {

    static Random random = new Random();

    public static int vidaVulpix() {
        int totalVida = 100;
        return totalVida;
    }

    public static int vidaStaryu() {
        int totalVida = 110;
        return totalVida;
    }

    public static int vidaNidoran() {
        int totalVida = 120;
        return totalVida;
    }

    public static int vidaDarkrai() {
        int totalVida = 180;
        return totalVida;
    }

    public static int ataque1Vulpix(){
        int damage = random.nextInt(0, 61);
        return damage;
    }

    public static int ataque2Vulpix(){
        int damage = random.nextInt(0, 41);
        return damage;
    }

    public static int ataque1Staryu(){
        int damage = random.nextInt(0, 61);
        return damage;
    }

    public static int ataque2Staryu(){
        int damage = random.nextInt(0, 41);
        return damage;
    }

    public static int ataque1Nidoran(){
        int damage = random.nextInt(0, 61);
        return damage;
    }

    public static int ataque2Nidoran(){
        int damage = random.nextInt(0, 41);
        return damage;
    }




}
