package Button;

public class ButtonType {
	public String colourRGB;
	public String borderColourRGB;
	public String text;
	public double xSize;
	public double ySize;

	public ButtonType(String colourRGB, String borderColourRGB, String text,
			double xSize, double ySize) {
		this.colourRGB = colourRGB;
		this.borderColourRGB = borderColourRGB;
		this.text = text;
		this.xSize = xSize;
		this.ySize = ySize;
	}
}
