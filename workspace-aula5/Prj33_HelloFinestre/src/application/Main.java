package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;


public class Main extends Application {
	
	Stage window;
	Button button;
	int counter = 0;
	
	@Override
	public void start(Stage primaryStage) {
		try {
		
		window = primaryStage;
		
		window.setTitle("TSS 2022 - Il miglior corso tss 2022 del mondo!");
		
			GridPane root = new GridPane();
			root.setPadding(new Insets(10));
			root.setHgap(10);
			root.setVgap(10);
			
			
			button = new Button("Cliccami");
			
			Text text = new Text();
			
			button.setOnAction(e -> {
				System.out.println("prova");
				System.out.println(e.getSource());
				text.setText("ciao" + counter++);
			});
			
			
			GridPane.setConstraints(button, 0, 0);
			GridPane.setConstraints(text, 0, 1);
			

			root.getChildren().addAll(button, text);
			
			
			Scene scene = new Scene(root,400,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
