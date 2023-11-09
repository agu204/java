import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double precioentrada;
        int lugar;
        int elecciondescuento;
        double preciocondescuento= 0;
        double descuento=0;

        System.out.println("Dime el precio de la entrada");
        precioentrada = Double.parseDouble(System.console().readLine());
        
        System.out.println("¿Donde quieres las entradas?");
        System.out.println("1.-Palco");
        System.out.println("2.-Gallinero");
        lugar = Integer.parseInt(System.console().readLine());

        System.out.println("¿Que tipo de descuento quieres?");
        System.out.println("1.-Descuento(publico con invitacion)");
        System.out.println("2.-Precio Normal");
        System.out.println("3.-Sobreprecio");
        elecciondescuento = Integer.parseInt(System.console().readLine());

        switch (elecciondescuento){
            case 1: //descuento
                if(lugar==1){
                    descuento=precioentrada/10;
                    preciocondescuento=precioentrada-descuento;
                    System.out.println("El valor de tu entrada en palco con desceunto es "+preciocondescuento);
                }else if(lugar==2){
                    descuento=precioentrada/5;
                    preciocondescuento=precioentrada-descuento;
                    System.out.println("El valor de tu entrada en gallinero con descuento es "+preciocondescuento);
                }

                break;
            
            case 2: //normal
                if(lugar==1){
                    System.out.println("El precio normal en palco es "+precioentrada);
                }else if(lugar==2){
                    System.out.println("El precio normal en gallinero es "+precioentrada);
                }

                break;

            case 3: //Sobreprecio
                if(lugar==1){
                    descuento=precioentrada/10;
                    preciocondescuento=precioentrada+descuento;
                    System.out.println("El valor de tu entrada en placo con sobreprecio "+preciocondescuento);
                }else if(lugar==2){
                    descuento=precioentrada/5;
                    preciocondescuento=precioentrada+descuento;
                    System.out.println("El valor de tu entrada en gallinero con sobreprecio"+preciocondescuento);
                }

                break;
            
            default:
                break;
        }

    }
}
