import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // clase escaner que permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intento = 0;
        boolean palabraAdivinada = false;

        // CHART
        char[] letraAdivinada = new char[palabraSecreta.length()];

        // estructura de control iterativa(bucle)
        for (int i = 0; i < letraAdivinada.length; i++) {
            letraAdivinada[i] = '_';

        }
        // estructura de control iterativa(bucle)
        while (!palabraAdivinada && intento < intentosMaximos) {
                                                    // esto se usa cuando tenemos una palabra de chars
            System.out.println("palabra a adivinar: " + String.valueOf(letraAdivinada)+ " (" + palabraSecreta.length()+ " letras )");
            System.out.println("Introduce una letra, por favor");

            // usamos la clase scanner para pedir la letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            // estructura de control iterativa(bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {

                // Estructura de control
                if (palabraSecreta.charAt(i) == letra) {
                    letraAdivinada[i] = letra;
                    letraCorrecta = true;

                }
            }
            if (!letraCorrecta) {
                intento ++;
                System.out.println("¡incorrecto! te quedan. " + (intentosMaximos - intento)+ "intentos");
                
            }
            if (String.valueOf(letraAdivinada).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡FELICITACIONES, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("has perdido, ta has quedado sin intentos ¡GAME OVER!");
            
        }
        scanner.close();

    }
}
