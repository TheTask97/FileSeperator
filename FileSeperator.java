package main;

import java.io.*;

public class FileSeperator {

	public static void main(String[] args) throws FileNotFoundException {

		
		String createPath;
		String readPath;
		String[] sigma = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String[] sigmaGrossesBoy = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		File f = new File("C:\\BaranTest\\Lesen\\left.txt");
		String s;

		for (int i = 0; i < sigma.length; i++) {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			try {
				BufferedWriter bfw = new BufferedWriter(
						new FileWriter(createPath + sigma[i] + ".txt", true));
				System.out.println(sigmaGrossesBoy[i]);

				while ((s = bfr.readLine()) != null) {
					if (s.startsWith(sigma[i]) || s.startsWith(sigmaGrossesBoy[i])) {
						bfw.write(s + "\r\n");
						bfw.flush();
					}
				}
				bfr.close();
				bfw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
