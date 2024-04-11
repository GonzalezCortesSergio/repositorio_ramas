import java.util.Scanner;

public class Principal {

    public static void main (String [] args) {


        int num1, num2, opc;
        String aux;

        Scanner s = new Scanner(System.in);

        System.out.println("""
                
                Opción 1:   Sumar
                Opción 2:   Restar
                Opción 3:   Multiplicar
                Opción 4:   Dividir
                Opción 0:   Salir

                """);

        aux = s.nextLine();
        opc = Integer.parseInt(aux);


        switch (opc) {
            case 1:

                System.out.println("Número 1");
                aux = s.nextLine();
                num1 = Integer.parseInt(aux);

                System.out.println("Número 2");
                aux = s.nextLine();
                num2 = Integer.parseInt(aux);

                System.out.println("La suma es= "+ (num1+num2));
                break;
        
            case 2:

                System.out.println("Número 1");
                aux = s.nextLine();
                num1 = Integer.parseInt(aux);

                System.out.println("Número 2");
                aux = s.nextLine();
                num2 = Integer.parseInt(aux);

                System.out.println("El resultado es= " + (num1 - num2));

                break;

            case 0:

                System.out.println("Saliendo...");
            
            
            default:

                System.out.println("Opción equivocada");
                break;
        }

    }



}