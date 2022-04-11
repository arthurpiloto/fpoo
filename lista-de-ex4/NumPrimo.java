import java.util.Scanner;
class NumPrimo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("\nDigite um numero inteiro >= 2: ");
            n = sc.nextInt();
            if(n >= 2){
                break;
            }
        }

        for(int i = 2; i<n/2+1; i++){
            if(n % i == 0){
                System.out.print("\n" + n + " nao eh primo");
                System.exit(0);
            }
        }
        System.out.print("\n" + n + " eh primo");
    }
}