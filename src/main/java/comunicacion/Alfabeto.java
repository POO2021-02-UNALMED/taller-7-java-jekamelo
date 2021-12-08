package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String [] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String lasLetras = "";
		for (String letra : letras) {
			lasLetras = lasLetras +letra+", ";
			
		}
		String cadenaFinal = lasLetras.substring(0,lasLetras.length()-2);
		
		return cadenaFinal;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	
	

}
