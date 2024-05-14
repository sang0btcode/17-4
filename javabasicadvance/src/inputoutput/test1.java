package inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
	public static void main(String[] args) {
		try {
			BufferedOutputStream file = new BufferedOutputStream(new FileOutputStream("output.txt"));
			String ms = "50";
			System.out.println("bạn đã in thành công");

			try {
				file.write(ms.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
