





### Problema 8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar al usuario que ingrese el primer número
        System.out.println("Ingrese primer número");
        double numero1 = scanner.nextDouble();
        
        // TODO: Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingrese segundo número");
        double numero2 = scanner.nextDouble();

        // TODO: Solicitar al usuario que ingrese el tercer número
        System.out.println("Ingrese tercer número");
        double numero3 = scanner.nextDouble();

        // TODO: Calcular el promedio de los tres números ingresados por el usuario
        double promedio = (numero1 + numero2 + numero3) / 3;

        // TODO: Mostrar un mensaje y el promedio calculado
        System.out.println("Calcular promedio de tres números");
        System.out.println(promedio);
    }
}
