package senaiprojetos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		 * Crie um array de inteiros com 4 elementos e ordene os valores em ordem
		 * crescente. Imprima o array ordenado.
		 */

		int[] numeros = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores para preencher o array : ");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
	
		Arrays.sort(numeros);
		
		for ( int numero : numeros) {
			System.out.println(numero + "");
		}

		sc.close();
	}

}
