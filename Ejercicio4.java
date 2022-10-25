import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int n1,n2,resultado;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para la altura: ");
        n1=leer_entrada.nextInt();
        System.out.println("Introduce un valor para la anchura: ");
        n2=leer_entrada.nextInt();
        resultado= n1 * n2;
        System.out.println("El área del rectángulo es: " + resultado);

    }
}