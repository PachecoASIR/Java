import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        int n1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n1=leer_entrada.nextInt();
        System.out.println("Tabla de multiplicar del " + n1);
        for(int i = 1; i<=9; i++){
            System.out.println(n1 + " x " + i + " = " + n1*i);
        }
    }
}