public class Arrays4 {
    public static void main (String [] args) {

        int [] numero = new int[5];

        int i;
        System.out.println("Introduzca 15 números: ");

        for (i=0; i<15; i++) 
        { numero[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("Array desplazado: ");
        int aux = numero[14];

        for (i = 14; i>0; i++)
        { numero[i] = numero [i - 1];
        }
        numero[0] = aux;

        for (i=0; i < numero.length; i++) 
        { System.out.println(numero[i]);
        }
    }
    
}
