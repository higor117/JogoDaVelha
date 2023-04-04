package entities;

import java.util.Random;

public class estudies1 {

	static int[][] Matriz(int n, int m) {
		int[][] matriz = new int[n][m];
		Random gerador = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = gerador.nextInt(100);
			}
		}
		return matriz;
	}

	static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	static int[][] transpota(int[][] matriz) {
		int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizTransposta.length; i++) {
			for (int j = 0; j < matrizTransposta[0].length; j++) {
				matrizTransposta[i][j]=matriz[j][i];
			}
		}
		return matrizTransposta;
	}

	public static void main(String[] args) {
		int[][] matriz = Matriz(3, 4);
		imprimeMatriz(matriz);
		System.out.println();
		int [][] transposta = transpota(matriz);
		imprimeMatriz(transposta);

	}

}
