public class App {
    public static void main(String[] args) throws Exception {
    int i;
    int j;
        System.out.println("Los numeros primos entre 2 y 100 son: ");
    for(i=2; i<=100; i++){

        for(j=2; j<i; j++){

            if(i % j == 0){
                System.out.print(i+" ");
                break;
            }
        }
    }
    
    }
}
