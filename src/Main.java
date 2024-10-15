import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        while(opcion!=4){
            System.out.println("------------------------------------");
            System.out.println("Programa para calcular áreas ");
            System.out.println("1) Área del triángulo");
            System.out.println("2) Área del cuadrado");
            System.out.println("3) Área del círculo");
            System.out.println("4) Salir");
            System.out.println("Seleccione el área a calcular: ");
            opcion=sc.nextInt();
            System.out.println("------------------------------------");
            switch(opcion){
                case 1:
                    double base, altura, area_triangulo;
                    System.out.print("Ingrese la base:\t");
                    base = sc.nextDouble();
                    System.out.print("Ingrese la altura:\t");
                    altura = sc.nextDouble();
                    area_triangulo = ((base*altura)/2);
                    System.out.print("El area del triángulo de base "+base+" y altura "+altura+" es: "+area_triangulo);
                    break;
                case 2:
                    int lado;
                    System.out.println("Ingrese el lado del cuadrado: ");
                    lado=sc.nextInt();
                    double area_cuadrado = lado*lado;
                    System.out.println("El area del cuadrado de lado "+lado+" es: "+area_cuadrado);
                    break;
                case 3:
                    double area,radio;
                    System.out.print("Ingresa el radio de un circulo: ");
                    radio = sc.nextDouble();
                    area=Math.PI*(radio*radio);
                    System.out.println("El área de una circunferencia de radio " + radio+ " es: " + area);
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro sistema...");
                    break;
                default:
                    System.out.println("OPCIÓN NO VALIDA, INTENTE NUEVAMENTE");
            }
        }
    }
}