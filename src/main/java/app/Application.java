package app;

import ents.Champion;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vida1 = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque1 = sc.nextInt();
        System.out.print("Armadura: ");
        int armadura1 = sc.nextInt();
        System.out.println();

        Champion primeiroCampeao = new Champion(nome1, vida1, ataque1, armadura1);

        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        sc.nextLine();
        String nome2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vida2 = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armadura2 = sc.nextInt();
        System.out.println();

        Champion segundoCampeao = new Champion(nome2, vida2, ataque2, armadura2);

        System.out.print("Quantos turnos você deseja executar? ");
        int turnos = sc.nextInt();

        for (int i = 1; i <= turnos; i++) {
            System.out.println("Resultado do turno " + i + ":");
            primeiroCampeao.takeDamage(segundoCampeao);
            segundoCampeao.takeDamage(primeiroCampeao);
            System.out.println(primeiroCampeao.status());
            System.out.println(segundoCampeao.status());
            System.out.println();
            if (primeiroCampeao.getLife() <= 0 || segundoCampeao.getLife() <= 0) {
                break;
            }
        }
        System.out.println("FIM DO COMBATE");
    }
}