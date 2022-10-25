import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner leer_entrada = new Scanner(System.in);

        String nombre = "Paco";
        String localidad = "Pontevedra";
        String gusto = "Tortilla de patata CON cebolla";
        String resultado;
        resultado= ("Hola, mi nombre es " + nombre + " vivo en " + localidad + " y me gusta el/la " + gusto) ;
        System.out.println  ("" + resultado);

    }
}