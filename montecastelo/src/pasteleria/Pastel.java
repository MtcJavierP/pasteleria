package pasteleria;

public abstract class Pastel implements IntPastel{
    private final int PRECIO = 10;

    
    private IntPastel pastel;
    
    
    
    public Pastel(IntPastel pastel) {
		super();
		this.pastel = pastel;
	
	}

	public int getPrecio() {
        return PRECIO;
    }

    public abstract String getDescripcion();

	public String decorar() {
		// TODO Auto-generated method stub
		return pastel.decorar();
	}
    
    
    

}
