package com.parklandprogrammers.main.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.parklandprogrammers.main.MyGame;

/**
 * Created by aguggenberger on 3/4/14.
 */
public class BucketActor extends Actor {
    Texture texture = new Texture(Gdx.files.internal("texture/bucket.png"));
    private final int playerX = 0;
    private final int playerY = 0;

    public BucketActor(){
        setBounds(playerX, playerY, texture.getWidth(), texture.getHeight());
        addListener(new InputListener(){
            @Override
            public boolean keyDown(InputEvent event, int keycode) {
                return super.keyDown(event, keycode);
            }

            public boolean touchDown (InputEvent event, float x, float y,
                                      int pointer, int button) {
                setPosition(getX() + 10, getY());
                Gdx.app.log(MyGame.LOG, "Value: " + event.getCharacter());
                return true;
            }
        });
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        //setPosition(getX() + delta, getY() + delta);
    }

    @Override
    public void draw (SpriteBatch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(texture, getX(), getY());
    }

}
