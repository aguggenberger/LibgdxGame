package com.parklandprogrammers.main.screen;

import com.parklandprogrammers.main.MyGame;
import com.parklandprogrammers.main.actor.BucketActor;
import com.parklandprogrammers.main.actor.DropActor;

/**
 * Created by aguggenberger on 3/4/14.
 */
public class StartGameScreen extends AbstractScreen {
    private BucketActor bucket;
    private DropActor drop;

    public StartGameScreen(MyGame game) {
        super(game);
        drop = new DropActor();
        bucket = new BucketActor();
        stage.addActor(bucket);
        //stage.addActor(drop);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
    }
}
