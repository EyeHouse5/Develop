import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Buttons with different background colours.
 * @author tp669, MingdiZ
 * @see javafx.scene.control.Button
 * @related controls/buttons/GraphicButton
 * @related controls/buttons/HyperlinkSample
 */

public class ButtonSetup {
	private String buttonColour, buttonBorderColour, buttonColourRGB, buttonBorderColourRGB, buttonText;
	private int xSize, ySize, xPos, yPos, xGridSize, yGridSize;
	
	void setColour(Button button, String colour, String borderColour){ 
		//Colour example: "red" or "orange" 
		//String colour set the fill colour of the button
		//String borderColour sets colour of the border of the button
		buttonColour = colour;
		buttonBorderColour = borderColour;
		button.setStyle("-fx-base: "+ colour +";-fx-background: "+ borderColour +";");
	}
	void setRGB(Button button, String RGB, String borderRGB){ 
		//RBG example: "30,170,255"
		//sets the colour and background colour of buttons in RGB
		buttonColourRGB = RGB;
		buttonBorderColourRGB = borderRGB;
		button.setStyle("-fx-base: rgb("+ RGB +");-fx-background: rgb("+ borderRGB +");");
	} 
	void setText(Button button, String text){
		//sets the text of a button in string
		buttonText = text;
		button.setText(text);
	}
	void setSize(Button button, int x, int y){
		//sets the size of the button
		xSize = x;
		ySize = y;
		button.setMinSize(x, y);
		button.setMaxSize(x, y);
	}
	void addButton(GridPane gridpane, Button button, int x, int y, int xSize, int ySize){
		/*x and y sets the position on the GridPane.
		xSize and ySize specifies how many grid the button can cross on GridPane
		This method only works on GridPane*/
		xPos = x;
		yPos = y;
		xGridSize = xSize;
		yGridSize = ySize;
		gridpane.add(button, x, y, xSize, ySize);
	}
	void addButton(GridPane gridpane, Button button, int x, int y){
		xPos = x;
		yPos = y;
		gridpane.add(button, x, y);
	}
	Button setImage(Stage primaryStage, Image image, String text){
		/*This method returns the image that is passed in as a button.
		Note that the image but be the size that you require the
		button to be. For ease, save image in bin folder.*/
		Group root = new Group();
		primaryStage.setResizable(false);
		primaryStage.setScene(new Scene(root, 40, 10));
		ImageView imageView = new ImageView(image);
		Button button = new Button(text, imageView);
		button.setContentDisplay(ContentDisplay.CENTER);
		root.getChildren().add(button);	
		return button;
	}
	Hyperlink setHyperlink(Stage primaryStage, Image image, String text){
		/*This method returns a hyperlink with the text and image passed in.
		 * If no image is needed then pass null.*/
		Group root = new Group();        
		primaryStage.setResizable(false);        
		primaryStage.setScene(new Scene(root, 400,100));        
		VBox vbox = new VBox();        
		vbox.setSpacing(5);        
		vbox.setAlignment(Pos.CENTER_LEFT);         
		Hyperlink h2 = new Hyperlink(text);
		
		if(image != null){
			ImageView iv = new ImageView(image);
			h2.setGraphic(iv);
		}
				
		vbox.getChildren().add(h2);        
		root.getChildren().add(vbox);
		return h2;
	}
	String getColour(){
		return buttonColour;
	}
	String getBorderColour(){
		return buttonBorderColour;
	}
	String getColourRGB(){
		return buttonColourRGB;
	}
	String getBorderColourRGB(){
		return buttonBorderColourRGB;
	}
	String getText(){
		return buttonText;
	}
	int getXSize(){
		return xSize;
	}
	int getYSize(){
		return ySize;
	}
	int getXPos(){
		return xPos;
	}
	int getYPos(){
		return yPos;
	}
	int getXGridSize(){
		return xGridSize;
	}
	int getYGridSize(){
		return yGridSize;
	}

}
//the following shows how to correctly use ButtonSetup.java:

/******************************example code******************************
public class HelloWorld extends Application {
	static ButtonSetup buttonSetup;
	private static final Image ICON_48 = new Image(
			HelloWorld.class.getResourceAsStream("UK_flag.png"));
			
	public void start(Stage primaryStage) { 
		GridPane gridpane = new GridPane();
		buttonSetup = new ButtonSetup();
	
		gridpane.setGridLinesVisible(false);
		gridpane.setVgap(5);
		gridpane.setHgap(5);
		
		Button startBTN = new Button("Video	Tour");
		Button imageButton = buttonSetup.setImage(primaryStage, ICON_48, "ohhh yeah!");
	
		buttonSetup.setColour(startBTN, "blue", "red");
		buttonSetup.setSize(startBTN, 100, 50);		
		
		buttonSetup.setSize(imageButton, 100, 50);
		
		buttonSetup.addButton(gridpane, startBTN, 71, 0);			
		buttonSetup.addButton(gridpane, imageButton, 70, 50);
		
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

