package FileHandling.Reading.Bytes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To read the file contents, you can call the readAllBytes() method on the inputStream object. 
 * This reads the file as byte values – essentially, small units of data that represent characters, numbers, or other file content – and returns them as a byte array. 
 * A byte array is simply a sequence of these byte values, which you can use for tasks like printing the file’s contents to the console.
 */

public class Main {
    public static void main(String[] args) {
        File myTest = new File("src/myTestFile.txt");
        try (FileInputStream inputStream = new FileInputStream(myTest)) {
            byte[] fileContentsAsBytes = inputStream.readAllBytes();
            for (int index = 0; index < fileContentsAsBytes.length; index++) {
                System.out.println((char) fileContentsAsBytes[index]);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
