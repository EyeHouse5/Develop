import static org.junit.Assert.*;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author tp669
 *
 */
public class ButtonSetupTest {
	GridPane gridpane;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		gridpane = new GridPane();
		gridpane.setGridLinesVisible(false);
		gridpane.setVgap(5);
		gridpane.setHgap(5);
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void ColourOfButtonShouldBeSet(){
		ButtonSetup buttonSetup;
		buttonSetup = new ButtonSetup();
		Button testButton = new Button("test");
		buttonSetup.setColour(testButton, "blue", "red");
		String backgroundColour = buttonSetup.getColour();
		assertEquals("blue", backgroundColour);
	}
	
	@Test
	public void ColourOfButtonBorderShouldBeSet(){
		ButtonSetup buttonSetup;
		buttonSetup = new ButtonSetup();
		Button testButton = new Button("test");
		buttonSetup.setColour(testButton, "blue", "red");
		String backgroundBorderColour = buttonSetup.getBorderColour();
		assertEquals("red", backgroundBorderColour);
	}
	
	@Test
	public void TextOfButtonShouldBeSet(){
		ButtonSetup buttonSetup;
		buttonSetup = new ButtonSetup();
		Button testButton = new Button("test");
		buttonSetup.setText(testButton, "readThis");
		assertEquals("readThis", testButton.getText());
	}
	
	@Test
	public void SizeOfButtonShouldBeSet(){
		ButtonSetup buttonSetup = new ButtonSetup();
		Button testButton = new Button("test");
		
		buttonSetup.setSize(testButton, 50, 500);
		
		assertEquals(50, buttonSetup.getXSize());
		assertEquals(500, buttonSetup.getYSize());
	}  
	
	@Test
	public void LocationOfButtonShouldBeSet(){
		ButtonSetup buttonSetup = new ButtonSetup();
		Button testButton = new Button("test");
		
		buttonSetup.addButton(gridpane, testButton, 4, 3);
		
		assertEquals(4, buttonSetup.getXPos());
		assertEquals(3, buttonSetup.getYPos());
	}
}
