package com.parklandprogrammers.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
/**
 * Created by aguggenberger on 2/25/14.
 */
public class Scene2dGame implements ApplicationListener {

    public class MyActor extends Actor {
        Texture texture = new Texture(Gdx.files.internal("texture/droplet.png"));

        public MyActor(){
            setBounds(0, 0, texture.getWidth(), texture.getHeight());
        }

        @Override
        public void draw(SpriteBatch batch, float parentAlpha) {
            super.draw(batch, parentAlpha);
            batch.draw(texture,0,0);
        }

        @Override
        public void act(float delta) {
            super.act(delta);
        }
    }

    private Stage stage;

    @Override
    public void create() {
        stage = new Stage(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(),true);
        Gdx.input.setInputProcessor(stage);

        MyActor myActor = new MyActor();

        myActor.addListener(new InputListener() {
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("down");
                return true;
            }

            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("up");
            }
        });
        stage.addActor(myActor);
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }
}
