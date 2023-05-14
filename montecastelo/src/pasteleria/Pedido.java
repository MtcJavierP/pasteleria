package pasteleria;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<PastelChocolate> pasteles = new ArrayList<>();

    public void addPastel(PastelChocolate pastel) {
        pasteles.add(pastel);
    }

    public void printPedido() {
        for (PastelChocolate pastel : pasteles) {
            System.out.printf("   %2d  %s\n", pastel.getPRECIO(), pastel.getNombre());
        }
    }
}
