import java.util.*;

public class Hello_World {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String name = scan.nextLine();
        System.out.println("Hola "+name);
        System.out.println("Ingrese 2 números");
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = Math.sqrt((a*a) + (b*b));
        System.out.println(c);
    }
}
