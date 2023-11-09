import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        double x;

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 ");
        System.out.println("Dime el valor para a: ");
        Scanner s = new Scanner(System.in);
            a = Integer.parseInt(s.nextLine());
        System.out.println("Dime el valor para b: ");
            b = Integer.parseInt(s.nextLine());

    if(a>=1){
    x=(double)-b/(double)a;
            System.out.println("x= "+x);
        s.close();
    }else if (a<=0){
        System.out.println("a no puede ser 0");
    }
    }
}
