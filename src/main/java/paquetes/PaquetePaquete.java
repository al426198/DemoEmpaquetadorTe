package paquetes;

import java.util.ArrayList;
import java.util.List;

public class PaquetePaquete implements Paquete {
    private final List<Paquete> paquetes;

    public PaquetePaquete() {
        paquetes = new ArrayList<>();
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void anyadePaquete(Paquete p) {
        System.out.println("Añado una caja de " + p.toString());
        paquetes.add(p);
    }

    public void retiraPaquete(Paquete p) {
        paquetes.remove(p);
    }

    @Override
    public int getCantidad() {
        int cantidad = 0;
        for (Paquete paquete : paquetes) {
            cantidad += paquete.getCantidad();
        }
        System.out.println("Este paquete consta de " + cantidad + " unidades");
        return cantidad;
    }

    @Override
    public String toString() {
        return "Paquete de cajas";
    }

    @Override
    public String muestraContenido() {
        StringBuilder sb = new StringBuilder();
        for (Paquete paquete : paquetes) {
            sb.append(paquete.muestraContenido()).append("\n");
        }
        return sb.toString();
    }
}
