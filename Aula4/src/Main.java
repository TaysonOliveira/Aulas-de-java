import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Pessoa p = new Pessoa();

        System.out.println("Nome: ");
        p.setNome(sc.next());

        System.out.println("Idade: ");
        p.setIdade(sc.nextInt());


        System.out.println("Altura: ");
        p.setAltura(sc.nextDouble());


        System.out.println("Peso: ");
        p.setPeso(sc.nextDouble());

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getAltura());

        System.out.println(" ");
        p.calculeIMC();
        System.out.println("O seu IMC é: " + p.getImc());


    }
}
