public class EJ5 {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[33m");
        System.out.printf("%-12s    %-12s  %-12s    %-12s   %-12s    %-12s\n", "HORARIO","LUNES", "MARTES","MIERCOLES","JUEVES","VIERNES");
        System.out.print("\033[91m");
        System.out.printf("%-12s    %-12s  %-12s    %-12s   %-12s    %-12s\n", "15:15-16:15", "SIINF","SIINF","BADAT","LMSGI","BADAT");
        System.out.printf("%-12s    %-12s  %-12s    %-12s   %-12s    %-12s\n", "16:15-17:15", "SIINF","SIINF","BADAT","LMSGI","BADAT");
        System.out.printf("%-12s    %-12s  %-12s    %-12s   %-12s    %-12s\n", "17:15-18:15", "SIINF","SIINF","PROG","PROG","PROG");
        System.out.printf("%-12s    %-12s   %-12s   %-12s   %-12s    %-12s\n", "18:30-19:30", "FOL","SIINF","PROG","PROG","PROG");
        System.out.printf("%-12s    %-12s   %-12s   %-12s   %-12s    %-12s\n", "19:30-20:30", "FOL","SIINF","PROG","BADAT","LMSGI");
        System.out.printf("%-12s    %-12s   %-12s   %-12s   %-12s    %-12s\n", "20:30-21:30", "FOL","SIINF","PROG","BADAT","LMSGI");
    }
}