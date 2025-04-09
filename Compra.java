public class Compra {
    private Producto producto;
    private int cantidad;

    public Compra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return cantidad * producto.getPrecio();
    }

    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (cantidad >= 5) return subtotal * 0.15;
        if (cantidad >= 3) return subtotal * 0.10;
        return 0;
    }

    public double calcularSubtotalConDescuento() {
        return calcularSubtotal() - calcularDescuento();
    }

    public double calcularIVA() {
        return calcularSubtotalConDescuento() * 0.19;
    }

    public double calcularTotal() {
        return calcularSubtotalConDescuento() + calcularIVA();
    }

    public void imprimirResumen() {
        System.out.println("\nProducto: " + producto.getNombre());
        System.out.println("Valor unitario: $" + producto.getPrecio());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Descuento: $" + calcularDescuento());
        System.out.println("Subtotal con descuento: $" + calcularSubtotalConDescuento());
        System.out.println("IVA (19%): $" + calcularIVA());
        System.out.println("Total a pagar por este producto: $" + calcularTotal());
    }
}
