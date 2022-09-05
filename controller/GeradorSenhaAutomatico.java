package controller;

public class GeradorSenhaAutomatico implements Runnable {

	FilaController controller;

	public GeradorSenhaAutomatico(FilaController controller) {
		this.controller = controller;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			controller.novaSenha();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
