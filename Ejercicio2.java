import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int r=7;
        double a;
        double resultado;

        Scanner leer_entrada = new Scanner(System.in);
        a= Math.PI * (r * r);
        System.out.println("El área del círculo es: " + a);
        resultado= 2 * Math.PI * r;
        System.out.println("La longitud del círculo es: " + resultado);

    }
}