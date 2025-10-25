package paquetes;

public interface Paquete {
    int getCantidad();

    default String mostrarContenido() {
        return "Este paquete consta de " + getCantidad() + " unidades";
    }
}
