public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return cantidad * precio;
    }

    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (cantidad >= 5) return subtotal * 0.15;
        else if (cantidad >= 3) return subtotal * 0.10;
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
        System.out.println("\nProducto: " + nombre);
        System.out.println("Valor unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Descuento: $" + calcularDescuento());
        System.out.println("Subtotal con descuento: $" + calcularSubtotalConDescuento());
        System.out.println("IVA (19%): $" + calcularIVA());
        System.out.println("Total a pagar por este producto: $" + calcularTotal());
    }

    public double getTotal() {
        return calcularTotal();
    }
}
