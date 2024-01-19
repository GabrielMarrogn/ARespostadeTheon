import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int menor =0;
        int contador =0;;

        for(int i = 1; i <= a; i++){
            int b = sc.nextInt();

            if(i ==1){
                menor = b;
                contador = i;
            }else if(menor > b){
                menor =b;
                contador = i;
            }
        }

        System.out.println(contador);
        
        sc.close();
    }
}
