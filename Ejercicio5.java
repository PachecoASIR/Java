import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        double a,r,resultado;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para el radio: ");
        r=leer_entrada.nextInt();
        a= Math.PI * (r * r);
        System.out.println("El área del círculo es: " + a);
        resultado= 2 * Math.PI * r;
        System.out.println("La longitud del círculo es: " + resultado);

    }
}