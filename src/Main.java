import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear diccionario Español-Inglés con al menos 20 palabras
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hola", "hello");
        dictionary.put("adios", "goodbye");
        dictionary.put("amor", "love");
        dictionary.put("amigo", "friend");
        dictionary.put("familia", "family");
        dictionary.put("escuela", "school");
        dictionary.put("libro", "book");
        dictionary.put("casa", "house");
        dictionary.put("perro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("comida", "food");
        dictionary.put("ciudad", "city");
        dictionary.put("agua", "water");
        dictionary.put("fuego", "fire");
        dictionary.put("tierra", "earth");
        dictionary.put("aire", "air");
        dictionary.put("cielo", "sky");
        dictionary.put("mar", "sea");
        dictionary.put("montaña", "mountain");
        dictionary.put("nieve", "snow");

        // Escoger al azar 5 palabras en español del mini diccionario
        List<String> spanishWords = new ArrayList<>(dictionary.keySet());
        Collections.shuffle(spanishWords);
        List<String> selectedWords = spanishWords.subList(0, 5);

        // Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        for (String spanishWord : selectedWords) {
            System.out.print("¿Cómo se dice '" + spanishWord + "' en inglés? ");
            String userTranslation = scanner.nextLine().trim().toLowerCase();

            if (dictionary.get(spanishWord).equals(userTranslation)) {
                correctAnswers++;
                System.out.println("¡Correcto!");
            } else {
                incorrectAnswers++;
                System.out.println("Incorrecto. La traducción correcta es '" + dictionary.get(spanishWord) + "'.");
            }
        }

        // Mostrar cuántas respuestas correctas e incorrectas tiene el usuario
        System.out.println("\nRespuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + incorrectAnswers);

        scanner.close();
    }
}
