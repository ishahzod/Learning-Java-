//Shahzodjon Ismatov (110518374)
import java.util.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class GUI extends Application {
	
	Button [][] bs = new Button[6][6];
	
	TextField car = new TextField("1");
	TextField x = new TextField("3");
	TextField y = new TextField("5");
	TextField dir = new TextField("1");
	TextField size = new TextField("2");
	
	Stage window;
	Scene intro, gameplay;
	
	public void start(Stage primaryStage) throws Exception{
		RushHour game = new RushHour();
		
		window = primaryStage;
		
		GridPane gridPane = new GridPane();
		gridPane.setGridLinesVisible(true);
		game.PlacingCars();
		
		Hashtable<Integer, String> t = new Hashtable();
		t.put(1, "red");
		t.put(2, "orange");
		t.put(3, "yellow");
		t.put(4, "green");
		t.put(5, "blue");
		t.put(6, "purple");
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				bs[i][j] = new Button("" + game.board[i][j]);
				bs[i][j].setStyle("-fx-font: 65 arial; -fx-base: #b6e7c9;" 
				+ "-fx-background-color: " + t.get(game.board[i][j]) + ";");
				gridPane.add(bs[i][j], j, i);
			}
		}
		
		

		Button button = new Button("Next");
		button.setStyle("-fx-font: 15 arial); -fx-base: #b6e7c9; ");
		button.setOnAction(e -> {
			game.moveCar(Integer.parseInt(car.getText()), Integer.parseInt(x.getText())-1, Integer.parseInt(y.getText())-1, Integer.parseInt(dir.getText())-1, Integer.parseInt(size.getText())-1);
			
			for(int i = 0; i<6; i++){
				for(int j = 0; j<6; j++){
					bs[i][j].setText("" + game.board[i][j]);
					bs[i][j].setStyle("-fx-font: 65 arial; -fx-base: #b6e7c9;" 
							+ "-fx-background-color: " + t.get(game.board[i][j]) + ";");
				}
			}
		});
		
		
		VBox borderPane = new VBox();
		gridPane.setAlignment(Pos.CENTER);
		borderPane.getChildren().add(gridPane);
		

		Label greeting = new Label ("Welcome to RUSH HOUR!");
		Button introscreen = new Button("Start");
		introscreen.setOnAction(e -> window.setScene(gameplay));
	
		
		StackPane Layout2 = new StackPane();;
		Layout2.getChildren().add(introscreen);
		gameplay = new Scene(Layout2,200, 200);
		
		HBox h = new HBox();
		h.getChildren().add(car);
		h.getChildren().add(x);
		h.getChildren().add(y);
		h.getChildren().add(dir);
		h.getChildren().add(size);
		h.getChildren().add(button);
		
		borderPane.getChildren().add(h);
		
		Scene scene = new Scene(borderPane, 1280, 720);
		window.setScene(gameplay);
		window.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);

	}

}




