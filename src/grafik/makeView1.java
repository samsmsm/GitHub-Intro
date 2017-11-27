package grafik;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class makeView1 extends Application {

public static final double WIDTH = 600;
public static final double HEIGHT = 600;

private ArrayList<KeyCode> keysPressed = new ArrayList<KeyCode>();
private AnimationTimer gameLoop;
private Group root = new Group();

@Override
public void start(Stage primaryStage) throws Exception {

	// Ändra siffran här nere till 1,2,3 eller 4 beroende på vilken vy du vill se!
	makeView1();

	primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
	primaryStage.show();
}

private void makeView1() {
	// TODO Auto-generated method stub
	int rows = 20;
	int cols = 10;

	double width = WIDTH / cols;
	double height = HEIGHT / rows;

	for (int row = 0; row < rows; row++) {

		for (int col = 0; col < cols; col++) {

			// Skapa en ny Rectangle
			Rectangle rect = new Rectangle(width, height);

			// Flytta rect i x-led så den kommer rätt
			rect.setTranslateX(col * width);

			// Flytta rect i y-led så den kommer rätt
			rect.setTranslateY(row * height);

			// Färglägg med en random färg
			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			rect.setFill(Color.rgb(r, g, b));

			// Lägg till rect så den syns i fönstret
			root.getChildren().add(rect);
		}
	}

}
}

