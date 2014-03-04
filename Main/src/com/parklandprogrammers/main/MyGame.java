package com.parklandprogrammers.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;
import com.parklandprogrammers.main.screen.StartGameScreen;

/**
 * Created by aguggenberger on 3/4/14.
 */
public class MyGame extends Game {

    public static final String LOG = MyGame.class.getSimpleName();

    private FPSLogger fpsLogger;

    public static int getWidth(){
        return Gdx.graphics.getWidth();
    }

    public static int getHeight(){
        return Gdx.graphics.getHeight();
    }


    public StartGameScreen getStartGameScreen(){
        return new StartGameScreen(this);
    }


    // Game methods

    @Override
    public void create()  {
        Gdx.app.log(LOG, "Creating game" );
        Assets.load();
        fpsLogger = new FPSLogger();
        setScreen(getStartGameScreen());
    }

    @Override
    public void resize(int width, int height ){
        super.resize( width, height );
        Gdx.app.log( LOG, "Resizing game to: " + width + " x " + height );
    }

    @Override
    public void render(){
        super.render();
        // output the current FPS
        fpsLogger.log();
    }

    @Override
    public void pause(){
        super.pause();
        Gdx.app.log(LOG, "Pausing game");
    }

    @Override
    public void resume(){
        super.resume();
        Gdx.app.log(LOG, "Resuming game");
    }

    @Override
    public void setScreen(Screen screen){
        super.setScreen(screen);
        Gdx.app.log(LOG, "Setting screen: " + screen.getClass().getSimpleName());
    }

    @Override
    public void dispose(){
        Gdx.app.log(LOG, "Disposing game");
        Assets.dispose();
        super.dispose();
    }
}
