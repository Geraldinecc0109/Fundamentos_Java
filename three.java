import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese el  numero ");
        double numv= scanner.nextDouble();
    
        double potenciacia = (numv*numv);

        System.out.println(" elevar al cuadrado el numv " + potenciacia );   
    }
}
