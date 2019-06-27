package br.edu.fapi.pinhais.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		calculoQuadrado calcQuadrado;
		calculoCirculo calcCirculo;
		
		double raioCirculo;
		int alturaQuadrado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a altura do quadrado");
		alturaQuadrado = ler.nextInt();
		System.out.println("Informe o raio do cirtulo ");
		raioCirculo = ler.nextInt();	
		calcQuadrado = new quadrado();
		System.out.println("O Perimetro do quadrado é " + calcQuadrado.calcularQuadradoPerimetro(alturaQuadrado) + " e a area eh de: " + calcQuadrado.calcularQuadradoArea(alturaQuadrado));
		calcCirculo = new circulo();
		System.out.println("O Perimetro do circulo é " + calcCirculo.calcularCirculoPerimetro(raioCirculo) + " e a area eh de : " + calcCirculo.calcularCirculoArea(raioCirculo));
		
		
		
	}

}
