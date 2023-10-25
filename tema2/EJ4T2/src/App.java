/*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable. */
public class App {

  public static void main(String[] args) throws Exception {
    double cantidadeuros = 540;
    double resultado = 0;
    double pesetas = 166.386;

    System.out.println(
      "Dime la cantidad de euros para que te de su valor en pesetas: "
    );

    resultado = cantidadeuros * pesetas;
    System.out.println(cantidadeuros + "euros son " + resultado + " pesetas.");
  }
}
