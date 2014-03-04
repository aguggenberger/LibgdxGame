package com.parklandprogrammers.main.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.parklandprogrammers.main.MyGame;

import static com.badlogic.gdx.Gdx.*;

/**
 * Created by aguggenberger on 3/4/14.
 */
public abstract class GameScreen implements Screen {

    protected final SpriteBatch batch;
    protected final OrthographicCamera camera;

    @Override
    public void render(float delta) {
        update(delta);

        camera.update();
        camera.apply(gl10);

        //batch.setProjectionMatrix(camera.combined);

        gl.glClearColor(0, 0, 0, 1);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        draw(delta);
    }

    @Override
    public void resize(int width, int height) {
        log(String.format("Resizing screen to: %dx%d", width, height));
    }

    @Override
    public void show() {
        log("Showing screen: " + getName());
    }

    @Override
    public void hide() {
        log("Hiding screen: " + getName());
    }

    @Override
    public void pause() {
        log("Pausing screen: " + getName());
    }

    @Override
    public void resume() {
        log("Resuming screen: " + getName());
    }

    @Override
    public void dispose() {
        log("Disposing screen: " + getName());
        unload();
    }

    protected void log(String text) {
        Gdx.app.log(getName(), text);
    }

    protected void update(float delta) {}
    protected abstract void draw(float delta);

    public void load() {}
    protected void unload() {}
}