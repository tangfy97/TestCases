package Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class scan {
	public int sc() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a random digit: ");
		int text = s.nextInt();
		s.close();
		return text;
	}
	
	public String buffer() throws IOException {
		String everything;
		
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/txt/input.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		} finally {
		    br.close();
		}
		return everything;
	}
}
