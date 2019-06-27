package br.edu.fapi.pinhais.ex02;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		
		calculo calculos;

		int op;
		int num1;
		int num2;
		int result;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		System.out.println("1-Somar");
		System.out.println("2-Subtrair");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		op = ler.nextInt();
		switch (op) {
		case 1:
			calculos = new operacoes();
			System.out.println("Resultado: " + calculos.calcularSoma(num1, num2));
			break;
		case 2:
			calculos = new operacoes();
			System.out.println("Resultado: " + calculos.calcularSubtracao(num1, num2));
			break;
		case 3:
			calculos = new operacoes();
			System.out.println("Resultado: " + calculos.calcularMultiplicacao(num1, num2));
			break;
		case 4:
			calculos = new operacoes();
			if(num2 == 0) {
				System.out.println("Impossivel dividir por 0 ");
				num2 = ler.nextInt();
			}
			System.out.println("Resultado: " + calculos.calcularDivisao(num1, num2));
	
			break;
		default:
			break;
		}
		
	}

}
