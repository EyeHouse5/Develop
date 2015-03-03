/**
 * 
 */
package parser;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author tp669
 *
 */
public class XMLParserTest {

	private XMLParser parser;
	private List<Slide> slides;
	private Slideshow slideshow;
	
	@Before
	public void setUp() throws Exception {
		parser = new XMLParser();
		slideshow = parser.loadSlideshow("Example PWS XML.xml");
	}
	
	@Test
	public void PaserShouldFindCollectReleventInformationAndStoreInCorrectList() {		
		assertTrue(slideshow.getSlides().get(0) instanceof Slide);
		assertTrue(slideshow.getSlides().get(0).getGraphicList().get(0) instanceof Graphic);
		assertTrue(slideshow.getSlides().get(0).getImageList().get(0) instanceof Image);
		assertTrue(slideshow.getSlides().get(0).getVideoList().get(0) instanceof Video);
		assertTrue(slideshow.getSlides().get(0).getAudioList().get(0) instanceof Audio);
		assertTrue(slideshow.getSlides().get(0).getTextList().get(0) instanceof Text);
	}
	
	@Test
	public void ListsShouldContainCorrectInformation() {
		assertEquals(slideshow.getInfo().getAuthor(), "EyeHouse");
		
		assertEquals(slideshow.getTitle(), "EyeView");
		
		assertEquals(slideshow.getSlides().get(0).getTitle(), "First Slide");
		assertEquals(slideshow.getSlides().get(0).getImageList().get(0).getSource(), "selfie.jpg");
		assertEquals(slideshow.getSlides().get(0).getAudioList().get(0).getSource(), "gavel.wav");
		
		assertEquals(slideshow.getSlides().get(1).getTitle(), "Second Slide");
		assertEquals(slideshow.getSlides().get(1).getImageList().get(0).getSource(), "companylogo.jpg");
		assertEquals(slideshow.getSlides().get(1).getAudioList().get(0).getSource(), "honk.wav");
	}
}
