package pass.gen.pojo;

import java.util.Random;

public class Password {
	private int codigo;
	private int longitud;
	private static int VARIABLE_FIJA = 93842;
	
	
	public int getLongitud() {
		return longitud;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String passAleatoriaGen() {
		
		String pass = "";
		
		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String simbolos = "!@#$%^&*_=+-/€.?<>)";
        String chars = mayus + minus + num + simbolos;
        
        Random rnd = new Random();
        
		for (int i = 0; i < longitud; i++) {
			pass += String.valueOf(chars.charAt(rnd.nextInt(chars.length())));
		}
		return pass;		
	}
	
	public String passFijaGen() {
		String pass = "";
		
		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String simbolos = "!@#$%^&*_=+-/€.?<>)";
        String chars = mayus + minus + num + simbolos;
        
        Random rnd = new Random(codigo*longitud*VARIABLE_FIJA);
        
		for (int i = 0; i < longitud; i++) {
			pass += String.valueOf(chars.charAt(rnd.nextInt(chars.length())));			
		}
		return pass;
	}
	
	

}
