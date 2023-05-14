package pasteleria;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
    // Create the order
////    Pedido pedido = new Pedido();
////    pedido.addPastel(new PastelVainilla());
////    pedido.addPastel(new PastelChocolate());
//
////    Chocolate p1= new PastelEstandar ("pastel 1");
////    p1.tipo();
////    
   
    IntPastel p1 = new PastelChocolate("pastel 1");
    System.out.println(p1.decorar()+" precio en euros: "+ p1.precio());
    IntPastel p1Mc= new PastelMulticapa(p1,2);
    System.out.println(p1Mc.decorar()+" precio en euros: "+p1Mc.precio());
    IntPastel P1McFideos= new Fideos(p1Mc);
    System.out.println(P1McFideos.decorar()+" precio en euros: "+P1McFideos.precio());
    IntPastel pmcfrase = new Frase (P1McFideos," Hola Mundo!");
    System.out.println(pmcfrase.decorar()+" precio en euros: "+pmcfrase.precio());
    
    
    IntPastel p2= new PastelFresa("pastel 2");
    System.out.println(p2.decorar()+" precio en euros: "+ p2.precio());
    IntPastel p2Mc= new PastelMulticapa(p2,4);
    System.out.println(p2Mc.decorar()+ " precio en euros: "+p2Mc.precio());
    IntPastel P2McFideos= new Fideos(p2Mc);
    System.out.println(P2McFideos.decorar()+" precio en euros: "+P2McFideos.precio());
    IntPastel pmcfrase2 = new Frase (P2McFideos," Hola Mundo!");
    System.out.println(pmcfrase2.decorar()+" con precio "+pmcfrase2.precio()+ " euros");
    
    

}
}