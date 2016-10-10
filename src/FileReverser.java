import java.io.*;

public class FileReverser {

    private void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/book.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("out/production/FileIO/output.txt"));

            String read, toWrite;

            while ((read = reader.readLine()) != null) {
                toWrite = reverseWord(read);
                writer.write(toWrite);
                writer.write("\n");
            }

            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Not able to write output.");
        }
    }

    private String reverseWord(String input) {
        return (new StringBuffer(input)).reverse().toString();
    }

    public static void main(String args[]) {
        FileReverser f = new FileReverser();
        f.readFile();
        System.out.println("File is reversed, thank you!");
    }
}
