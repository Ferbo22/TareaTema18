import java.util.Scanner;

public class Operacion2_0 {

    public static void main(String[] args) {

        System.out.println("BIENVENIDO A LA VERSION 2.0");
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        int cantidad = 0;
        
        System.out.println("Introduzca un numero positivo mayor que 0:");
        numero = teclado.nextInt();
        
        while (numero >= 0) {
            cantidad++;
            suma += numero;
            System.out.println("Introduzca un numero positivo mayor que 0:");
            numero = teclado.nextInt();
        }
        
        if (cantidad > 0) {
            System.out.println("El promedio es: " + ((double) suma / cantidad));
        } else {
            System.out.println("No se ingresaron números válidos o fueron negativos.");
        }
    }
}