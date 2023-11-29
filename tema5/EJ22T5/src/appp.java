public class appp {
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 100:");

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            // Verificar si i es primo
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Imprimir el número primo
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}