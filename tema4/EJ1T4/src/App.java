import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String dia;

        System.out.println("Dime un dia de la semana y te dire que asignatura toca ese dia: ");
        Scanner s = new Scanner(System.in);

        dia = s.nextLine();
        dia.toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("Los lunes a primera hora tenemos Sistemas Informaticos.");
                break;
            case "martes":
                System.out.println("Los martes a primera hora tenemos Sistemas Informaticos. ");    
                break;
            case "miercoles":
                System.out.println("Los miercoles a primera tenemos Bases de Datos. ");
                break;
            case "jueves":
                System.out.println("Los jueves a primera hora tenemos Lenguaje de Marcas. ");
                break;
            case "viernes":
                System.out.println("Los viernes a primera hora tenemos Base de Datos");
                break;
            default:
                System.out.println("ERROR");
        }
    }
    
}

