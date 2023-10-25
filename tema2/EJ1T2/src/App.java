/*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/

public class App { 
    public static void main(String[] args) throws Exception {
        int x = 144;
        int y = 999;
        int suma = 0;
        int resta = 0;
        double division = 0;
        int multiplicaion = 0;

        suma = x + y;
        resta = x - y;
        division = (double) x / (double) y;
        multiplicaion =  x * y;

        System.out.println("El valor de x es: "+ x);
        System.out.println("El valor de y es: "+ y);
        System.out.println("La suma es: " + suma );
        System.out.println("La resta es: " + resta);
        System.out.println("La division es " + division);
        System.out.println("La multiplicacion es " + multiplicaion);

    }
}
