/*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable. */
public class App {

  public static void main(String[] args) throws Exception {
    double pesetas = 12314;
    double resultado = 0;
    double conversor = 166.386;

    System.out.println(
      "Dime la cantidad de euros para que te de su valor en pesetas: "
    );

    resultado = pesetas / conversor;
    System.out.println(pesetas + " pesetas son " + resultado + " euro.");
  }
}
