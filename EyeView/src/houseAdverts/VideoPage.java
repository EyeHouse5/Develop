package houseAdverts;

import java.util.ArrayList;

import Button.ButtonType;
import Button.SetupButton;

import presenter.SlideContent;
import presenter.Window;
import handlers.VideoElement;
import database.Database;
import database.House;
import database.HouseImage;
import database.HouseVideo;
import database.Marker;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import landlord.EditProperty.Browse;
import landlord.EditProperty.DeleteImage;
import landlord.EditProperty.Upload;
import language.Translate;

public class VideoPage extends Window {
	private static Label topTitle = new Label();
	private ArrayList<Marker> videoMarkers;
	
	public VideoPage() {
		setupTitle();
		setupVideoPlayer();
		UpdateLanguage();
		SlideContent.setupBackButton();

	}

	private void setupVideoPlayer() {

		StackPane videoPane = new StackPane();

		VideoElement video = new VideoElement("resources/videos/avengers-featurehp.mp4");
		video.setStylesheet("resources/videoStyle.css");
		video.setWidth(600);
		video.setAutoplay(false);
		video.display(videoPane);
		
		videoPane.relocate(300, 130);
		
		root.getChildren().add(videoPane);
	}
	
	public void setupTitle() {

		topTitle = new Label(Translate.translateText(languageIndex,"Video Tour"));
		topTitle.setTextFill(Color.web("#162252FF"));
		topTitle.setFont(new Font(32));
		topTitle.relocate(480, 80);
		root.getChildren().add(topTitle);
	}	
	
	public void UpdateLanguage() {
		topTitle.setText(Translate.translateText(languageIndex, "Video Tour"));
	}
	
	public void setupMarkerButtons(ArrayList<Marker> videoMarkers){
		
		this.videoMarkers = videoMarkers;
		
		TilePane markerTiles = new TilePane();
		markerTiles.setVgap(10);
		markerTiles.setHgap(10);
		markerTiles.setPadding(new Insets(20, 20, 20, 20));
		markerTiles.setTileAlignment(Pos.CENTER);
		markerTiles.setPrefColumns(2);
		ScrollPane markersWindow = new ScrollPane();
		markersWindow.setMinSize(545, 480);
		markersWindow.setMaxSize(545, 480);
		
		for (int i = 0; i < videoMarkers.size(); i++) {
			
			ButtonType button = new ButtonType("166,208,255", null,
					Translate.translateText(languageIndex, "Marker"), 70, 30);
			Button buttonBrowse = new SetupButton().CreateButton(button);
			buttonBrowse.setCursor(Cursor.HAND);
			buttonBrowse.setOnAction();
			
			markerTiles.getChildren().add(button);
					
		}
	
		markersWindow.setContent(markerTiles);
		markersWindow.relocate(300, 500);
		root.getChildren().add(markersWindow);

		GridPane.setConstraints(markersWindow, 0, 2, 3, 1, HPos.CENTER,
				VPos.CENTER);
	}
}
