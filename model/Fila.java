package model;

public class Fila {
	
	private ListaLigada lista = new ListaLigada();
	
	public Object pegaPrimeiro() {
		return lista.pegaPrimeiro();
	}
	
	public Object pegaUltimo() {
		return lista.pegaUltimo();
	}
	
	public  void adicionar(Object novoElemento) {
		lista.adicionarNoFinal(novoElemento);
	}
	
	public void remover() {
		lista.removerDoComeco();
	}
	
	private boolean listaVazia() {
		return lista.tamanho() == 0;
	}
	
	public Object poll() {
	
		if(listaVazia()) {
			return null;
		} else {
			Object primeiro = lista.pegaPrimeiro();
			lista.removerDoComeco();
			return primeiro;
		}
	}
	
	public boolean contem (Object elementoBuscado) {
		return lista.contem(elementoBuscado);
	}
	
	public int tamanho() {
		return lista.tamanho();
	}

}
