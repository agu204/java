import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int horastrabajadas;
        int suma=0;
        int dineroextra;
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        Scanner s = new Scanner(System.in);
        horastrabajadas = Integer.parseInt(s.nextLine());
        if ((horastrabajadas>=0)&&(horastrabajadas<=40)){
            suma = horastrabajadas*12;
            System.out.println("Tu suelo semanal es "+suma+" Euros");
        }else if((horastrabajadas>=41)){
            suma = 40*12;
            horastrabajadas= horastrabajadas-40;
            dineroextra = horastrabajadas*16;
            suma = suma + dineroextra;
            System.out.println("Tu sueldo semanal es "+suma+" Euros");
        } else{
            System.out.println("Error con la cantidad de horas introducida.");
        }

        s.close();
    }
}
