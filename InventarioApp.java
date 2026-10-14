import java.util.ArrayList;
import java.util.List;

public class InventarioApp {
    private static List<Producto> listaProductos = new ArrayList<>();

    public static void main(String[] args) {
        Producto p1 = new Producto(1L, "Laptop", "Core i5", 2500000.0, 10);
        listaProductos.add(p1);
        System.out.println("Sistema de inventario funcionando correctamente.");
    }
}