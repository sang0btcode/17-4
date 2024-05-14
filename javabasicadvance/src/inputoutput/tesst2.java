package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tesst2 {
	public static void main(String[] args) {
		String path = "C:\\Users\\LEGION\\eclipse-workspace\\javabasicadvance\\triangle.txt";
		try {
			FileInputStream file = new FileInputStream(path);
			String fileValue = "";
			int data;
			while ((data = file.read()) != -1) {
				fileValue += (char) data;
			}
			System.out.println(fileValue);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
