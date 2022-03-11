package com.asciimv.main;

import com.asciimv.ui.Grid;
import com.asciimv.ui.GridConfigurationDefault;
import com.asciimv.ui.GridRendererRandom;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class ASCIIMusicVisualizer extends ApplicationAdapter {
	
	private SpriteBatch batch;
	
	private OrthographicCamera camera;
	
	private FitViewport viewport;

	private GridConfigurationDefault config;
	
	private Grid grid;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		this.config = new GridConfigurationDefault(new GridRendererRandom());
		this.grid = new Grid(this.config);
		
		this.camera = new OrthographicCamera(Constants.VIEW_WIDTH, Constants.VIEW_HEIGHT);
		this.viewport = new FitViewport(Constants.VIEW_WIDTH, Constants.VIEW_HEIGHT, this.camera);
		this.camera.setToOrtho(false, Constants.VIEW_WIDTH, Constants.VIEW_HEIGHT);
		this.viewport.apply();
	
	}

	@Override
	public void render () {
		this.batch.setProjectionMatrix(this.camera.combined);
		ScreenUtils.clear(0f, 0f, 0f, 1);
		
		this.grid.render(this.batch);
		
		System.out.println(Gdx.graphics.getFramesPerSecond());
	}
	
	@Override
	public void resize(int width, int height) {
		this.viewport.update(width, height);
	}

	@Override
	public void dispose () {
		this.grid.dispose();
		this.batch.dispose();
	}
}
