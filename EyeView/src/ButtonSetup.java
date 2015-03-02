import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Buttons with different background colours.
 *
 * @see javafx.scene.control.Button
 * @related controls/buttons/GraphicButton
 * @related controls/buttons/HyperlinkSample
 */

public class ButtonSetup {
	
	void setColour(Button button, String colour, String borderColour){ 
		//Colour example: "red" or "orange" 
		//String colour set the fill colour of the button
		//String borderColour sets colour of the border of the button
		button.setStyle("-fx-base: "+ colour +";-fx-background: "+ borderColour +";");
	}
	void setRGB(Button button, String RGB, String borderRGB){ 
		//RBG example: "30,170,255"
		//sets the colour and background colour of buttons in RGB
		button.setStyle("-fx-base: rgb("+ RGB +");-fx-background: rgb("+ borderRGB +");");
	} 
	void setText(Button button, String text){
		//sets the text of a button in string
		button.setText(text);
	}
	void setSize(Button button, int x, int y){
		//sets the size of the button
		button.setMinSize(x, y);
		button.setMaxSize(x, y);
	}
	void addButton(GridPane gridpane, Button button, int x, int y, int xSize, int ySize){
		//x and y sets the position on the GridPane
		//xSize and ySize specifies how many grid the button can cross on GridPane
		//This method only works on GridPane
		gridpane.add(button, x, y, xSize, ySize);
	}
	void addButton(GridPane gridpane, Button button, int x, int y){
		gridpane.add(button, x, y);
	}

}

/******************************example code******************************
public class HelloWorld extends Application {
	static ButtonSetup buttonSetup;
	
	public void start(Stage primaryStage) { 
		GridPane gridpane = new GridPane();
		buttonSetup = new ButtonSetup();
	
		gridpane.setGridLinesVisible(false);
		gridpane.setVgap(5);
		gridpane.setHgap(5);
		
		Button startBTN = new Button("Video	Tour");

		buttonSetup.setColour(startBTN, "blue", "red");
		buttonSetup.setSize(startBTN, 100, 50);		
		
		buttonSetup.addButton(gridpane, startBTN, 71, 0);			

	    Scene scene = new Scene(gridpane, 800, 800); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	    
	    
	    startBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("start button");
            }
        });
	}

public static void main(String[] args) { launch(args); } } 

 */

