package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {

	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1º");
		Caixa c2 = new Caixa().comTexto("2º");
		Caixa c3 = new Caixa().comTexto("3º");
		Caixa c4 = new Caixa().comTexto("4º");
		Caixa c5 = new Caixa().comTexto("5º");
		Caixa c6 = new Caixa().comTexto("6º");

		getChildren().addAll(c1, c2, c3, c4, c5, c6);

		setOnMouseClicked(e -> {
			if (e.getSceneX() > getScene().getWidth() / 2) { // se a cena for dividida ao meio, p/ direita efetua uma
																// ação, p/ esq. outra;
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack();
			}
		});

		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);

					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (Exception e) {
				}

			}
		});
		t.setDaemon(true);
		t.start();
	}
}
