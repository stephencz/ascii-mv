package com.asciimv.ui;

import javax.sound.sampled.AudioInputStream;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.utils.Disposable;

/**
 * The {@link Grid} class represents a two dimensional grid of ASCII
 * {@link Tile}. The {@link Grid} is configured using a {@link GridConfiguration}
 * object. Tiles are rendered using the {@link GridRenderer} set inside
 * the {@link GridConfiguration}.
 * 
 * @author Stephen Czekalski
 *
 */
public class Grid implements Disposable {
	
	private AudioInputStream audioInputStream;
	
	/** Used to generate the {@link BitmapFont}. */
	private FreeTypeFontGenerator generator;
	
	/** Font parameters for the generator. */
	private FreeTypeFontParameter parameter;
	
	/** The font used to for the grid's characters. */
	private BitmapFont font;
	
	/** Configuration details for the grid. */
	protected GridConfiguration config;
	
	/** A two-dimensional array of ascii characters. */
	protected Tile grid[][];
	
	public Grid(GridConfiguration config) {
			
		this.config = config;
		
		this.initializeFont();
		this.initializeGrid();
	}
	
	/**
	 * Initializes the {@link Grid} with the {@link GridRenderer}'s
	 * default {@link Tile} object.
	 */
	private void initializeGrid() {
		this.grid = new Tile[this.config.gridHeight][this.config.gridWidth];
		
		for(int i = 0; i < this.config.gridHeight; i++) {
			for(int j = 0; j < this.config.gridWidth; j++) {
				grid[i][j] = this.config.getGridRenderer().getDefaultTile();
			}
		}
	}
	
	/** Initializes the {@link BitmapFont} used to render text. */
	private void initializeFont() {
		
		if(this.font != null) {
			this.font.dispose();
		}
		
		this.generator = new FreeTypeFontGenerator(Gdx.files.internal(("FiraCode-Regular.ttf")));
		this.parameter = new FreeTypeFontParameter();
		
		this.parameter.size = this.config.fontSize;
		this.font = generator.generateFont(this.parameter);
	}
	
	private void initialAudioInputStream() {
		
	}
	
	/** Renders the {@link Grid} using the {@link GridConfiguration}'s {@link GridRenderer}. */
	public void render(SpriteBatch batch) {
		
		batch.begin();
		
		for(int i = 0; i < this.config.gridHeight; i++) {
			for(int j = 0; j < this.config.gridWidth; j++) {
				Tile tile = this.grid[i][j];
						
				grid[i][j].setX(this.config.gridX + (this.config.tileWidthPadding * j));
				grid[i][j].setY(this.config.gridY + (this.config.tileHeightPadding * i));
				grid[i][j].setRow(i);
				grid[i][j].setColumn(j);
				
				this.config.getGridRenderer().renderTile(this.config, batch, this.font, tile);
			}
		}
		
		batch.end();
	}
	
	@Override
	public void dispose() {
		this.generator.dispose();
		this.font.dispose();
	}

	public Tile[][] getGrid() {
		return grid;
	}

	public void setGrid(Tile[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Sets the {@link GridConfiguration} of the {@link Grid}.
	 * @param config {@link GridConfiguration}
	 */
	public void setConfig(GridConfiguration config) {
		
		if(config.gridWidth != this.config.gridWidth || config.gridHeight != this.config.gridHeight) {
			this.config.setGridWidth(config.getGridWidth());
			this.config.setGridHeight(config.getGridHeight());

			this.initializeGrid();
		}
		
		if(config.fontSize != this.config.fontSize) {
			this.config.setFontSize(config.getFontSize());
			this.initializeFont();
		}
		
		this.config.setGridX(config.getGridX());
		this.config.setGridY(config.getGridY());
		this.config.setTileWidthPadding(config.getTileWidthPadding());
		this.config.setTileHeightPadding(config.getTileHeightPadding());
		this.config.setGridRenderer(config.getGridRenderer());
	}
	
	/** @return {@link GridConfiguration} */
	public GridConfiguration getConfig() {
		return this.config;
	}
	
	/**
	 * Sets the {@link Grid} x and y axis positions on screen.
	 * @param x
	 * @param y 
	 */
	public void setGridXY(float x, float y) {
		this.config.setGridX(x);
		this.config.setGridY(y);
	}
}
