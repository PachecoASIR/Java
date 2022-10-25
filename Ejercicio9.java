import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        String f1;
        String f2;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce una frase para comparar: ");
        f1=leer_entrada.nextLine();
        System.out.println("Introduce una nueva frase para comprobar si es la misma: ");
        f2=leer_entrada.nextLine();
        if(f1.equals(f2)) {
            System.out.println("Ambas frases son iguales.");
        }
        else System.out.println("Ambas frases son diferentes.");

    }
}