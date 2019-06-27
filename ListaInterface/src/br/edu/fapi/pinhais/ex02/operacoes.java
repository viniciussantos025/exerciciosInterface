package br.edu.fapi.pinhais.ex02;

public class operacoes implements calculo{
	
	int result;
	@Override
	public int calcularSoma(int num1, int num2) {
		result = num1 + num2;
		return result;
	}

	@Override
	public int calcularSubtracao(int num1, int num2) {
		result = num1 - num2;
		return result;
	}

	@Override
	public int calcularMultiplicacao(int num1, int num2) {
		result = num1 * num2;
		return result;
	}

	@Override
	public int calcularDivisao(int num1, int num2) {
		result = num1 / num2;
		return result;
	}

}
