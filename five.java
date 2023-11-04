import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese el lado de un cuadrado");
        double lado = scanner.nextDouble();
        
        double area = (lado * lado);
        double perimetro = (lado + lado + lado + lado);
        System.out.println(" El area del cuadro  ");
        System.out.println(area);
        System.out.println(" El perimetro del cuadrado ");
        System.out.println(perimetro);



        
    }
}
