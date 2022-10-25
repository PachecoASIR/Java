import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int n1,n2;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para comparar: ");
        n1=leer_entrada.nextInt();
        System.out.println("Introduce un nuevo valor: ");
        n2=leer_entrada.nextInt();
        if(n1==n2) {
            System.out.println("Ambos números son iguales.");
        }
        else System.out.println("Ambos números son diferentes.");

    }
}