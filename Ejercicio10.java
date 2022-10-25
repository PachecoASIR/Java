import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        int n1,n2,n3;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para comparar: ");
        n1=leer_entrada.nextInt();
        System.out.println("Introduce un nuevo valor: ");
        n2=leer_entrada.nextInt();
        System.out.println("Introduce un último nuevo valor: ");
        n3=leer_entrada.nextInt();
        if(n1==n2) {
            if(n1==n3){
                System.out.println("Los números son iguales.");
            }
            else if(n1==n2){
                    System.out.println("Uno de los números es diferente.");
                } 
            else System.out.println("Todos los números son diferentes.");
            }
        else if(n1==n3) {
            if(n1==n3){
                System.out.println("Uno de los números es diferente.");
            } 
            }
        else System.out.println("Todos los números son diferentes.");

        }
    }