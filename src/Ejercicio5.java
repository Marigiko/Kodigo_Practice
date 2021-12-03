import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la variable A: ");
        a = scan.nextInt();
        System.out.println("Ingrese la variable B: ");
        b = scan.nextInt();
        System.out.println("Ingrese la variable C: ");
        c = scan.nextInt();
        double discriminante = (Math.pow(b, 2) - (4 * a * c));
        if (discriminante >= 0) {
            double soluciones[];
            if(discriminante == 0){
                soluciones = new double[1];
                soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
                System.out.println("La solucion es: " + soluciones[0]);
            }
            else{
                soluciones = new double[2];
                soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                System.out.println("Los valores son: Punto de Corte A " + soluciones[0] + " " + "Punto de Corte B " + soluciones[1]);
            }
        }
    }
}
