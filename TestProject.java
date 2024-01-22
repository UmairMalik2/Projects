import java.io.*;

public class TestProject {
    private BufferedReader inputFileReader;
    
    public static void main(String [] args) {
        TestProject article = new TestProject("datafile.txt");
    }
    
    public TestProject(String filename) {
        try {
            inputFileReader = new BufferedReader(new FileReader(filename));
            if (inputFileReader == null) {
                System.out.println("Error: you must open the file first!");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}