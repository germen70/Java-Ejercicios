import java.util.Arrays;
import java.util.Scanner;

public class AER180 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos;
        int a;
        int b;
        int c;


        casos = sc.nextInt();sc.nextLine();
        for (int i = 0; i < casos; i++) {
            
            
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            //ordeno los lados para que c sea el mas largo
            int[] lados = {a, b, c};
            Arrays.sort(lados);
            a = lados[0];
            b = lados[1];
            c = lados[2];

            if(a + b > c){ //si no se cumple no se puede formar el triangulo

                long total = (long) c * c; //el lado largo al cuadrado
                long otro = (long) a * a + (long) b * b; //los otros dos al cuadrado

                if(total>otro){
                    System.out.println("OBTUSANGULO");
                    

                }else{
                    if (total<otro) {
                        System.out.println("ACUTANGULO");
                    }else{
                        System.out.println("RECTANGULO");
                    }
                }
            

            }else{
                System.out.println("IMPOSIBLE");
            }
            
        }
        
        
    }
}