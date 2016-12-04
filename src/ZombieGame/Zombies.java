package ZombieGame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Zombies {

	public static void main(String[] args) {
		
		Color zombie = new Color (1, 0, 0, 1.0);
		
		Circle regularZombie = new Circle();
		regularZombie.setRadius(10);
		regularZombie.setStroke(Color.color(0.5, 0.5, 0.5, 1));
		regularZombie.setFill(zombie.darker());
		int regZombieHealth = 5;
		
		Circle bigZombie = new Circle();
		bigZombie.setRadius(15);
		bigZombie.setStroke(Color.color(0.5, 0.5, 0.5, 1));
		bigZombie.setFill(zombie.darker());
		int bigZombieHealth = 10;
		
		Circle bossZombie = new Circle();
		bossZombie.setRadius(20);
		bossZombie.setStroke(Color.color(0.5, 0.5, 0.5, 1));
		bossZombie.setFill(zombie.darker());
		int bossZombieHealth = 20;

	}

}
