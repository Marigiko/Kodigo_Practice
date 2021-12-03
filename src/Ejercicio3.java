import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double areaCirculo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un radio: ");
        double radio = scan.nextInt();
        areaCirculo = (Math.PI)*(Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + areaCirculo);
    }
}
