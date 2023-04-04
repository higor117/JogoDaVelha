package entities;

import java.util.Scanner;

public class keepStudies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] jogoVelha = new char[3][3];

		System.out.println("Player 1 - X");
		System.out.println("Player 2 - O");

		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {
			if (jogada % 2 == 1) { // jogador 1
				System.out.println("vez do X. escolha linha e coluna");
				sinal = 'X';
			} else {
				System.out.println("vez do O. escolha linha e coluna");
				sinal = 'O';
			}
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com uma linha possivel");
				linha = sc.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("linha invalida");
				}
			}
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com uma coluna possivel");
				coluna = sc.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("coluna invalida");
				}
			}
			linha--;
			coluna--;

			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição ja ocupada");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			// imprimir mapa
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j]+" | ");
				}
				System.out.println();
			}
			// verificar ganhador
			if((jogoVelha[0][0]=='X' &&jogoVelha[0][1]=='X' &&jogoVelha[0][2]=='X') ||
					(jogoVelha[1][0]=='X' &&jogoVelha[1][1]=='X' &&jogoVelha[1][2]=='X' ) ||
					(jogoVelha[2][0]=='X' &&jogoVelha[2][1]=='X' &&jogoVelha[2][2]=='X') ||
					(jogoVelha[0][0]=='X' &&jogoVelha[1][0]=='X' &&jogoVelha[2][0]=='X') ||
					(jogoVelha[0][1]=='X' &&jogoVelha[1][1]=='X' &&jogoVelha[2][1]=='X') ||
					(jogoVelha[0][2]=='X' &&jogoVelha[1][2]=='X' &&jogoVelha[2][2]=='X') ||
					(jogoVelha[0][0]=='X' &&jogoVelha[1][1]=='X' &&jogoVelha[2][2]=='X')) {
				ganhou = true;
				System.out.println("Player 1 ganhou");
			}
				else if((jogoVelha[0][0]=='O' &&jogoVelha[0][1]=='O' &&jogoVelha[0][2]=='O') ||
						(jogoVelha[1][0]=='O' &&jogoVelha[1][1]=='O' &&jogoVelha[1][2]=='O' ) ||
						(jogoVelha[2][0]=='O' &&jogoVelha[2][1]=='O' &&jogoVelha[2][2]=='O') ||
						(jogoVelha[0][0]=='O' &&jogoVelha[1][0]=='O' &&jogoVelha[2][0]=='O') ||
						(jogoVelha[0][1]=='O' &&jogoVelha[1][1]=='O' &&jogoVelha[2][1]=='O') ||
						(jogoVelha[0][2]=='O' &&jogoVelha[1][2]=='O' &&jogoVelha[2][2]=='O') ||
						(jogoVelha[0][0]=='O' &&jogoVelha[1][1]=='O' &&jogoVelha[2][2]=='O')) {
					ganhou = true;
					System.out.println("Player 2 ganhou");
			}else if (jogada >9) {
				ganhou = true;
				System.out.println("veia do krai, ngm chamou");
			}
			
		}
		sc.close();
	}

}
