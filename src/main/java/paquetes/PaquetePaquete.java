package paquetes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PaquetePaquete implements Paquete {
    private final List<Paquete> paquetes;

    public PaquetePaquete() {
        paquetes = new ArrayList<>();
    }

    // Crea paquetes de forma compacta
    // Se podría aplicar Factory en el futuro para gestionar la creación de paquetes
    // (no se utiliza en la demo por conveniencia, pero sería útil)
    public PaquetePaquete(Map<String, Integer> envio) {
        paquetes = new ArrayList<>();
        envio.forEach((k, v) -> {
            for (int i = 0; i < v; i++) {
                paquetes.add(k.equals("Te Blanco") ? new PaqueteTeBlanco() : new PaqueteTeVerde());
            }
        });
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void anyadePaquete(Paquete p) {
        paquetes.add(p);
    }

    public void retiraPaquete(Paquete p) {
        paquetes.remove(p);
    }

    @Override
    public int getCantidad() {
        return paquetes.stream().map(Paquete::getCantidad).reduce(0, Integer::sum);
    }

    @Override
    public String toString() {
        return "Paquete de cajas";
    }
}
