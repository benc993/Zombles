package ZombieGame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import ZombieGame.Bullet;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;

public class Shoot implements MouseMotionListener, MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		EventHandler fireOrMove = new EventHandler() {
		    public void handle(MouseEvent event) {
		        if (event.getButton() == MouseButton.PRIMARY) {
		        }
		    }

			@Override
			public void handle(Event arg0) {
				// TODO Auto-generated method stub
				
			}
		}
		primaryStage.getScene().setOnMousePressed(Shoot);
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseDragged(MouseEvent arg0) {
		
	}

	public void mouseMoved(MouseEvent arg0) {
		
	}

		
	}

}
