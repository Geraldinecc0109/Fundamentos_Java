# Fundamentos_Java


### Problema 7
```
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

```

### Problema 8
```
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
```