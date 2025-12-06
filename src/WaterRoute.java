import java.util.Scanner;

public class WaterRoute {

    static Scanner sc = new Scanner(System.in);

    static boolean returnLake = false;

    public static void main(String[] args) {

        waterRoute();
    }
    public static void waterRoute() {


        DatosHistoria.Pokemon = "Staryu";
        boolean opcion = true;
        boolean inventario = true;

        if (!returnLake) {

            int choiceWater;
            Metodos.divider();

            while (opcion) {
                Metodos.slowPrintln("Al avanzar por el camino del Lago Ilusorio, el bosque se abre y deja ver un lago de aguas tan claras que parece irreal. \nLa superficie refleja el cielo como si fuera un espejo perfecto, aunque hay algo extraño en él… como si el reflejo tardara un segundo en seguir tus movimientos.\n" +
                "A un lado del lago, el agua proyecta una figura que no reconoces del todo, un reflejo que parece llamarte.\n" +
                "Más adelante, entre los árboles que rodean el lago, se mueven unas sombras alargadas, casi familiares, que se deslizan sin hacer ruido.\n" +
                "Y al observar el centro del lago, parece que podría cruzarse nadando, aunque no estás seguro de si tu Pokémon podrá seguir tu ritmo o si será demasiado peligroso.\n", 40);

                opcion = false;
            }

            while (inventario) {
            System.out.println(Metodos.purple + "1. Reflejo");
            System.out.println(Metodos.green + "2. Sombras");
            System.out.println(Metodos.blue + "3. Cruzar nadando el lago");
            System.out.println(Metodos.green + "4. Ver inventario" + Metodos.reset);
            choiceWater = errores.comprobar(sc, "¿Qué decides?", 1, 4);

            switch (choiceWater) {
                case 1 -> {
                    inventario = false;
                    reflejos();
                }
                case 2 -> {
                    inventario = false;
                    sombras();
                }
                case 3 -> {
                    inventario = false;
                    nadar();
                }
                case 4 -> {
                    opcion = false;
                    Metodos.verInventario(DatosHistoria.arrayInventario);
                }
            }
            }
        }else {

            opcion = true;
            inventario = true;

            int choiceWater;
            Metodos.divider();

        while (opcion) {

            System.out.println("Sin pensarlo dos veces, decides huir. Retrocedes con cuidado por el mismo camino, evitando el contacto directo, mientras tu Pokémon sufre daño por las sombras que lo rozan. \nLa carrera es tensa y rápida, y cada paso hace que tu corazón lata con fuerza.\n");

            DatosHistoria.vidaActual -= 5;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            System.out.println("Finalmente, llegas al borde del lago. El agua sigue brillando con su luz misteriosa y calma, como si nada hubiera pasado, pero el recuerdo de las sombras permanece. Ahora debes decidir tu próximo paso con cuidado.\n");
            opcion = false;
        }

        while (inventario) {
        System.out.println(Metodos.purple + "1. Reflejo");
        System.out.println(Metodos.green + "2. Sombras");
        System.out.println(Metodos.blue + "3. Cruzar nadando el lago");
        System.out.println(Metodos.green + "4. Ver inventario" + Metodos.reset);
        choiceWater = errores.comprobar(sc, "¿Qué decides?", 1, 4);

        switch (choiceWater) {
            case 1 -> {
                inventario = false;
                reflejos();
            }
            case 2 -> {
                inventario = false;
                sombras();
            }
            case 3 -> {
                inventario = false;
                nadar();
            }
            case 4 -> {
                opcion = false;
                Metodos.verInventario(DatosHistoria.arrayInventario);
            }
        }
        }
    }
}

    static void reflejos(){

        boolean opcion = true;
        boolean inventario = true;
        int choiceWater;
        Metodos.divider();

        while (opcion) {
        System.out.println("Apenas te acercas al borde del lago, el reflejo comienza a distorsionarse como si el agua temblara sin motivo. Por un instante, ves una figura que parece imitar tus movimientos… pero no a la perfección. Antes de que puedas reaccionar, sientes un ligero mareo, como si el mundo se inclinara bajo tus pies.\n");

        System.out.println("Parpadeas un par de veces y, cuando recuperas el equilibrio, ya no estás donde creías estar. Te encuentras de nuevo frente al lago, exactamente en el mismo punto donde habías comenzado. No recuerdas qué acaba de ocurrir, solo una sensación de vacío y confusión recorriendo tu mente.\n");

        System.out.println("Vuelves a observar el agua, dudando si lo que viste fue real o producto de tu imaginación. Pero ahora no tienes más remedio: debes volver a elegir qué hacer.\n");
        opcion=false;
        }
        if(returnLake){

            DatosHistoria.vidaActual -= 5;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

        }


        while (inventario) {
        System.out.println(Metodos.purple + "1. Reflejo");
        System.out.println(Metodos.green + "2. Sombras");
        System.out.println(Metodos.blue + "3. Cruzar nadando el lago");
        System.out.println(Metodos.green + "4. Ver inventario" + Metodos.reset);
        choiceWater = errores.comprobar(sc, "¿Qué decides?",1, 4);

        switch (choiceWater) {
            case 1-> {
                inventario = false;
                reflejos();
            }
            case 2 -> {
                inventario = false;
                sombras();
            }
            case 3 -> {
                inventario = false;
                nadar();
            }
            case 4 -> {
                opcion = false;
                Metodos.verInventario(DatosHistoria.arrayInventario);
            }
        }
        }

    }

    static void sombras(){

        boolean opcion = true;
        boolean inventario = true;
        int choiceShadows;
        Metodos.divider();

        while (opcion) {
        System.out.println("Decides adentrarte por el sendero donde se mueven esas sombras silenciosas. A medida que avanzas, la luz se vuelve tenue y las figuras se vuelven más nítidas, casi como si te observaran desde el borde del camino. Su presencia resulta inquietante, y notas que tu Pokémon se tensa, como si las reconociera… o temiera algo en ellas.");
        System.out.println("¡Tienes que reaccionar rápido! Las sombras se aproximan y cada segundo que pasa parecen más agresivas.");
        System.out.println("Entre los árboles, al fondo, aparece una luz que podría ser una salida. El lago sigue cerca, y podrías retroceder para volver al punto inicial. También cabe la posibilidad de enfrentarte a las sombras.");
        opcion = false;
        }

        DatosHistoria.vidaActual -= 5;
        System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset);

        while (inventario) {
        System.out.println(Metodos.purple + "1. Pasar corriendo a través del lago");
        System.out.println(Metodos.blue + "2. Retroceder y volver al lago");
        System.out.println(Metodos.red + "3. Atacar a las sombras");
        System.out.println(Metodos.green + "4. Ver inventario" + Metodos.reset);
        choiceShadows = errores.comprobar(sc, "¿Qué decides?",1, 4);

        switch (choiceShadows) {
            case 1-> {
                inventario = false;
                pasar();
            }
            case 2 -> {
                inventario = false;
                returnLake = true;
                waterRoute();
            }
            case 3 -> {
                inventario = false;
                atacar();
            }
            case 4 -> {
                opcion = false;
                Metodos.verInventario(DatosHistoria.arrayInventario);
            }
        }
        }
    }

    static void pasar(){

        boolean opcion = true;
        boolean inventario = true;
        int choicePath;

        while (opcion) {
        System.out.println("Apenas decides correr hacia la luz, tu corazón late con fuerza. El sendero entre los árboles es estrecho y las sombras se acercan más rápido de lo que esperabas. Tu Pokémon corre a tu lado, pero puedes sentir su tensión en cada paso.\n" +
        "La luz al final del camino parece cercana, pero el sendero se bifurca de repente en dos direcciones, ambas igual de estrechas y con árboles retorcidos que casi bloquean el paso.");
        System.out.println("Debes decidir rápido:\n" +
        "¿Tomar el desvío de la izquierda, donde el viento sopla ligeramente y se escucha movimiento entre las hojas…?\n" +
        "¿O el de la derecha, donde todo está completamente silencioso, como si el bosque contuviera el aliento?");

        opcion = false;
        }

        DatosHistoria.vidaActual -= 5;
        System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset);

        while (inventario) {
        System.out.println(Metodos.green + "1. Camino de la derecha.");
        System.out.println(Metodos.blue + "2. Camino de la izquierda.");
        System.out.println(Metodos.green + "3. Ver inventario" + Metodos.reset);
        choicePath = errores.comprobar(sc, "¿Qué decides?",1, 3);

        if(choicePath == 1){

            System.out.println("Eliges continuar por el camino de la derecha, corres sin mirar atrás, sintiendo cómo las sombras se desvanecen poco a poco. Finalmente atraviesas el último tramo del bosque y la luz te envuelve de golpe.");
            System.out.println(Metodos.green + "Respiras aliviado. Has escapado." + Metodos.reset + "\n");

            DatosHistoria.vidaActual -= 5;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            inventario = false;
            cofre();

        } else if (choicePath == 2) {

            opcion = true;
            inventario = true;

            while (opcion) {
                System.out.println("Decides tomar el desvío de la izquierda. El viento se intensifica entre las hojas, haciendo que los árboles crujan de forma inquietante. \nAlgo parece moverse a lo lejos, pero no logras distinguir si son sombras del bosque o simples ramas agitadas.");

                System.out.println("A medida que avanzas, el sendero se estrecha más y aparece un tronco caído bloqueando parcialmente tu paso. Tienes varias ideas de cómo continuar. ");

                opcion = false;
            }
            DatosHistoria.vidaActual -= 5;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            while (inventario) {
                System.out.println(Metodos.green + "1. Saltar por encima del tronco y arriesgarte a tropezar.");
                System.out.println(Metodos.blue + "2. Rodearlo, adentrándote entre la maleza y moviéndote más despacio, pero con más cuidado.");
                System.out.println(Metodos.green + "3. Ver inventario." + Metodos.reset);
                choicePath = errores.comprobar(sc, "¿Cómo superas el obstáculo?", 1, 3);

                if (choicePath == 1 || choicePath == 2) {
                    inventario = false;
                } else if (choicePath == 3) {
                    opcion = false;
                    Metodos.verInventario(DatosHistoria.arrayInventario);
                }

            }


                System.out.println("Logras salir del estrecho sendero y finalmente te adentras en una pequeña pradera iluminada por la luz del sol.");
                System.out.println(Metodos.green + "Respiras aliviado. Has dejado atrás las sombras del bosque." + Metodos.reset + "\n");

                DatosHistoria.vidaActual -= 5;
                System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

                inventario = false;
                cofre();

        } else if (choicePath == 3) {
            opcion = false;
            Metodos.verInventario(DatosHistoria.arrayInventario);
            }

        }
    }

    static void atacar() {
        int choiceAtack;
        Metodos.divider();
        System.out.println("Decides plantar cara a las sombras. Respiras hondo, das un paso firme hacia adelante y tu Pokémon se coloca frente a ti, \ndispuesto a protegerte. Las figuras oscuras se mueven de forma errática, como si \nestuvieran hechas de humo vivo, pero sus ojos brillan con una intención hostil innegable.");

        DatosHistoria.vidaActual -= 5;
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

            DatosHistoria.vidaActual -= 5;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");
            System.out.println(Metodos.green + "El ataque ha surtido efecto" + Metodos.reset + "\n");
            System.out.println("Tú y tu Pokémon emprendéis la huida, dejando atrás el eco inquietante de las criaturas. A medida que avanzáis, las sombras parecen desvanecerse, incapaces de seguir vuestro ritmo después del impacto recibido.\n" +
            "La luz al final del sendero se hace cada vez más fuerte.\n" +
            "Los árboles se abren, el aire se vuelve cálido, y la opresión desaparece poco a poco.\n" +
            "Finalmente, atraviesas el último tramo del bosque y un resplandor suave te envuelve por completo. La oscuridad queda atrás.");

            System.out.println(Metodos.green + "Has escapado" + Metodos.reset + "\n");
            cofre();

        }else{
            DatosHistoria.vidaActual -= 5;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            System.out.println("Las otras sombras se deslizan rápida y silenciosamente alrededor, esquivando gran parte del ataque. Una de ellas se estira como un tentáculo y alcanza a tu Pokémon, rozándolo con violencia. Tu compañero gime de dolor: el contacto con esas criaturas drena su energía como si absorbieran su fuerza vital.");
            System.out.println("Entiendes que pelear directamente solo provocará que tu compañero pierda más vida. \nAgarras a tu Pokemon y huyes lo más rápido posible.");

            DatosHistoria.vidaActual -= 20;
            System.out.println("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n");

            System.out.println("Finalmente, atraviesas un último tramo cubierto de hojas y sientes cómo la luz del exterior envuelve tu cuerpo. \n" + Metodos.green + "La presión en el pecho desaparece. Estás fuera del bosque de sombras."  + Metodos.reset);
            cofre();

        }

    }

    static void nadar(){

        System.out.println("Decides tirarte al lago y ----");

        if(returnLake){
            DatosHistoria.vidaActual -= 5;
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

        boolean opcion = true;
        boolean inventario = true;
        int choiceTreasure;

        while(opcion){
        System.out.println("Frente a ti, se abre una pequeña explanada circular iluminada por el sol. En el centro, sobre una roca plana, descansa un cofre antiguo, cubierto de polvo y con un brillo tenue alrededor del cierre. No hay señales de peligro, pero el silencio que lo rodea resulta extraño.");

        opcion = false;
        }
        while(inventario){
        System.out.println("Ahora tienes una nueva elección:\n");
        System.out.println(Metodos.green + "1. ¿Abrir el cofre y descubrir qué guarda en su interior?");
        System.out.println(Metodos.red + "2. ¿O ignorarlo y continuar tu camino sin mirar atrás?");
        System.out.println(Metodos.green + "3. Ver inventario." + Metodos.reset);
        choiceTreasure = errores.comprobar(sc, "¿Qué decides?",1, 3);

        if(choiceTreasure == 1){

            inventario = false;
            int pokeball = Metodos.random.nextInt(0, 101);
            System.out.println("Abres el cofre y encuentras una " + Metodos.green + "Poción de vida" + Metodos.reset + " y una " + Metodos.green + "Piedra de Evolución de Agua." + Metodos.reset);

            DatosHistoria.arrayInventario[1] = "Poción de vida";
            DatosHistoria.arrayInventario[2] = "Piedra Agua";

            if(pokeball >= 10){
                System.out.println("Además, tienes suerte y encuentras una pokeball ¿Te servirá para algo en el resto de tu aventura?");

                DatosHistoria.arrayInventario[3] = "Pokeball";
            }

            Evolucion.evolucionPokemon(sc);

        }else if(choiceTreasure == 2){
            inventario = false;
            cofreComprobar();
        } else if (choiceTreasure == 3) {
            opcion = false;
            Metodos.verInventario(DatosHistoria.arrayInventario);
        }
        }
    }

    static void cofreComprobar(){

        String choiceTreasure;

        System.out.println("¿Estás seguro de qué quieres ignorar el cofre?");
        choiceTreasure = errores.comprobarString(sc, "Escribe 'Si' para abrir el cofre o 'No' para continuar. ");

        if(choiceTreasure.equalsIgnoreCase("Si")){

            int pokeball = Metodos.random.nextInt(0, 101);
            System.out.println("Abres el cofre y encuentras una " + Metodos.green + "Poción de vida" + Metodos.reset + " y una " + Metodos.green + "Piedra de Evolución de Agua." + Metodos.reset);

                    DatosHistoria.arrayInventario[1] = "Poción de vida";
                    DatosHistoria.arrayInventario[2] = "Piedra Agua";

            if(pokeball >= 50){
                System.out.println("Además, tienes suerte y encuentras una pokeball ¿Te servirá para algo en el resto de tu aventura?");

                        DatosHistoria.arrayInventario[3] = "Pokeball";

            }

            Evolucion.evolucionPokemon(sc);

        }else if(choiceTreasure.equalsIgnoreCase("No")){
            cofreComprobar();
        }

    }
}