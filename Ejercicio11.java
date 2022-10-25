import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int n1,n2,resultado1,resultado2;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        n1=leer_entrada.nextInt();
        resultado1= n1 + 1;
        System.out.println("Introduce un valor nuevo valor: ");
        n2=leer_entrada.nextInt();
        resultado2= resultado1 * n2;
        System.out.println("El resultado de multiplicar el primer valor +1 y el segundo valor es: " + resultado2);

    }
}