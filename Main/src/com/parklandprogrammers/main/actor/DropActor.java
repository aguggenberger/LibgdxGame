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
public class DropActor extends Actor {
    private final float actorX = 0;
    private final float actorY = 0;
    Texture texture = new Texture(Gdx.files.internal("texture/droplet.png"));

    public DropActor(){
        setBounds(0, 0, texture.getWidth(), texture.getHeight());
        setBounds(actorX, actorY, texture.getWidth(),texture.getHeight());
        addListener(new InputListener(){
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.log(MyGame.LOG, "touchDown");
                return true;
            }
        });
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