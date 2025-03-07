package Questão02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Matematica c = new Matematica();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        c.n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        c.n2 = sc.nextInt();

        System.out.println("Digite 1(Somar), 2(Subtrair), 3(Dividir), 4(Multiplicar)");
        int x = sc.nextInt();

        switch (x){

            case 1:
                System.out.println("A Soma Dos Numeros é: ");
                System.out.println(c.somar());
                break;
            case 2:
                System.out.println("A Subtração dos Numeros é: ");
                System.out.println(c.subtrair());
                break;
            case 3:
                System.out.println("A Divisão dos Numero é: ");
                System.out.println(c.dividir());
                break;
            case 4:
                int n3, n4;

                System.out.println("A Multiplicação dos Numeros é: ");
                System.out.println(c.multiplicar());
                break;
            default:
                System.out.println("inválido");
                break;
        }
    }
}