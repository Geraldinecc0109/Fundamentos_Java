import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in); 

        // TODO: Solicitar al usuario que ingrese el radio de una circunferencia
        System.out.println("Ingrese el radio de una circunferencia");
        double radio = scanner.nextDouble();
        
        // TODO: Calcular la longitud de la circunferencia usando la fórmula 2 * π * radio
        double longitud = (2 * (Math.PI) * radio);

        // TODO: Calcular el área de la circunferencia usando la fórmula π * radio^2
        double area = (Math.PI * radio * radio);

        // TODO: Mostrar la longitud de la circunferencia calculada
        System.out.println("La longitud de la circunferencia");
        System.out.println(longitud);

        // TODO: Mostrar el área de la circunferencia calculada
        System.out.println("El área de la circunferencia");
        System.out.println(area);
    }
}
