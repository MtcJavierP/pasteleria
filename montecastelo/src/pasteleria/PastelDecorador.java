package pasteleria;

public abstract class PastelDecorador implements IntPastel{
	
	private IntPastel pastel;
	
	public PastelDecorador(IntPastel pastel) {
		
		this.pastel=pastel;
	}
	
	protected IntPastel getPastel() {
		return pastel;
	}

	
	   
}
