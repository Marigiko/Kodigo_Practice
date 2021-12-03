import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scan.nextInt();
        if ((num % 2) == 0) {
            System.out.println("El numero SI es divisible por 2");
        }
        else {
            System.out.println("El numero NO es divisible por 2");
        }
    }
}
