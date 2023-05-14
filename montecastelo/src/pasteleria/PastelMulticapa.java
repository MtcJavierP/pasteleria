package pasteleria;

public class PastelMulticapa extends PastelDecorador{

	public int numCapas;
	
	public PastelMulticapa(IntPastel pastel, int capas) {
		super(pastel);
		numCapas=capas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String decorar() {
		// TODO Auto-generated method stub
		return super.getPastel().decorar()+" multicapa";
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return super.getPastel().tipo();
	}
	
	public int precio() {
		return super.getPastel().precio()+(5*numCapas);
	}

	
	
}
