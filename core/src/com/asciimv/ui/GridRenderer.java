package com.asciimv.ui;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * The {@link GridRenderer} abstract class provides an interface
 * for rendering individual tiles of a {@link Grid}. The goal of
 * the {@link GridRenderer} class is to provide a general API and
 * a collection of utility functions so that a wide variety of 
 * rendering effects can be implemented.
 * 
 * @author Stephen Czekalski
 *
 */
public abstract class GridRenderer {

	/** @returns A {@link Tile} used as the default tile in the {@link Grid} */
	abstract public Tile getDefaultTile();
	
	/**
	 * Render's an individual tile.
	 * @param config {@link GridConfiguration}
	 * @param batch {@link SpriteBatch}
	 * @param font {@link BitmapFont}
	 * @param tile {@link Tile}
	 */
	abstract public void renderTile(GridConfiguration config, SpriteBatch batch, BitmapFont font, Tile tile);

	/**
	 * Gets a Tile's vertical offset (y-axis) from the most center line.
	 * @param config
	 * @param tile
	 * @return
	 */
	protected int getTileVOffset(GridConfiguration config, Tile tile) {
		return tile.getRow() - (config.getGridHeight() / 2);
	}
	
	/**
	 * Gets a Tile's horizontal offset (x-axis) from the most center line.
	 * @param config
	 * @param tile
	 * @return
	 */
	protected int getTileHOffset(GridConfiguration config, Tile tile) {
		return tile.getColumn() - (config.getGridWidth() / 2);
	}
	
	/**
	 * Get's the absolute value of the Tile's vertical offset.
	 * @param config
	 * @param tile
	 * @return
	 */
	protected int getTileVOffsetAbs(GridConfiguration config, Tile tile) {
		return Math.abs(getTileVOffset(config, tile));
	}	
	
	/**
	 * Get's the absolute value of the Tile's horizontal offset.
	 * @param config
	 * @param tile
	 * @return
	 */
	protected int getTileHOffsetAbs(GridConfiguration config, Tile tile) {
		return Math.abs(getTileHOffset(config, tile));
	}
	
	/**
	 * Generates random value between 0.0f and 1.0f.
	 * @return
	 */
	protected float generateRandomColor() {
		
		Random rand = new Random();
		return rand.nextFloat();
	}
	
	/**
	 * Generates a random ASCII character between a min and max character id.
	 * @param asciiMin
	 * @param asciiMax
	 * @return
	 */
	protected char generateRandomCharacter(int asciiMin, int asciiMax) {
		int ascii = ThreadLocalRandom.current().nextInt(asciiMin, asciiMax + 1);
		return Character.toString((char) ascii ).charAt(0);
	}
}
