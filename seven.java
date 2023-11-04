import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese el radio de una circunferencia");
        double radio = scanner.nextDouble();
        double longitud = (2 * (Math.PI) * radio);
        double area = (Math.PI * radio * radio);
        System.out.println(" La longitud de la circunferencia ");
        System.out.println(longitud);
        System.out.println(" El area de la circunferencia ");
        System.out.println(area);



        
    }
}
