
# Fundamentos_Java

### Problema 1
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar al usuario que ingrese la base del triángulo
        System.out.println("Ingrese la base del triángulo");
        double base = scanner.nextDouble();
        
        // TODO: Solicitar al usuario que ingrese la altura del triángulo
        System.out.println("Ingrese la altura del triángulo");
        double altura = scanner.nextDouble();

        // TODO: Calcular el área del triángulo usando la fórmula (base * altura) / 2
        double area = (base * altura) / 2;

        // TODO: Mostrar un mensaje que indica el área del triángulo
        System.out.println("El área para el triángulo de base " + base + " y altura " + altura + " es: " + area);
    }
}
```

### Problema 2
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar al usuario que ingrese el primer número
        System.out.println("Ingrese el primer número");
        double num1 = scanner.nextDouble();
        
        // TODO: Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingrese el segundo número");
        double num2 = scanner.nextDouble();

        // TODO: Calcular la suma de los dos números ingresados
        double suma = (num1 + num2);

        // TODO: Mostrar un mensaje que indica la suma de los números ingresados
        System.out.println("La suma del número " + num1 + " con el número " + num2 + " es " + suma);
    }
}
```

### Problema 3
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número");
        double numv = scanner.nextDouble();

        // TODO: Calcular la potencia del número elevado al cuadrado
        double potenciacia = (numv * numv);

        // TODO: Mostrar el resultado de elevar el número al cuadrado
        System.out.println("Elevar al cuadrado el número ingresado: " + potenciacia);
    }
}

```

### Problema 4
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar al usuario que ingrese el número de euros
        System.out.println("Ingrese el número de euros");
        double euros = scanner.nextDouble();

        // TODO: Calcular la multiplicación de los euros por 1.07 (aplicando un 7% de aumento)
        double multiplicacion = (euros * 1.07);

        // TODO: Mostrar el resultado de la multiplicación
        System.out.println("Número de euros después del aumento del 7%: " + multiplicacion);
    }
}
```

### Problema 5

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar al usuario que ingrese el lado de un cuadrado
        System.out.println("Ingrese el lado de un cuadrado");
        double lado = scanner.nextDouble();

        // TODO: Calcular el área del cuadrado multiplicando el lado por sí mismo
        double area = (lado * lado);

        // TODO: Calcular el perímetro del cuadrado sumando los cuatro lados
        double perimetro = (lado + lado + lado + lado);

        // TODO: Mostrar el área del cuadrado calculada
        System.out.println("El área del cuadrado");
        System.out.println(area);

        // TODO: Mostrar el perímetro del cuadrado calculado
        System.out.println("El perímetro del cuadrado");
        System.out.println(perimetro);
    }
}
```

### Problema 6 
```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in); 

        // TODO: Solicitar al usuario que ingrese la altura del cilindro
        System.out.println("Ingrese la altura del cilindro");
        double altura = scanner.nextDouble();
        
        // TODO: Solicitar al usuario que ingrese el radio del cilindro
        System.out.println("Ingrese el radio del cilindro");
        double radio = scanner.nextDouble();

        // TODO: Calcular el área de la superficie del cilindro usando la fórmula 2 * π * radio^2
        double area = (2 * (Math.PI) * radio * radio);

        // TODO: Calcular el volumen del cilindro multiplicando el área de la base por la altura
        double volumen = (area * altura);

        // TODO: Mostrar el área del cilindro calculada
        System.out.println("El área del cilindro");
        System.out.println(area);

        // TODO: Mostrar el volumen del cilindro calculado
        System.out.println("El volumen del cilindro");
        System.out.println(volumen);
    }
}
```

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