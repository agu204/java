import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        double precio;
        int cantidad;
        double total;
        double totalSinIva;
        double iva;
        double totalProducto;
        int opcionalimentacion;
        String nombre;
        double impuesto;
        double descuento;
        int cantidadAPagar;
        double cantidadiva;

        System.out.println("Introduzca el tipo de producto");
        System.out.println("1.-Alimentacion");
        System.out.println("2.-Electronica");
        System.out.println("3.-Farmacia");
        System.out.println("4.-Moda");

        Scanner s = new Scanner(System.in);
        opcion = Integer.parseInt(s.nextLine());
        switch (opcion) {
            
            case 1:
                System.out.println("Elige el producto.");
                System.out.println("1.-Huevos");
                System.out.println("2.-Leche");
                System.out.println("3.-Pan");
                System.out.println("4.-Fruta");
                System.out.println("5.-Verdura");
                System.out.println("6.-Otros");
                
                opcionalimentacion = Integer.parseInt(s.nextLine());
                
                System.out.println("Nombre del producto: ");
                nombre = s.nextLine();
                System.out.print("Cantidad: ");
                cantidad = s.nextInt();
                System.out.print("Precio por unidad: ");
                precio = s.nextDouble();

                if(opcionalimentacion<=5){
                    iva=0.04;
                }else  {
                    iva=0.10;
                }

                totalSinIva = cantidad * precio;
                impuesto = totalSinIva * iva;
                totalProducto = totalSinIva + impuesto;
                cantidadiva = precio-(totalSinIva*iva/100);
                
                System.out.println("FACTURA");
                System.out.println("--------------------");
                System.out.println("Articulo: " + nombre);
                System.out.println("Precio por unidad: " + precio+" euros");
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Total: " + totalSinIva+" euros");
                System.out.println("IVA: " + cantidadiva + " euros");
                System.out.println("--------------------");
                System.out.println("Total del producto: " + totalProducto+" euros");
            break;
        
            case 2:
                System.out.println("Nombre del producto: ");
                nombre = s.nextLine();
                System.out.println("Cantidad: ");
                cantidad = s.nextInt();
                System.out.println("Precio por unidad: ");
                precio = s.nextDouble();

                descuento = 0.20;
                iva = 0.21;
                totalSinIva =0;
                total = cantidad * precio;
                total = total - (total * descuento);
                impuesto = total * iva;
                totalProducto = total + impuesto;
                totalSinIva = totalSinIva+totalProducto;

                System.out.println("FACTURA");
                System.out.println("--------------------");
                System.out.println("Articulo: " + nombre);
                System.out.println("Precio por unidad: " + precio+" euros");
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Total: " + precio+" euros");
                System.out.println("Descuento 20%:  " + (descuento * precio) + " euros");
                System.out.println("Total Con descuento: " + total+" euros");
                System.out.println("Impuesto: $" + impuesto);
                System.out.println("--------------------");
                System.out.println("Total del producto: " + totalProducto+" euros");
                
                break;
            
            case 3:
                System.out.println("Nombre del producto: ");
                nombre = s.nextLine();
                System.out.println("Cantidad: ");
                cantidad = s.nextInt();
                System.out.println("Precio por unidad: ");
                precio = s.nextDouble();

                iva = 0.04;
                totalSinIva =0;

                total = cantidad * precio;
                impuesto = total * iva;
                totalProducto = total + impuesto;
                totalSinIva += totalProducto;

                System.out.println("FACTURA");
                System.out.println("--------------------");
                System.out.println("Producto: " + nombre);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio por unidad: " + precio+" euros");
                System.out.println("Total: " + total + " euros");
                System.out.println("IVA 4%: " + impuesto+" euros");
                System.out.println("--------------------");
                System.out.println("Total del producto: " + totalProducto+" euros");
                
                break;
            
            case 4:
            System.out.println("Nombre del producto: ");
            nombre = s.nextLine();
            System.out.println("Cantidad: ");
            cantidad = s.nextInt();
            System.out.println("Precio por unidad: ");
            precio = s.nextDouble();

            
            iva = 0.21;
            totalSinIva =0;
            
            descuento=precio*cantidad;
            cantidadAPagar = cantidad - (cantidad / 3);
            total = cantidadAPagar * precio;
            impuesto = total * iva;
            totalProducto = total + impuesto;
            

            System.out.println("FACTURA");
            System.out.println("--------------------");
            System.out.println("Producto: " + nombre);
            System.out.println("Precio por unidad: " + precio+" euros");
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total: " + descuento +" euros");
            System.out.println("Descuento 3x2:"+(total-descuento)+" euros");
            System.out.println("Total Con descuento: " + total+" euros");
            System.out.println("IVA 21%: " + impuesto+" euros");
            System.out.println("--------------------");
            System.out.println("Total del producto: " + totalProducto+" euros");
            
                break;
            
            default:
            System.out.println("ERROR");
                break;
        }

        s.close();
    }
}
