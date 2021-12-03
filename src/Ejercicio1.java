import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        a = scan.nextInt();
        System.out.println("Ingrese otro numero: ");
        b = scan.nextInt();
        System.out.println("La suma es igual a: " + (a + b));
        System.out.println("La resta es igual a: " + (a - b));
        System.out.println("La division es igual a: " + (a / b));
        System.out.println("La multiplicacion es igual a: " + (a * b));
    }
}
