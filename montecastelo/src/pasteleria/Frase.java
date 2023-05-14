package pasteleria;

public class Frase extends PastelDecorador{


		public String fraseTarta;
		
		public Frase(IntPastel pastel, String frase) {
			super(pastel);
			fraseTarta=frase;
			// TODO Auto-generated constructor stub
		}

		@Override
		public String decorar() {
			// TODO Auto-generated method stub
			return super.getPastel().decorar()+ fraseTarta;
		}

		@Override
		public String tipo() {
			// TODO Auto-generated method stub
			return super.getPastel().tipo();
		}
		
		public int precio() {
			return super.getPastel().precio();
		}

		
		
	

}
