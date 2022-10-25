import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner leer_entrada = new Scanner(System.in);

        String nombre = "";
        String localidad = "";
        String gusto = "";
        String resultado = "";

        System.out.println("Introduce tu nombre: ");
        nombre = leer_entrada.nextLine();
        System.out.println("Introduce tu localidad: ");
        localidad=leer_entrada.nextLine();
        System.out.println("Introduce tus gustos: ");
        gusto=leer_entrada.nextLine();
        resultado= ("Hola, mi nombre es " + nombre + " vivo en " + localidad + " y me gusta el/la " + gusto) ;
        System.out.println  ("" + resultado);

    }
}