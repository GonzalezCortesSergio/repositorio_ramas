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
            
                
                break;
        
            default:
                break;
        }

    }



}