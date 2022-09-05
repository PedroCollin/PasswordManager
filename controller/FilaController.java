package controller;

import model.Fila;

public class FilaController {

	Fila fila = new Fila();
	Runnable runnable = new GeradorSenhaAutomatico(this);
	Thread thread = new Thread(runnable);

	public void novaSenha() {
		System.out.println("\n tratar uma nova senha...");

	}

	public void atender() {
		System.out.println("\n tratar um atendimento da fila...");
	}

	public void gerarSenhaAutomaticamente() {
		System.out.println("\n tratar geracao automatica de senhas...");
		thread.start();
	}
}
