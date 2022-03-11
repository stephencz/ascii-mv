package com.asciimv.ui;

public class GridConfiguration
{

	/** The GridRenderer is responsible for rendering individual grid tiles. */
	protected GridRenderer gridRenderer;
	
	/** The grid's x axis location. */
	protected float gridX;
	
	/** The grid's y axis location. */
	protected float gridY;
	
	/** The number of pixels between each horizontal character. */
	protected float tileWidthPadding;
	
	/** The number of pixels between each vertical character. */
	protected float tileHeightPadding;
	
	/** The grid's width in tiles. */
	protected int gridWidth;
	
	/** The grid' height in tiles. */
	protected int gridHeight;
	
	/** The font size of the grid's individual characters. */
	protected int fontSize;
	
	public GridConfiguration(GridRenderer gr, int w, int h, int fontSize, float x, float y, float padX, float padY) {
		this.gridRenderer = gr;
		this.gridWidth = w;
		this.gridHeight = h;
		this.fontSize = fontSize;
		this.gridX = x;
		this.gridY = y;
		this.tileWidthPadding = padX;
		this.tileHeightPadding = padY;
	}
	
	
	public GridRenderer getGridRenderer() {
		return gridRenderer;
	}

	public void setGridRenderer(GridRenderer gr) {
		this.gridRenderer = gr;
	}

	public float getGridX() {
		return gridX;
	}

	public void setGridX(float gridX) {
		this.gridX = gridX;
	}

	public float getGridY() {
		return gridY;
	}

	public void setGridY(float gridY) {
		this.gridY = gridY;
	}

	public float getTileWidthPadding() {
		return tileWidthPadding;
	}

	public void setTileWidthPadding(float tileWidthPadding) {
		this.tileWidthPadding = tileWidthPadding;
	}

	public float getTileHeightPadding() {
		return tileHeightPadding;
	}

	public void setTileHeightPadding(float tileHeightPadding) {
		this.tileHeightPadding = tileHeightPadding;
	}

	public int getGridWidth() {
		return gridWidth;
	}

	public void setGridWidth(int gridWidth) {
		this.gridWidth = gridWidth;
	}

	public int getGridHeight() {
		return gridHeight;
	}

	public void setGridHeight(int gridHeight) {
		this.gridHeight = gridHeight;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	} 
	
}
