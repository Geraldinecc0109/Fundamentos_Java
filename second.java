import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        System.out.println("Ingrese el primer numero ");
        double num1= scanner.nextDouble();
        
        System.out.println("Ingrese el segundo numero ");
        double num2= scanner.nextDouble();

        double suma = (num1 + num2) ;
        
        System.out.println("la suma del numero " +num1 + " con el numero " +num2 +" es " + suma);



        
    }
}
