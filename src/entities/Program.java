package entities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int player, cpu;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha sua mão jajaken: 1 pedra, 2 tesoura, 3 papel: ");
		player = sc.nextInt();
		switch (player) {
		case 1:
			System.out.println("Jogador escolheu Guu");
			break;
		case 2:
			System.out.println("Jogador escolheu Shi");
			break;
		case 3:
			System.out.println("Jogador escolheu Paa");
			break;
		default:
			System.out.println("opção invalida");
		}

		cpu = (int) (Math.random() * 3 + 1);
		switch (cpu) {
		case 1:
			System.out.println("Cpu escolheu Guu");
			break;
		case 2:
			System.out.println("Cpu escolheu Shi");
			break;
		case 3:
			System.out.println("Cpu escolheu Paa");
			break;
		}
		System.out.println(" ");
		if (player == cpu) {
			System.out.println("Empate");
		} else {
			if ((player == 1 && cpu == 3) || (player == 2 && cpu == 1) || (player == 3 && cpu == 2)) {
				System.out.println("Wnner is player");
			} else {
				System.out.println("Cpu winned :(");
			}
		}

		sc.close();
	}
}
