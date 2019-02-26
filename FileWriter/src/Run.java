import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Run {
	public static void main(String[] args) throws FileNotFoundException {
		String fileContents = "What happens when you change this?";
		File file = new File("data.txt");
		PrintWriter printWriter = new PrintWriter(file);
		System.out.println("Working...");
		printWriter.print(fileContents);
		printWriter.close();
		System.out.println("Done!");
	}
}