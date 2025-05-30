class Camera {
    // Method to take a picture with default settings
    public void takePicture() {
        System.out.println("Taking an 8 megapixels picture in portrait mode.");
    }
    // Method to take a picture with a specific mode
    public void takePicture(String mode) {
        System.out.println("Taking picture in " + mode + " mode.");
    }
    // Method to take a picture with a specific resolution
    public void takePicture(int resolution) {
        System.out.println("Taking picture in " + resolution + " megapixels.");
    }
    // Method to take a picture with a specific mode and resolution
    public void takePicture(String mode, int resolution) {
        System.out.println("Taking a " + resolution + " megapixels picture in " + mode + " mode.");
    }
}
class SmartCamera extends Camera{
    @Override
    public void takePicture() {

        // Call the superclass version of the method (optional)
        super.takePicture();

        // Add new functionality
        System.out.println("Applying AI to enhance the picture.");
    }
}
public class Polymorphism {
    public static void main(String[] args) {

        // Create a new Camera object
        Camera myFavoriteCamera = new Camera();

        // Take picture with default settings
        myFavoriteCamera.takePicture();

        // Take picture with a specific mode
        myFavoriteCamera.takePicture("portrait");

        // Take picture with a specific resolution
        myFavoriteCamera.takePicture(12);

        // Take picture with a specific mode and resolution
        myFavoriteCamera.takePicture("landscape", 24);

        // Create a new SmartCamera object
        SmartCamera smartCam = new SmartCamera();

        // Take picture using the smart camera with default settings
        System.out.println("\nInitiating smart camera...");
        smartCam.takePicture();

        // Run time polymorphism
        /*
         * Imagine your camera app can switch between a basic Camera and a SmartCamera. 
         * The controls remain the same, but the results differ based on the camera. 
         * In Java, this is like a superclass reference that can refer to subclass objects. 
         * That is the Camera reference referring to the SmartCamera object. 
         * The call to the method takePicture() stays the same but triggers the overridden method from the SmartCamera class because the object belongs to the SmartCamera class, demonstrating Java’s polymorphism. 
         * This allows the app to be flexible and robust without altering the user interface.
         * This allows you to use general code with a superclass reference while benefiting from the subclass's specific behaviors.
         */
        Camera newCamera = new SmartCamera();
        newCamera.takePicture(); // calls method inside smartCamera class
    }
}