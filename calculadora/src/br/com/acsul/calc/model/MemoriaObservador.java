package br.com.acsul.calc.model;
@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado(String novoValor);
}
