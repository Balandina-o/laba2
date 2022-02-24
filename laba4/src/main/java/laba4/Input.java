package laba4;

import java.io.*;

final class Input {
	private String s = "";
	public void inut() throws IOException {
		String strLine;
		BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("111.txt")));
		StringBuilder str = new StringBuilder();
		while ((strLine = br.readLine()) != null) {
			str.append(strLine);
			str.append("\n");
		}
		s = s + str.toString();
	}
	
	public String getStr(){
		return s;
	}
}