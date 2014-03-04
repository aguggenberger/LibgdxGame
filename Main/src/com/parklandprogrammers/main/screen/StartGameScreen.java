package com.parklandprogrammers.main.screen;

import com.parklandprogrammers.main.MyGame;
import com.parklandprogrammers.main.actor.DropActor;

/**
 * Created by aguggenberger on 3/4/14.
 */
public class StartGameScreen extends AbstractScreen {
    public StartGameScreen(MyGame game) {
        super(game);
        stage.addActor(new DropActor());
    }
}
