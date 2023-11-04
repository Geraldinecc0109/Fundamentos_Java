import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        System.out.println("Ingrese la base del triangulo");
        double base = scanner.nextDouble();
        
        System.out.println("Ingrese la altura del triangulo");
        double altura= scanner.nextDouble();

        double area = (base * altura) /2;
        System.out.println("El area para el triangulo de base " + base + " y altura " + altura + " es: " + area);


        
    }
}
