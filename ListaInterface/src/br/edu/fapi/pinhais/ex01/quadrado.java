package br.edu.fapi.pinhais.ex01;

public class quadrado implements calculoQuadrado {
	
	@Override
	public int calcularQuadradoPerimetro(int alturaQuadrado) {	
		
		return alturaQuadrado + alturaQuadrado + alturaQuadrado +alturaQuadrado;
	}
	@Override
	public int calcularQuadradoArea(int alturaQuadrado) {
		
		return alturaQuadrado * alturaQuadrado;
	}
}
