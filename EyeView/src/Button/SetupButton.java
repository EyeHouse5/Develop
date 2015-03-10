package Button;
/**
 * This class implements button element functions
 * 
 * @version 1
 * 27.02.15
 * @author EyeHouse
 * 
 * Copyright 2015 EyeHouse
 */

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SetupButton {
	ButtonType buttonData;
	Button button = new Button();
	
	public Button CreateButton(ButtonType buttonData){
		this.buttonData = buttonData;
		setButtonRGB();
		setButtonText();
		setButtonSize();
		return this.button;
	}
	
	private void setButtonRGB() {
		button.setStyle("-fx-base: rgb(" + buttonData.colourRGB + ");-fx-border-color: rgb("
				+ buttonData.borderColourRGB + ");");
		
	}//-fx-base: rgb(
	//"-fx-background-color:(#" + buttonData.colourRGB + ");-fx-border-color:(#+ buttonData.borderColourRGB + ");
	
	private void setButtonText() {
		button.setText(buttonData.text);
	}
	
	private void setButtonSize() {
		button.setMinSize(buttonData.xSize, buttonData.ySize);
		button.setMaxSize(buttonData.xSize, buttonData.ySize);
	}

	/**
	 * This method sets the image of a button
	 * @param imageButton
	 * 			The button to be modified.
	 * 			
	 * @param image
	 * 			The image to be added to the button.
	 * @return
	 * 			Button object with image.
	 */
	public Button setButtonImage(Button imageButton, Image image) {

		// Add the image and text to the button
		imageButton.setGraphic(new ImageView(image));
		// Display the image and text in the centre of the button
		return imageButton;
	}
}


