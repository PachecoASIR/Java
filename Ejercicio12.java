import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        int n1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        n1=leer_entrada.nextInt();
        System.out.println("Puedes tener carnet? ");
        System.out.println(n1 >= 18);

    }
}