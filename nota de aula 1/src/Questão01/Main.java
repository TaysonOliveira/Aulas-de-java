package Questão01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Aluno c = new Aluno();
        Scanner sc = new Scanner(System.in);
        Scanner scNome = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        c.nome = scNome.nextLine();

        System.out.println("Digite a primeira nota: ");
        c.n1 = sc.nextDouble();

        System.out.println("Digite a Segunda nota: ");
        c.n2 = sc.nextDouble();

        System.out.println("Digite a Terceira nota: ");
        c.n3 = sc.nextDouble();

        c.media();

        if (c.media >= 7) {
            System.out.println("Aprovado! ");

        } else if (c.media < 4) {
            System.out.println("Recuperação!");

        }else {
            System.out.println("Reprovado! ");
        }
    }
}