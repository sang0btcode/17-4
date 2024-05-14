package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class test {
	public static void main(String[] args) {
		String path = "C:\\Users\\LEGION\\eclipse-workspace\\javabasicadvance\\src\\input.txt";
		try {
			File files = new File(path);
			FileInputStream file = new FileInputStream(files);
			int data;
			while ((data = file.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
