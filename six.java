import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese la altura del cilindro");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese el radio  del cilindro");
        double radio = scanner.nextDouble();
        double area = (2 * (Math.PI) * radio * radio);
        double volumen = (area * altura);
        System.out.println(" El area del cilindro ");
        System.out.println(area);
        System.out.println(" El volumen del cuadrado ");
        System.out.println(volumen);



        
    }
}
