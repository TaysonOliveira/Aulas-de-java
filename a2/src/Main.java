import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Caso escolha...");
            int x = sc.nextInt();
            switch (x){
            case 0:
                System.out.println("Opção 0 escolhida");
                break;
            case 1:
                System.out.println("Opção 1 escolhida");
                break;
            case 2:
                System.out.println("Opção 2 escolhida");
                break;
            default:
                System.out.println("Opção inválida");

        }
            System.out.println("Para repetir, digite 0");
            r = sc.nextInt();
        }while(r == 0);
    }
}
