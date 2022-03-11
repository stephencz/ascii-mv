package com.asciimv.ui;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GridRendererRandom extends GridRenderer
{

	@Override
	public Tile getDefaultTile()
	{
		return new Tile(generateRandomCharacter(33, 125), 0, 0, generateRandomColor(), generateRandomColor(), generateRandomColor());
	}

	@Override
	public void renderTile(GridConfiguration config, SpriteBatch batch, BitmapFont font, Tile tile)
	{
	
		tile.setCharacter(generateRandomCharacter(33, 125));
		tile.setRed(generateRandomColor());
		tile.setGreen(generateRandomColor());
		tile.setBlue(generateRandomColor());
		
		font.setColor(tile.getRed(), tile.getGreen(), tile.getBlue(), 1f);
		font.draw(batch, tile.toString(), tile.getX(), tile.getY());
	}
	
}
