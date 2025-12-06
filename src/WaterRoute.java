import java.util.Scanner;

public class WaterRoute {

    static Scanner sc = new Scanner(System.in);

    static boolean returnLake = false;

    public static void main(String[] args) {

        waterRoute();
    }
    public static void waterRoute() {

        boolean opcion = true;
        boolean inventario = true;

        if (!returnLake) {

            int choiceWater;
            Metodos.divider();

            while (opcion) {
                Metodos.slowPrintln("Al avanzar por el camino del Lago Ilusorio, el bosque se abre y deja ver un lago de aguas tan claras que parece irreal. \nLa superficie refleja el cielo como si fuera un espejo perfecto, aunque hay algo extraño en él… como si el reflejo tardara un segundo en seguir tus movimientos.\n\n" +
                "A un lado del lago, el agua proyecta una figura que no reconoces del todo, un reflejo que parece llamarte.\n\n" +
                "Más adelante, entre los árboles que rodean el lago, se mueven unas sombras alargadas, casi familiares, que se deslizan sin hacer ruido.\n\n" +
                "Y al observar el centro del lago, parece que podría cruzarse nadando, aunque no estás seguro de si tu Pokémon podrá seguir tu ritmo o si será demasiado peligroso.\n", 30);

                opcion = false;
            }

            while (inventario) {
                Metodos.slowPrintln(Metodos.purple + "1. Reflejo", 30);
                Metodos.slowPrintln(Metodos.green + "2. Sombras", 30);
                Metodos.slowPrintln(Metodos.blue + "3. Cruzar nadando el lago", 30);
                Metodos.slowPrintln(Metodos.green + "4. Ver inventario" + Metodos.reset, 30);
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

            Metodos.divider();

            Metodos.slowPrintln("Sin pensarlo dos veces, decides huir. Retrocedes con cuidado por el mismo camino, evitando el contacto directo, \nmientras tu Pokémon sufre daño por las sombras que lo rozan. \nLa carrera es tensa y rápida, y cada paso hace que tu corazón lata con fuerza.\n", 30);

            DatosHistoria.vidaActual -= 5;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n", 30);

            Metodos.slowPrintln("Finalmente, llegas al borde del lago. El agua sigue brillando con su luz misteriosa y calma, como si nada hubiera pasado, \npero el recuerdo de las sombras permanece. \nAhora debes decidir tu próximo paso con cuidado.\n", 30);
            opcion = false;
        }

        while (inventario) {
            Metodos.slowPrintln(Metodos.purple + "1. Reflejo", 30);
            Metodos.slowPrintln(Metodos.green + "2. Sombras", 30);
            Metodos.slowPrintln(Metodos.blue + "3. Cruzar nadando el lago", 30);
            Metodos.slowPrintln(Metodos.green + "4. Ver inventario" + Metodos.reset, 30);
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
            Metodos.slowPrintln("Apenas te acercas al borde del lago, el reflejo comienza a distorsionarse como si el agua temblara sin motivo. \nPor un instante, ves una figura que parece imitar tus movimientos… pero no a la perfección. \nAntes de que puedas reaccionar, sientes un ligero mareo, como si el mundo se inclinara bajo tus pies.\n", 30);

            Metodos.slowPrintln("Parpadeas un par de veces y, cuando recuperas el equilibrio, ya no estás donde creías estar. Te encuentras de nuevo frente al lago, \nexactamente en el mismo punto donde habías comenzado. No recuerdas qué acaba de ocurrir, solo una sensación de vacío y confusión recorriendo tu mente.\n", 30);

            Metodos.slowPrintln("Vuelves a observar el agua, dudando si lo que viste fue real o producto de tu imaginación. Pero ahora no tienes más remedio: debes volver a elegir qué hacer.\n", 30);
        opcion=false;
        }
        if(returnLake){

            DatosHistoria.vidaActual -= 5;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n", 30);

        }


        while (inventario) {
            Metodos.slowPrintln(Metodos.purple + "1. Reflejo", 30);
            Metodos.slowPrintln(Metodos.green + "2. Sombras", 30);
            Metodos.slowPrintln(Metodos.blue + "3. Cruzar nadando el lago", 30);
            Metodos.slowPrintln(Metodos.green + "4. Ver inventario" + Metodos.reset,30);
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
            Metodos.slowPrintln("Decides adentrarte por el sendero donde se mueven esas sombras silenciosas. A medida que avanzas, \nla luz se vuelve tenue y las figuras se vuelven más nítidas, casi como si te observaran desde el borde del camino. \nSu presencia resulta inquietante, y notas que tu Pokémon se tensa, como si las reconociera… o temiera algo en ellas.\n", 30);
            Metodos.slowPrintln("¡Tienes que reaccionar rápido! Las sombras se aproximan y cada segundo que pasa parecen más agresivas.\n", 30);
            Metodos.slowPrintln("Entre los árboles, al fondo, aparece una luz que podría ser una salida. El lago sigue cerca, \ny podrías retroceder para volver al punto inicial. También cabe la posibilidad de enfrentarte a las sombras.\n", 30);
        opcion = false;
        }

        DatosHistoria.vidaActual -= 5;
        Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n", 30);

        while (inventario) {
            Metodos.slowPrintln(Metodos.purple + "1. Pasar corriendo a través del lago", 30);
            Metodos.slowPrintln(Metodos.blue + "2. Retroceder y volver al lago", 30);
            Metodos.slowPrintln(Metodos.red + "3. Atacar a las sombras", 30);
            Metodos.slowPrintln(Metodos.green + "4. Ver inventario" + Metodos.reset, 30);
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

            Metodos.divider();

        Metodos.slowPrintln("Apenas decides correr hacia la luz, tu corazón late con fuerza. El sendero entre los árboles es estrecho y \nlas sombras se acercan más rápido de lo que esperabas. Tu Pokémon corre a tu lado, pero puedes sentir su tensión en cada paso.\n\n" +
        "La luz al final del camino parece cercana, pero el sendero se bifurca de repente en dos direcciones, \nambas igual de estrechas y con árboles retorcidos que casi bloquean el paso.\n", 30);
            Metodos.slowPrintln("Debes decidir rápido:\n" +
        "¿Tomar el desvío de la izquierda, donde el viento sopla ligeramente y se escucha movimiento entre las hojas…?\n" +
        "¿O el de la derecha, donde todo está completamente silencioso, como si el bosque contuviera el aliento?\n", 30);

        opcion = false;
        }

        DatosHistoria.vidaActual -= 5;
        Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n", 30);

        while (inventario) {
            Metodos.slowPrintln(Metodos.green + "1. Camino de la derecha.", 30);
            Metodos.slowPrintln(Metodos.blue + "2. Camino de la izquierda.", 30);
            Metodos.slowPrintln(Metodos.green + "3. Ver inventario" + Metodos.reset, 30);
        choicePath = errores.comprobar(sc, "¿Qué decides?",1, 3);

        if(choicePath == 1){

            Metodos.divider();

            Metodos.slowPrintln("Eliges continuar por el camino de la derecha, corres sin mirar atrás, sintiendo cómo las sombras se desvanecen poco a poco. \nFinalmente atraviesas el último tramo del bosque y la luz te envuelve de golpe.\n", 30);
            Metodos.slowPrintln(Metodos.green + "Respiras aliviado. Has escapado." + Metodos.reset + "\n",30);

            DatosHistoria.vidaActual -= 5;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n",30);

            inventario = false;
            cofre();

        } else if (choicePath == 2) {

            opcion = true;
            inventario = true;

            while (opcion) {

                Metodos.divider();

                Metodos.slowPrintln("Decides tomar el desvío de la izquierda. El viento se intensifica entre las hojas, haciendo que los árboles crujan de forma inquietante. \nAlgo parece moverse a lo lejos, pero no logras distinguir si son sombras del bosque o simples ramas agitadas.\n",30);

                Metodos.slowPrintln("A medida que avanzas, el sendero se estrecha más y aparece un tronco caído bloqueando parcialmente tu paso. \nTienes varias ideas de cómo continuar. \n",30);

                opcion = false;
            }
            DatosHistoria.vidaActual -= 5;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n",30);

            while (inventario) {
                Metodos.slowPrintln(Metodos.green + "1. Saltar por encima del tronco y arriesgarte a tropezar.",30);
                Metodos.slowPrintln(Metodos.blue + "2. Rodearlo, adentrándote entre la maleza y moviéndote más despacio, pero con más cuidado.",30);
                Metodos.slowPrintln(Metodos.green + "3. Ver inventario." + Metodos.reset,30);
                choicePath = errores.comprobar(sc, "¿Cómo superas el obstáculo?", 1, 3);

                if (choicePath == 1 || choicePath == 2) {
                    inventario = false;
                } else if (choicePath == 3) {
                    opcion = false;
                    Metodos.verInventario(DatosHistoria.arrayInventario);
                }

            }

            Metodos.divider();

            Metodos.slowPrintln("Logras salir del estrecho sendero y finalmente te adentras en una pequeña pradera iluminada por la luz del sol. \n",30);
            Metodos.slowPrintln(Metodos.green + "Respiras aliviado. Has dejado atrás las sombras del bosque." + Metodos.reset + "\n",30);

                DatosHistoria.vidaActual -= 5;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n",30);

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

        String ataque1 = "";
        String ataque2 = "";

        if(DatosHistoria.Pokemon.equalsIgnoreCase("Vulpix")){

            ataque1 = "Llamarada";
            ataque2 = "Placaje";

        }else if(DatosHistoria.Pokemon.equalsIgnoreCase("Staryu")){

            ataque1 = "Hidropulso";
            ataque2 = "Placaje";

        }else if(DatosHistoria.Pokemon.equalsIgnoreCase("Nidoran")){

            ataque1 = "Onda toxica";
            ataque2 = "Placaje";

        }

        Metodos.divider();
        Metodos.slowPrintln("Decides plantar cara a las sombras. Respiras hondo, das un paso firme hacia adelante y tu Pokémon se coloca frente a ti, \ndispuesto a protegerte. Las figuras oscuras se mueven de forma errática, como si \nestuvieran hechas de humo vivo, pero sus ojos brillan con una intención hostil innegable.",30);

        DatosHistoria.vidaActual -= 5;
        Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n",30);

        Metodos.slowPrintln("¿Qué ataque quieres usar?",30);
        Metodos.slowPrintln(Metodos.green + "1. " + ataque1 ,30);
        Metodos.slowPrintln(Metodos.blue + "2. " + ataque2 + Metodos.reset,30);
        choiceAtack = errores.comprobar(sc, "",1, 2);

        if(choiceAtack == 1){
            Metodos.ataque1();
            Metodos.slowPrintln("Tu pokemon ha utilizado " + ataque1 + " cantidad de daño: " + Metodos.ataque1(),30);
        }else if(choiceAtack == 2){
            Metodos.ataque2();
            Metodos.slowPrintln("Tu pokemon ha utilizado " + ataque2 + " cantidad de daño: " + Metodos.ataque2(),30);
        }

        if(Metodos.ataque1() >= 20 || Metodos.ataque2() >= 20){

            DatosHistoria.vidaActual -= 5;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset + "\n",30);
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

        Metodos.slowPrintln("Corres hacia el borde del lago y te lanzas al agua. El impacto es frío, mucho más de lo que esperabas. La \ntemperatura te golpea como una cuchilla y te obliga a patalear con fuerza para mantenerte a flote. El agua \nes extrañamente pesada, como si te envolviera y quisiera atraerte hacia el fondo.",30);

        if(returnLake){
            DatosHistoria.vidaActual -= 5;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset,30);
        }

        if(DatosHistoria.Pokemon.equalsIgnoreCase("Vulpix")){

            Metodos.slowPrintln("Tu Pokémon de fuego salta detrás de ti, pero en cuanto su cuerpo toca el agua, una \nnube de vapor se eleva a su alrededor. Su energía se desploma casi al instante. \n" + Metodos.red + "¡Tu Pokémon de fuego pierde la mitad de su vida!" + Metodos.reset,30);
            DatosHistoria.vidaActual /= 2;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset,30);
            Metodos.slowPrintln("Finalmente, tras un esfuerzo que parece interminable, alcanzáis la orilla. Ambos caéis sobre la tierra mojada, \nexhaustos, pero a salvo. Tu Pokémon respira con dificultad, pero sigue consciente y fuera de peligro inmediato.",30);

            cofre();

        }else if(DatosHistoria.Pokemon.equalsIgnoreCase("Nidoran")){

            Metodos.slowPrintln("Tu Pokémon de veneno salta contigo, sin embargo, en cuanto entra en contacto con el agua, \nsu cuerpo reacciona de forma inesperada. La superficie del lago parece neutralizar \nparte de sus toxinas naturales y su energía disminuye de golpe.",30);
            DatosHistoria.vidaActual /= 2;
            Metodos.slowPrintln("Tu pokemon ha perdido vida. Vida de " + DatosHistoria.Pokemon + " : " + Metodos.red + DatosHistoria.vidaActual + Metodos.reset,30);
            Metodos.slowPrintln("Tras un esfuerzo largo y agotador, conseguís llegar al borde del lago. \nAmbos os desplomáis sobre la hierba húmeda, cansados pero fuera de peligro.",30);

            cofre();

        }else if(DatosHistoria.Pokemon.equalsIgnoreCase("Staryu")){

            Metodos.slowPrintln("En cuanto empieza a nadar, notas cómo el agua a tu alrededor se mueve de manera más fluida. Tu \ncompañero se coloca a tu lado y te impulsa con sus movimientos, guiándote hacia la otra orilla y reduciendo \nel esfuerzo del trayecto. Gracias a su ayuda, avanzáis a gran velocidad.",30);

            Metodos.slowPrintln(Metodos.green + "Tu Pokémon te ayuda a cruzar el lago con facilidad." + Metodos.reset, 30);

            cofre();
        }

    }

    static void cofre(){

        boolean opcion = true;
        boolean inventario = true;
        int choiceTreasure;

        while(opcion){

            Metodos.divider();

            Metodos.slowPrintln("Frente a ti, se abre una pequeña explanada circular iluminada por el sol. En el centro, sobre una roca plana, \ndescansa un cofre antiguo, cubierto de polvo y con un brillo tenue alrededor del cierre. \nNo hay señales de peligro, pero el silencio que lo rodea resulta extraño.\n",30);

        opcion = false;
        }
        while(inventario){
            Metodos.slowPrintln("Ahora tienes una nueva elección:\n",30);
            Metodos.slowPrintln(Metodos.green + "1. ¿Abrir el cofre y descubrir qué guarda en su interior?",30);
            Metodos.slowPrintln(Metodos.red + "2. ¿O ignorarlo y continuar tu camino sin mirar atrás?",30);
            Metodos.slowPrintln(Metodos.green + "3. Ver inventario." + Metodos.reset,30);
        choiceTreasure = errores.comprobar(sc, "¿Qué decides?",1, 3);

        if(choiceTreasure == 1){

            inventario = false;
            int pokeball = Metodos.random.nextInt(0, 101);
            Metodos.slowPrintln("Abres el cofre y encuentras una " + Metodos.green + "Poción de vida" + Metodos.reset + " y una " + Metodos.green + "Piedra de Evolución de Agua." + Metodos.reset + "\n",30);

            DatosHistoria.arrayInventario[1] = "Poción de vida";
            DatosHistoria.arrayInventario[2] = "Piedra Agua";

            if(pokeball >= 50){
                Metodos.slowPrintln("Además, tienes suerte y encuentras una pokeball ¿Te servirá para algo en el resto de tu aventura?",30);

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

        Metodos.divider();

        Metodos.slowPrintln("¿Estás seguro de qué quieres ignorar el cofre?",30);
        choiceTreasure = errores.comprobarString(sc, "Escribe 'Si' para abrir el cofre o 'No' para continuar. \n");

        if(choiceTreasure.equalsIgnoreCase("Si")){

            int pokeball = Metodos.random.nextInt(0, 101);

            Metodos.divider();

            Metodos.slowPrintln("Abres el cofre y encuentras una " + Metodos.green + "Poción de vida" + Metodos.reset + " y una " + Metodos.green + "Piedra de Evolución de Agua." + Metodos.reset + "\n",30);

                    DatosHistoria.arrayInventario[1] = "Poción de vida";
                    DatosHistoria.arrayInventario[2] = "Piedra Agua";

            if(pokeball >= 50){
                Metodos.slowPrintln("Además, tienes suerte y encuentras una pokeball ¿Te servirá para algo en el resto de tu aventura?",30);

                        DatosHistoria.arrayInventario[3] = "Pokeball";

            }

            Evolucion.evolucionPokemon(sc);

        }else if(choiceTreasure.equalsIgnoreCase("No")){
            cofreComprobar();
        }
    }
}