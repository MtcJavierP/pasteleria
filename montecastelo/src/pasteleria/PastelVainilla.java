package pasteleria;

public class PastelVainilla implements IntPastel{

	private String nombre;
	private final int PRECIO = 10;
	
	public PastelVainilla (String nombre) {
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
		return "Pastel de Vainilla ";
	}


	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "Pastel de Vainilla ";
	}





	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return PRECIO;
	}

	

}