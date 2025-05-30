import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Waiting for input ...");
        String input = keyboard.next();
        System.out.println("Entered input: "+input);

        /*
         * When you use nextInt() to read the year, Java might get a little tricky! 
         * After grabbing an integer, Java leaves behind an extra "invisible" newline, 
         * which can mess things up when you try to read the next line of text. 
         * To fix this, you add a simple line of code right after reading the year:  
         * `keyBoard.nextLine(); `
         * This way, everything will run smoothly and Make and Model inputs won't get combined.
         */
    }
}
