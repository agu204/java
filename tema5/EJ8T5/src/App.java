import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i;
        int num=0;
        int tabla;
        Scanner s = new Scanner(System.in);
        num = Integer.parseInt(s.nextLine());
        System.out.println("La tabla de multiplicar de "+num+" es:");
        for(i=0;i<=10;i++){
            tabla=num*i;
            System.out.println(+num +" x "+i+" = "+tabla);
            s.close();
        }
        
    }
    
}
