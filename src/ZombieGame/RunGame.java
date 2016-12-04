package ZombieGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ZombieGame.Background;
import ZombieGame.Bullet;
import ZombieGame.Player;
import ZombieGame.Zombies;
import ZombieGame.Shoot;

public class RunGame extends Application{

	public static void main(String[] args) {
		Application.launch();
	}

	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 1000, 1000);

		primaryStage.setTitle("Zombles");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
}

