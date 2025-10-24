package paquetes;

public abstract class PaqueteTe implements Paquete {
    private final int cantidad;

    public PaqueteTe(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String muestraContenido() {
        return "Este paquete tiene " + cantidad + " unidades";
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }
}
