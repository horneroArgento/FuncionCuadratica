import java.util.Scanner;
public class FuncionCuadratica {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a, b, c;
        double raiz, x1, x2;

        System.out.println("Ingrese el valor de: A");
        a=tec.nextInt();
        System.out.println("Ingrese el valor de: B");
        b=tec.nextInt();
        System.out.println("Ingrese el valor de: C");
        c=tec.nextInt();

        raiz = Math.pow(b, 2) - (4 * a * c);
        System.out.println(raiz);

        if(raiz <= 0.0){
            System.out.println("La funcion ingresada, no es valida");
        }
        else{
            x1 = ((b * (-1)) + Math.sqrt(raiz)) / (2 * a);
            x2 = ((b * (-1)) - Math.sqrt(raiz)) / (2 * a);

            System.out.println("x1 vale:" + x1);
            System.out.println("x2 vale:" + x2);
        }

    }
}