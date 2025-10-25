package paquetes;

public abstract class PaqueteTe implements Paquete {
    private final int cantidad;
    private final String tipo;

    public PaqueteTe(int cantidad, String tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Te " + tipo;
    }
}
