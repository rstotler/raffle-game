package com.jbs.rafflegame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import com.jbs.rafflegame.screen.Screen;

public class RaffleGame extends ApplicationAdapter {
	Screen screen;

	@Override
	public void create () {
		screen = new Screen();
	}

	@Override
	public void render () {
		screen.update();
		screen.render();
	}
	
	@Override
	public void dispose () {}
}
