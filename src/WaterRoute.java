import java.util.Scanner;

public class WaterRoute {

    static Scanner sc = new Scanner(System.in);

    static boolean returnLake = false;

    public static void main(String[] args) {

        waterRoute();
    }
    public static void waterRoute() {

        DatosHistoria.Pokemon = "Vulpix";
        if (!returnLake) {

        int choiceWater;
        Metodos.divider();

        Metodos.slowPrintln("Al avanzar por el camino del Lago Ilusorio, el bosque se abre y deja ver un lago de aguas tan claras que parece irreal. La superficie refleja el cielo como si fuera un espejo perfecto, aunque hay algo extraño en él… como si el reflejo tardara un segundo en seguir tus movimientos.\n" +
        "A un lado del lago, el agua proyecta una figura que no reconoces del todo, un reflejo que parece llamarte.\n" +
        "Más adelante, entre los árboles que rodean el lago, se mueven unas sombras alargadas, casi familiares, que se deslizan sin hacer ruido.\n" +
        "Y al observar el centro del lago, parece que podría cruzarse nadando, aunque no estás seguro de si tu Pokémon podrá seguir tu ritmo o si será demasiado peligroso.\n", 5);

        System.out.println(Metodos.purple + "1. Reflejo");
        System.out.println(Metodos.green + "2. Sombras");
        System.out.println(Metodos.blue + "3. Cruzar nadando el lago" + Metodos.reset);
        choiceWater = errores.comprobar(sc, "¿Qué decides?",1, 3);

        switch (choiceWater) {
            case 1-> reflejos();
            case 2 -> sombras();
            case 3 -> nadar();
            case 4 -> Metodos.verInventario(DatosHistoria.arrayInventario);
        }
        }else  {

            int choiceWater;
            Metodos.divider();

            System.out.println("Sin pensarlo dos veces, decides huir. Retrocedes con cuidado por el mismo camino, evitando el contacto directo, mientras tu Pokémon sufre daño por las sombras que lo rozan. La carrera es tensa y rápida, y cada paso hace que tu corazón lata con fuerza.\n");

            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            System.out.println("Finalmente, llegas al borde del lago. El agua sigue brillando con su luz misteriosa y calma, como si nada hubiera pasado, pero el recuerdo de las sombras permanece. Ahora debes decidir tu próximo paso con cuidado.\n");

            System.out.println(Metodos.purple + "1. Reflejo");
            System.out.println(Metodos.green + "2. Sombras");
            System.out.println(Metodos.blue + "2. Cruzar nadando el lago \n" + Metodos.reset);
            choiceWater = errores.comprobar(sc, "¿Qué decides?",1, 3);

            switch (choiceWater) {
                case 1-> reflejos();
                case 2 -> sombras();
                case 3 -> nadar();
            }
        }
    }

    static void reflejos(){

        int choiceWater;
        Metodos.divider();

        System.out.println("Apenas te acercas al borde del lago, el reflejo comienza a distorsionarse como si el agua temblara sin motivo. Por un instante, ves una figura que parece imitar tus movimientos… pero no a la perfección. Antes de que puedas reaccionar, sientes un ligero mareo, como si el mundo se inclinara bajo tus pies.\n");

        System.out.println("Parpadeas un par de veces y, cuando recuperas el equilibrio, ya no estás donde creías estar. Te encuentras de nuevo frente al lago, exactamente en el mismo punto donde habías comenzado. No recuerdas qué acaba de ocurrir, solo una sensación de vacío y confusión recorriendo tu mente.\n");

        System.out.println("Vuelves a observar el agua, dudando si lo que viste fue real o producto de tu imaginación. Pero ahora no tienes más remedio: debes volver a elegir qué hacer.\n");

        if(returnLake){

            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

        }

        System.out.println(Metodos.purple + "1. Reflejo");
        System.out.println(Metodos.green + "2. Sombras");
        System.out.println(Metodos.blue + "3. Cruzar nadando el lago" + Metodos.reset);
        choiceWater = errores.comprobar(sc, "¿Qué decides?",1, 3);

        switch (choiceWater) {
            case 1-> reflejos();
            case 2 -> sombras();
            case 3 -> nadar();
        }

    }

    static void sombras(){

        int choiceShadows;
        Metodos.divider();

        System.out.println("Decides adentrarte por el sendero donde se mueven esas sombras silenciosas. A medida que avanzas, la luz se vuelve tenue y las figuras se vuelven más nítidas, casi como si te observaran desde el borde del camino. Su presencia resulta inquietante, y notas que tu Pokémon se tensa, como si las reconociera… o temiera algo en ellas.");
        System.out.println("¡Tienes que reaccionar rápido! Las sombras se aproximan y cada segundo que pasa parecen más agresivas.");
        System.out.println("Entre los árboles, al fondo, aparece una luz que podría ser una salida. El lago sigue cerca, y podrías retroceder para volver al punto inicial. También cabe la posibilidad de enfrentarte a las sombras.");

        DatosHistoria.vidaActual -= 10;
        System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset);

        System.out.println(Metodos.purple + "1. Pasar corriendo através del lago");
        System.out.println(Metodos.blue + "2. Retroceder y volver al lago");
        System.out.println(Metodos.red + "3. Atacar a las sombras." + Metodos.reset);
        choiceShadows = errores.comprobar(sc, "¿Qué decides?",1, 3);

        switch (choiceShadows) {
            case 1-> pasar();
            case 2 -> {
                returnLake = true;
                waterRoute();
            }
            case 3 -> atacar();
        }

    }

    static void pasar(){

        int choicePath;

        System.out.println("Apenas decides correr hacia la luz, tu corazón late con fuerza. El sendero entre los árboles es estrecho y las sombras se acercan más rápido de lo que esperabas. Tu Pokémon corre a tu lado, pero puedes sentir su tensión en cada paso.\n" +
        "La luz al final del camino parece cercana, pero el sendero se bifurca de repente en dos direcciones, ambas igual de estrechas y con árboles retorcidos que casi bloquean el paso.");
        System.out.println("Debes decidir rápido:\n" +
        "¿Tomar el desvío de la izquierda, donde el viento sopla ligeramente y se escucha movimiento entre las hojas…?\n" +
        "¿O el de la derecha, donde todo está completamente silencioso, como si el bosque contuviera el aliento?");

        DatosHistoria.vidaActual -= 10;
        System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset);

        System.out.println(Metodos.green + "1. Camino de la derecha.");
        System.out.println(Metodos.blue + "2. Camino de la izquierda." + Metodos.reset);
        choicePath = errores.comprobar(sc, "¿Qué decides?",1, 2);

        if(choicePath == 1){

            System.out.println("Eliges continuar por el camino de la derecha, corres sin mirar atrás, sintiendo cómo las sombras se desvanecen poco a poco. Finalmente atraviesas el último tramo del bosque y la luz te envuelve de golpe.");
            System.out.println(Metodos.green + "Respiras aliviado. Has escapado." + Metodos.reset + "\n");

            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            cofre();

        } else if (choicePath == 2){

            System.out.println("Decides tomar el desvío de la izquierda. El viento se intensifica entre las hojas, haciendo que los árboles crujan de forma inquietante. \nAlgo parece moverse a lo lejos, pero no logras distinguir si son sombras del bosque o simples ramas agitadas.");

            System.out.println("A medida que avanzas, el sendero se estrecha más y aparece un tronco caído bloqueando parcialmente tu paso. Tienes varias ideas de cómo continuar. ");

            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            System.out.println(Metodos.green + "1. Saltar por encima del tronco y arriesgarte a tropezar.");
            System.out.println(Metodos.blue + "2. Rodearlo, adentrándote entre la maleza y moviéndote más despacio, pero con más cuidado." + Metodos.reset);
            choicePath = errores.comprobar(sc, "¿Cómo superas el obstáculo?",1, 2);

            System.out.println("Logras salir del estrecho sendero y finalmente te adentras en una pequeña pradera iluminada por la luz del sol.");
            System.out.println(Metodos.green + "Respiras aliviado. Has dejado atrás las sombras del bosque." + Metodos.reset + "\n");

            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            cofre();

        }
    }

    static void atacar() {
        int choiceAtack;
        Metodos.divider();
        System.out.println("Decides enfrentarte contra las sombras con tu pokemon");

        DatosHistoria.vidaActual -= 10;
        System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

        System.out.println("¿Qué ataque quieres usar?");
        System.out.println(Metodos.green + "1. Ataque 1.");
        System.out.println(Metodos.blue + "2. Ataque 2" + Metodos.reset);
        choiceAtack = errores.comprobar(sc, "¿---?",1, 2);

        if(choiceAtack == 1){
            Metodos.ataque1();
            System.out.println("Tu pokemon ha utilizado XXX cantidad de daño: " + Metodos.ataque1());
        }else if(choiceAtack == 2){
            Metodos.ataque2();
            System.out.println("Tu pokemon ha utilizado XXX cantidad de daño: " + Metodos.ataque2());
        }

        if(Metodos.ataque1() >= 20 || Metodos.ataque2() >= 20){

            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");
            System.out.println(Metodos.green + "Consigues atacar a las sombras y huir con éxito." + Metodos.reset + "\n");

            System.out.println("Finalmente atraviesas el último tramo del bosque y la luz te envuelve de golpe.");
            cofre();

        }else{
            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            System.out.println("Las sombras consiguen esquivar tu ataque y te atacan de nuevo. ¡Tu pokemon vuelve a perder vida!");
            System.out.println("Sales corriedo con él para protegerle.");

            DatosHistoria.vidaActual -= 20;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            System.out.println("Finalmente atraviesas el último tramo del bosque y la luz te envuelve de golpe.");
            cofre();

        }

    }

    static void nadar(){

        System.out.println("Decides tirarte al lago y ----");

        if(returnLake){
            DatosHistoria.vidaActual -= 10;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset);
        }

        if(DatosHistoria.Pokemon.equalsIgnoreCase("Vulpix")){

            System.out.println("Tu pokemon es de fuego ¡Pierde la mitad de su vida!");
            DatosHistoria.vidaActual /= 2;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset);
            System.out.println("Consigues ayudarle a cruzar el lago y sobrevivís los dos. ");

            cofre();

        }else if(DatosHistoria.Pokemon.equalsIgnoreCase("Nidoran")){

            System.out.println("Tu pokemon es de sombra ¡Pierde la mitad de su vida!");
            DatosHistoria.vidaActual /= 2;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset);
            System.out.println("Consigues ayudarle a cruzar el lago y sobrevivís los dos. ");

            cofre();

        }else if(DatosHistoria.Pokemon.equalsIgnoreCase("Staryu")){

            System.out.println("Tu pokemon tiene afinidad con el agua y te ayuda a cruzar el lago a mayor velocidad ¡Ambos conseguís cruzar con vida!");

            cofre();
        }

    }

    static void cofre(){

        int choiceTreasure;

        System.out.println("Frente a ti, se abre una pequeña explanada circular iluminada por el sol. En el centro, sobre una roca plana, descansa un cofre antiguo, cubierto de polvo y con un brillo tenue alrededor del cierre. No hay señales de peligro, pero el silencio que lo rodea resulta extraño.");

        System.out.println("Ahora tienes una nueva elección:\n");
        System.out.println(Metodos.green + "1. ¿Abrir el cofre y descubrir qué guarda en su interior?");
        System.out.println(Metodos.red + "2. ¿O ignorarlo y continuar tu camino sin mirar atrás?" + Metodos.reset);
        choiceTreasure = errores.comprobar(sc, "¿Qué decides?",1, 2);

        if(choiceTreasure == 1){

            int pokeball = Metodos.random.nextInt(0, 101);
            System.out.println("Abres el cofre y encuentras una " + Metodos.green + "Poción de vida" + Metodos.reset + " y una " + Metodos.green + "Piedra de Evolución de Agua." + Metodos.reset);

            for(int i = 0; i < DatosHistoria.arrayInventario.length; i++){

                if(DatosHistoria.arrayInventario[i].equals(null)){
                    DatosHistoria.arrayInventario[i] = "Poción de vida";
                    DatosHistoria.arrayInventario[i++] = "Piedra Agua";
                    break;
                }
            }

            if(pokeball >= 50){
                System.out.println("Además, tienes suerte y encuentras una pokeball ¿Te servirá para algo en el resto de tu aventura?");

                for(int i = 0; i < DatosHistoria.arrayInventario.length; i++){

                    if(DatosHistoria.arrayInventario[i].equals(null)){
                        DatosHistoria.arrayInventario[i] = "Pokeball";
                        break;
                    }
                }
            }


        }else if(choiceTreasure == 2){
            cofreComprobar();
        }
    }

    static void cofreComprobar(){

        String choiceTreasure;

        System.out.println("¿Estás seguro de qué quieres ignorar el cofre?");
        choiceTreasure = errores.comprobarString(sc, "Escribe 'Si' para abrir el cofre o 'No' para continuar. ");

        if(choiceTreasure.equalsIgnoreCase("Si")){

            int pokeball = Metodos.random.nextInt(0, 101);
            System.out.println("Abres el cofre y encuentras -Poción- -Piedra evolución Agua-");

            if(pokeball >= 50){
                System.out.println("Tienes suerte y consigues una pokeball ¿Te servirá para algo en el resto de tu aventura?");
            }

        }else if(choiceTreasure.equalsIgnoreCase("No")){
            cofreComprobar();
        }

    }

}
