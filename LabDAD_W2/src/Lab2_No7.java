import java.io.FileWriter;
import java.io.IOException;

public class Lab2_No7 {
    public static void main(String[] args) {
        // The path to the file "Welcome.txt". You can specify a path or leave it like this to create it in the working directory.
        String filePath = "Welcome.txt";
        
        try {
            // Create a FileWriter object - the second parameter 'false' means do not append, overwrite the file. 'true' would append to the file.
            FileWriter writer = new FileWriter(filePath, false);
            
            // Write the string to the file
            writer.write("Welcome To UTeM");
            
            // Close the writer to finalize changes and free system resources.
            writer.close();
            
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
