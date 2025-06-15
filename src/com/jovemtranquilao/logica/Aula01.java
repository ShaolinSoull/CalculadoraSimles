package com.jovemtranquilao.logica;
import java.util.Scanner;
public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior idade");
		}
		else {
			System.out.println("Menor idade");
		}
		System.out.println("Sua idade é: "+ idade);
		input.close();
	}
}
