package com.jbs.rafflegame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

public class Screen {
    public Screen() {
        initInputProcessor();
    }

    public void initInputProcessor() {
        Gdx.input.setInputProcessor(new InputAdapter() {

            // Keyboard Input //
            @Override
            public boolean keyDown(int keyCode) {
                String key = Input.Keys.toString(keyCode);
                boolean shiftIsPressed = Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT) || Gdx.input.isKeyPressed(Input.Keys.SHIFT_RIGHT);
                boolean controlIsPressed = Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT) || Gdx.input.isKeyPressed(Input.Keys.CONTROL_RIGHT);

                // Exit Game //
                if(key.equals("Escape")) {
                    dispose();
                    System.exit(0);
                }

                return true;
            }
        });
    }

    public void update() {
    }

    public void render() {
    }

    public void dispose() {
    }
}
