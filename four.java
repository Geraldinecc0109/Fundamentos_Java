import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese el  numero de euros ");
        double euros= scanner.nextDouble();
    
      double multiplicacion = (euros * 1.07);

        System.out.println(" Numero de euros " + multiplicacion );   
    }
}
