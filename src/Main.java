import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        while(opcion!=4){
            System.out.println("------------------------------------");
            System.out.println("1) Área del triángulo");
            System.out.println("2) Área del cuadrado");
            System.out.println("3) Área del círculo");
            System.out.println("4) Salir");
            System.out.println("Seleccione el área a calcular: ");
            opcion=sc.nextInt();
            System.out.println("------------------------------------");
            switch(opcion){
                case 1:
                    //calcular área del triángulo
                    break;
                case 2:
                    //Calcular área del cuadrado
                    break;
                case 3:
                    //calcular área del circulo
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