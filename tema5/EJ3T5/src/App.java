public class App {
    public static void main(String[] args) throws Exception {
        int num=0;
        int aux =0;

        do {
            num=5*aux;
            aux=aux+1;
            System.out.println(+num);
        } while (num<100);
        
    }
}
