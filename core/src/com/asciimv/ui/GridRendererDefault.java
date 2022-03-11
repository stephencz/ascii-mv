package com.asciimv.ui;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GridRendererDefault extends GridRenderer {

	
	@Override
	public void renderTile(GridConfiguration config, SpriteBatch batch, BitmapFont font, Tile tile) {
		
		font.setColor(tile.getRed(), tile.getGreen(), tile.getBlue(), 1f);
		font.draw(batch, tile.toString(), tile.getX(), tile.getY());
		
	}

	@Override
	public Tile getDefaultTile() {
		return new Tile('@', 0, 0, "#ff0000");
	}

}
