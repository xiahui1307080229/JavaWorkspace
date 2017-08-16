package demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 {
	public static void main(String[] args) {

		File file = new File("pic.txt");

		try {
			FileInputStream fis = new FileInputStream(file);

			InputStreamReader isr = new InputStreamReader(fis);

			BufferedReader bfr = new BufferedReader(isr);

			String str = "";

			while ((str = bfr.readLine()) != null) {

				System.err.println(str);

			}

			bfr.close();

			isr.close();
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
