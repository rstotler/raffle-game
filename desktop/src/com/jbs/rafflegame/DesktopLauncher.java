package com.jbs.rafflegame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(540, 960);
		config.setResizable(false);
		config.setForegroundFPS(60);
		config.setTitle("RaffleGame");
		new Lwjgl3Application(new RaffleGame(), config);
	}
}
