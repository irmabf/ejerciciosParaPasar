package utilities;

import java.util.Scanner;

public class ReadData {
	public static String readString() {
		return new Scanner(System.in).nextLine();
	}
	
	public static int readInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static String readString(String msg) {
		System.out.println(msg);
		
		return readString();
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);
		return readInt();
	}
	
	
}
