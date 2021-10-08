package Toy;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import Calculate.arithmetic;
import Print.display;
import Read.scan;


public class play {
	public static void save2File(String st) throws IOException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		writer.println(st);
		writer.close();
	}
	public static void main(String[] args) throws IOException {
		arithmetic ar = new arithmetic();
		display ds = new display();
		scan sc = new scan();
		int s = sc.sc();
		String str = sc.buffer();
		
		int p = ar.sqr(s);
		int q = ar.neg(s);
		int x = ar.add(p, q);
		
		ds.pt(x);
		ds.pt(str);
		
		save2File(str);
	}
	
}
