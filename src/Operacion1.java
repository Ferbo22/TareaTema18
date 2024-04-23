import java.util.Scanner;

public class Operacion1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        int cantidad = 0;
        
        System.out.println("Introduzca un numero:");
        numero = teclado.nextInt();
        
        while (numero >= 0) {
            cantidad++;
            suma += numero;
            System.out.println("Introduzca un numero:");
            numero = teclado.nextInt();
        }
        
        if (cantidad > 0) {
            System.out.println("El promedio es: " + ((double) suma / cantidad));
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}