package service;


public class Calculatorimpl implements Calculator {

	@Override
	public Double logaritmoNatural(Double valor) {
		return Math.log(valor);
	}

	@Override
	public Double sin(Double valor) {
		return Math.sin(valor);
	}
	
}
