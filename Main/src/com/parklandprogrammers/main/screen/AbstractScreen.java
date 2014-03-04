package com.parklandprogrammers.main.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.parklandprogrammers.main.Assets;
import com.parklandprogrammers.main.MyGame;

/**
 * Created by aguggenberger on 3/4/14.
 */
public abstract class AbstractScreen implements Screen {
    protected final MyGame game;
    protected final BitmapFont font;
    protected final SpriteBatch batch;
    protected final Stage stage;

    public AbstractScreen(MyGame game){
        this.game = game;
        this.font = new BitmapFont();
        this.batch = new SpriteBatch();
        this.stage = new Stage( 0, 0, true );
        Gdx.input.setInputProcessor(stage);
    }

    protected String getName(){
        return getClass().getSimpleName();
    }

    @Override
    public void show(){
        Gdx.app.log(MyGame.LOG, "Showing screen: " + getName() );
    }

    @Override
    public void resize(int width, int height ){
        Gdx.app.log(MyGame.LOG, "Resizing screen: " + getName() + " to: " + width + " x " + height );
        // resize the stage
        stage.setViewport( width, height, true );
    }

    @Override
    public void render(float delta){
        // the following code clears the screen with the given RGB color (black)
        Gdx.gl.glClearColor( 0f, 0f, 0f, 1f );
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT );

        // update and draw the stage actors
        stage.act( delta );
        stage.draw();
    }

    @Override
    public void hide(){
        Gdx.app.log(MyGame.LOG, "Hiding screen: " + getName() );
    }

    @Override
    public void pause(){
        Gdx.app.log(MyGame.LOG, "Pausing screen: " + getName() );
    }

    @Override
    public void resume(){
        Gdx.app.log(MyGame.LOG, "Resuming screen: " + getName() );
    }

    @Override
    public void dispose(){
        Gdx.app.log(MyGame.LOG, "Disposing screen: " + getName() );
        stage.dispose();
        font.dispose();
        batch.dispose();
    }

    public Skin getSkin() {
        return Assets.skin;
    }
}