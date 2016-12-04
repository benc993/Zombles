package ZombieGame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {

	public static void main(String[] args) {
		Circle player = new Circle();
		player.setRadius(10);
		player.setStroke(Color.color(0.5, 0.5, 0.5, 1));
		Color obj = new Color (0,0,1,1.0);
		player.setFill(obj.darker());
		int playerHealth = 9;
		
		player.setCenterX(500);
		player.setCenterY(500);
		
		player.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case W:
				player.setCenterY(player.getCenterY() - 7);
				break;
			case A:
				player.setCenterX(player.getCenterX() - 7);
				break;
			case S:
				player.setCenterY(player.getCenterY() + 7);
				break;
			case D:
				player.setCenterX(player.getCenterX() + 7);
				break;
			case UP:
				player.setCenterY(player.getCenterY() - 7);
				break;
			case LEFT:
				player.setCenterX(player.getCenterX() - 7);
				break;
			case DOWN:
				player.setCenterY(player.getCenterY() + 7);
				break;
			case RIGHT:
				player.setCenterX(player.getCenterX() + 7);
				break;	
			}});
	}

}
