package br.edu.fapi.pinhais.ex01;

public class circulo implements calculoCirculo {
	
	@Override
	public double calcularCirculoPerimetro(double raioCirculo) {
		
		return raioCirculo * (2 * 3.14);
	}
	@Override
	public double calcularCirculoArea(double raioCirculo) {
		
		return  (raioCirculo * raioCirculo) * 3.14;
	}
	
}
