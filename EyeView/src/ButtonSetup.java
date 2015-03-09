/**
 * This class implements button element functions
 * 
 * @version 1
 * 27.02.15
 * @author EyeHouse
 * 
 * Copyright 2015 EyeHouse
 */

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


public class ButtonSetup {
	private String buttonColour, buttonBorderColour, buttonColourRGB,
			buttonBorderColourRGB, buttonText;
	private int xSize, ySize, xPos, yPos, xGridSize, yGridSize;

	/**
	 * This method is to set up the colour of a button with popular colour options
	 * @param button
	 * 			the name of the button
	 * @param colour
	 * 			the background colour of the button
	 * @param borderColour
	 * 			the border colour of the button
	 */
	void setColour(Button button, String colour, String borderColour) {
		buttonColour = colour;
		buttonBorderColour = borderColour;
		button.setStyle("-fx-base: " + colour + ";-fx-background: "
				+ borderColour + ";");
	}

	/**
	 * This method is to set up the colour of a button in RGB
	 * @param button
	 * 			the name of the button
	 * @param RGB
	 * 			the background colour in RGB of the button 
	 * @param borderRGB
	 * 			the border colour in RGB of the button
	 */
	
	void setRGB(Button button, String RGB, String borderRGB) {
		buttonColourRGB = RGB;
		buttonBorderColourRGB = borderRGB;
		button.setStyle("-fx-base: rgb(" + RGB + ");-fx-background: rgb("
				+ borderRGB + ");");
	}
	
	/**
	 * This method is to set the text on the button
	 * @param button
	 * 			the name of the button
	 * @param text
	 * 			the text on the button
	 */
	
	void setText(Button button, String text) {
		buttonText = text;
		button.setText(text);
	}

	/**
	 * This method is to set the size of a button	
	 * @param button
	 * 			the name of the button
	 * @param x
	 * 			the length of the button in horizontal
	 * @param y
	 * 			the length of the button in vertical
	 */
	
	void setSize(Button button, int x, int y) {
		xSize = x;
		ySize = y;
		button.setMinSize(x, y);
		button.setMaxSize(x, y);
	}

	/**
	 * This method is to add the button without size on the panel
	 * @param gridpane
	 * 			
	 * @param button
	 * 			the name of the button
	 * @param x
	 * 			the horizontal position of the button
	 * @param y
	 * 			the vertical position of the button
	 * @param xSize
	 * 			the length of the grid in horizontal
	 * @param ySize
	 * 			the length of the grid in vertical
	 */
	void addButton(GridPane gridpane, Button button, int x, int y, int xSize,
			int ySize) {
		xPos = x;
		yPos = y;
		xGridSize = xSize;
		yGridSize = ySize;
		gridpane.add(button, x, y, xSize, ySize);
	}

	/**
	 * This method is to add the button with size on the panel	
	 * @param gridpane
	 * 			
	 * @param button
	 * 			the name of the button
	 * @param x
	 * 			the horizontal position of the button
	 * @param y
	 * 			the vertical position of the button
	 */
	void addButton(GridPane gridpane, Button button, int x, int y) {
		xPos = x;
		yPos = y;
		gridpane.add(button, x, y);
	}

	/**
	 * This method is to set the image button
	 * @param primaryStage
	 * 			
	 * @param image
	 * 			the image on the button
	 * @param text
	 * 			the text on the button
	 * @return
	 * 			get the button after setting
	 */
	Button setImage(Stage primaryStage, Image image, String text) {
		// Define a group for content on the button
		Group root = new Group();
		primaryStage.setResizable(false);
		// Set the location of the button
		primaryStage.setScene(new Scene(root, 40, 10));
		// Load image
		ImageView imageView = new ImageView(image);
		// Add the image and text to the button
		Button button = new Button(text, imageView);
		// Display the image and text in the centre of the button
		button.setContentDisplay(ContentDisplay.CENTER);
		root.getChildren().add(button);
		return button;
	}

	/**
	 * This method is to set the hyperlink
	 * @param primaryStage
	 * 			
	 * @param image
	 * 			the image of the hyperlink
	 * @param text
	 * 			the text of the hyperlink
	 * @return
	 * 			get the hyperlink after setting
	 */
	Hyperlink setHyperlink(Stage primaryStage, Image image, String text) {
		// Define a group for content of the hyperlink
		Group root = new Group();
		primaryStage.setResizable(false);
		// Set the location of the hyperlink
		primaryStage.setScene(new Scene(root, 400, 100));
		// Set the height of vbox to be 5 and display in centre left
		VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setAlignment(Pos.CENTER_LEFT);
		// Define the text of hyperlink
		Hyperlink h2 = new Hyperlink(text);
		// load and display image for hyperlink
		if (image != null) {
			ImageView iv = new ImageView(image);
			h2.setGraphic(iv);
		}

		vbox.getChildren().add(h2);
		root.getChildren().add(vbox);
		return h2;
	}

	/**
	 * This returns the original background colour of the button
	 * @return the original background colour of the button before any processing
	 */
	String getColour() {
		return buttonColour;
	}
	
	/**
	 * This returns the original border colour of the button
	 * @return the original border colour of the button before any processing
	 */
	String getBorderColour() {
		return buttonBorderColour;
	}
	
	/**
	 * This returns the original background colour in RGB of the button
	 * @return the original background colour in RGB of the button before any processing
	 */
	String getColourRGB() {
		return buttonColourRGB;
	}
	
	/**
	 * This returns the original border colour in RGB of the button
	 * @return the original border colour in RGB of the button before any processing
	 */
	String getBorderColourRGB() {
		return buttonBorderColourRGB;
	}
	
	/**
	 * This returns the original text on the button
	 * @return the original text on the button before any processing
	 */
	String getText() {
		return buttonText;
	}

	/**
	 * This returns the original horizontal length on the button
	 * @return the original horizontal length of the button before any processing
	 */
	int getXSize() {
		return xSize;
	}

	/**
	 * This returns the original vertical length on the button
	 * @return the original vertical length of the button before any processing
	 */	
	int getYSize() {
		return ySize;
	}

	/**
	 * This returns the original horizontal position of the button
	 * @return the original horizontal position f the button before any processing
	 */	
	int getXPos() {
		return xPos;
	}

	/**
	 * This returns the original vertical position of the button
	 * @return the original vertical position of the button before any processing
	 */	
	int getYPos() {
		return yPos;
	}

	/**
	 * This returns the original horizontal size of the grid
	 * @return the original horizontal size of the grid before any processing
	 */	
	int getXGridSize() {
		return xGridSize;
	}

	/**
	 * This returns the original vertical size of the grid
	 * @return the original vertical size of the grid before any processing
	 */		
	int getYGridSize() {
		return yGridSize;
	}

}


