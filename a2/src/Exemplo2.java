import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;
    do {
        System.out.println("Qual o nome do funcionario?");
        String nome = sc2.nextLine();

        System.out.println("Quantos dias trabalhados?");
        int dias = sc.nextInt();

        System.out.println("Qual o salario?");
        double salario = sc.nextDouble();

        System.out.println("Para repetir, Digite 'Sim' ");
        r = sc.next();

    }while(r.equalsIgnoreCase("Sim"));
    }
}
