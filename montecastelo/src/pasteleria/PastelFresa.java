package pasteleria;

public class PastelFresa implements IntPastel{

	private String nombre;
	private final int PRECIO = 20;
	
	public PastelFresa (String nombre) {
		this.nombre=nombre;
		
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getPRECIO() {
		return PRECIO;
	}





	@Override
	public String decorar() {
		// TODO Auto-generated method stub
		return "Pastel de Fresa ";
	}


	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "Pastel de Fresa ";
	}





	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return PRECIO;
	}

	
	
}
