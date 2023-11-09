import java.util.Scanner;

public class Appp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

            System.out.println("Introduzca el tipo de producto");
            String tipoProducto = sc.nextLine().toLowerCase();

            if (tipoProducto.equals("alimentacion")) {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                System.out.print("Precio por unidad: ");
                double precio = sc.nextDouble();

                double iva = (nombre.equalsIgnoreCase("Huevos") || nombre.equalsIgnoreCase("Leche") ||
                        nombre.equalsIgnoreCase("Pan") || nombre.equalsIgnoreCase("Fruta") ||
                        nombre.equalsIgnoreCase("Verdura")) ? 0.04 : 0.10;

                double subtotal = cantidad * precio;
                double impuesto = subtotal * iva;
                double totalProducto = subtotal + impuesto;
                total += totalProducto;

                System.out.println("Producto: " + nombre);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio por unidad: $" + precio);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("IVA: " + (iva * 100) + "%");
                System.out.println("Impuesto: $" + impuesto);
                System.out.println("Total del producto: $" + totalProducto);

            } else if (tipoProducto.equals("electronica")) {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                System.out.print("Precio por unidad: ");
                double precio = sc.nextDouble();

                double descuento = 0.20;
                double iva = 0.21;

                double subtotal = cantidad * precio;
                subtotal = subtotal - (subtotal * descuento);
                double impuesto = subtotal * iva;
                double totalProducto = subtotal + impuesto;
                total += totalProducto;

                System.out.println("Producto: " + nombre);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio por unidad: $" + precio);
                System.out.println("Descuento: " + (descuento * 100) + "%");
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("IVA: " + (iva * 100) + "%");
                System.out.println("Impuesto: $" + impuesto);
                System.out.println("Total del producto: $" + totalProducto);

            } else if (tipoProducto.equals("farmacia")) {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                System.out.print("Precio por unidad: ");
                double precio = sc.nextDouble();

                double iva = 0.04;

                double subtotal = cantidad * precio;
                double impuesto = subtotal * iva;
                double totalProducto = subtotal + impuesto;
                total += totalProducto;

                System.out.println("Producto: " + nombre);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio por unidad: $" + precio);
                System.out.println("IVA: " + (iva * 100) + "%");
                System.out.println("Impuesto: $" + impuesto);
                System.out.println("Total del producto: $" + totalProducto);

            } else if (tipoProducto.equals("moda")) {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                System.out.print("Precio por unidad: ");
                double precio = sc.nextDouble();

                double descuento = 0.33333333333; // Descuento equivalente al 3x2
                double iva = 0.21;

                int unidadesApagar = cantidad - (cantidad / 3);
                double subtotal = unidadesApagar * precio;
                double impuesto = subtotal * iva;
                double totalProducto = subtotal + impuesto;
                total += totalProducto;

                System.out.println("Producto: " + nombre);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio por unidad: $" + precio);
                System.out.println("Descuento: 3x2");
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("IVA: " + (iva * 100) + "%");
                System.out.println("Impuesto: $" + impuesto);
                System.out.println("Total del producto: $" + totalProducto);

            } else {
                System.out.println("Tipo de producto no válido. Intente nuevamente.");
              
            }



        System.out.println("Total a pagar: $" + total);
        sc.close();
    }
}
