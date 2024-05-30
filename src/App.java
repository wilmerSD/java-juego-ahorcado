import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Clase scanner que nos permite que el usaurio escriba
        Scanner scanner = new Scanner(System.in);
        String secret_world = "inteligencia";
        int maximun_attemps = 10;
        int attemps = 0;
        boolean guessed_world = false;

        // Arreglos
        char[] guessed_letters = new char[secret_world.length()];

        // Estructura de control iterativa (Bucle)
        for (int i = 0; i < guessed_letters.length; i++) {
            guessed_letters[i] = '_';
        }

        while (!guessed_world && attemps < maximun_attemps) {
            System.out.println(
                    "Palabra a adivinar " + String.valueOf(guessed_letters) + secret_world.length() + " letras");
            System.out.println("Ingrese una letra por favor");

            char letter = Character.toLowerCase(scanner.next().charAt(0));

            boolean letter_correct = false;

            // Estructura de control iterativa (Bucle)

            for (int i = 0; i < secret_world.length(); i++) {
                // Estrutura de control condicional
                if (secret_world.charAt(i) == letter) {
                    guessed_letters[i] = letter;
                    letter_correct = true;
                }
            }

            if (!letter_correct) {
                attemps++;
                System.out.println("Incorrecto! Te queda: " + (maximun_attemps - attemps) + " intentos.");
            }
            System.out.println(guessed_letters);
            if (String.valueOf(guessed_letters).equals(secret_world)) {
                guessed_world = true;
                System.out.println("Felicidades has adivinado la palabra secreta: " + guessed_world);
            }
        }
        if (!guessed_world) {
            System.out.println("Que pena te has quedado sin intentos");
        }
        scanner.close();
    }
}
