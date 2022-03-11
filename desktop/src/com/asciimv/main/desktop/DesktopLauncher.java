package com.asciimv.main.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.asciimv.main.ASCIIMusicVisualizer;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.foregroundFPS = 0;
		config.backgroundFPS = 0;
		
		config.vSyncEnabled = false;
		
		config.width = 640;
		config.height = 480;
		
		new LwjglApplication(new ASCIIMusicVisualizer(), config);
	}
}
