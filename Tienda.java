import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double totalGeneral = 0;

        do {
            System.out.println("\nMenu de Compras, Elija una opción por favor:");
            System.out.println("1. Camisetas / Valor: $25.000");
            System.out.println("2. Pantalones / Valor: $45.000");
            System.out.println("3. Chaquetas / Valor: $65.000");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("¿Cuántas unidades desea comprar? ");
                int cantidad = sc.nextInt();

                Producto producto = switch (opcion) {
                    case 1 -> new Producto("Camisetas", 25000);
                    case 2 -> new Producto("Pantalones", 45000);
                    case 3 -> new Producto("Chaquetas", 65000);
                    default -> null;
                };

                Compra compra = new Compra(producto, cantidad);
                compra.imprimirResumen();
                totalGeneral += compra.calcularTotal();

            } else if (opcion != 4) {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        System.out.println("\nTOTAL GENERAL A PAGAR: $" + totalGeneral);
        System.out.println("Gracias por su compra.");
        sc.close();
    }
}
