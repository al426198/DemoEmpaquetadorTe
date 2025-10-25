package notificador;

import paquetes.PaquetePaquete;

public abstract class Notificador extends PaquetePaquete {
    protected PaquetePaquete paquete;

    public Notificador(PaquetePaquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public String mostrarContenido() {
        return paquete.mostrarContenido();
    }
}
