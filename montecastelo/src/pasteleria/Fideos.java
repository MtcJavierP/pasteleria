package pasteleria;

public class Fideos extends PastelDecorador{
	

				
		public Fideos(IntPastel pastel) {
			super(pastel);
			
			// TODO Auto-generated constructor stub
		}

		@Override
		public String decorar() {
			// TODO Auto-generated method stub
			return super.getPastel().decorar()+" con fideos de azucar";
		}

		@Override
		public String tipo() {
			// TODO Auto-generated method stub
			return super.getPastel().tipo();
		}
		
		public int precio() {
			return super.getPastel().precio()+2;
		}

		
		
	

}