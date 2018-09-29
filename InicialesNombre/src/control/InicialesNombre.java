package control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InicialesNombre {
	
	String fullName;
	
	private static String getInitials(String fullname) {
		
		Pattern p = Pattern.compile("((^| )[A-Za-z])");
		Matcher m = p.matcher(fullname);
		
		String initials = "";
		
		while(m.find()) {
			initials += m.group().trim();
		}
		
		System.out.println(initials.toUpperCase());
		
		
		return initials;
	}
	
	public static void main(String[] args) {
		
		InicialesNombre.getInitials("Irma Blanco Fernandez");

	}

}
