package pasteleria;

public class PastelEstandar implements IntPastel{

	private String nombre;
	private final int PRECIO = 10;
	
	public PastelEstandar (String nombre) {
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
		return "Pastel";
	}


	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return PRECIO;
	}

}