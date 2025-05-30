public class Strings {
    public static void main(String[] args) {

        // Strings are immutable, In the context of Strings, it means that once you
        // create a String, you cannot modify it.
        String languageName = "Java";
        System.out.println(languageName.charAt(0));

        // This actually creates a new string, it doesn't change the original "Java"
        /*
         * NOTE :
         * Even though it looks like we're changing languageName, Java actually creates
         * a new String, "Python", and makes languageName point to this new String.
         * The original "Java" String remains unchanged, floating in the computer's
         * memory.
         */
        languageName = "Python";

        System.out.println(languageName.charAt(0));
        System.out.println(languageName.length());
        System.out.println(languageName.substring(0, 2));
        System.out.println(languageName.equals("Python"));
        System.out.println(languageName.toLowerCase());

        // B is capital
        String fruit = "Banana";

        System.out.println("The fruit \"" + fruit + "\" contains the substring \"ana\": " + fruit.contains("ana"));
        System.out.println("The fruit \"" + fruit + "\" contains the substring \"brooks\": " + fruit.contains("brooks"));
        System.out.println("The fruit \"" + fruit + "\" with character \"a\" replaced with character \"o\": " + fruit.replace('a','o'));

        // indexOf returns -1 if character is not present
        System.out.println(fruit.indexOf('z'));
    }
}
