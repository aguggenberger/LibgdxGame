package com.parklandprogrammers.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.parklandprogrammers.main.Scene2dGame;

/**
 * Created by aguggenberger on 1/21/14.
 */
public class DesktopStarter {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.useGL20 = true;
        cfg.width = 800;
        cfg.height = 480;
        //new LwjglApplication(new DropGame(), cfg);
        //new LwjglApplication(new MyGDXGame(), cfg);
        new LwjglApplication(new Scene2dGame(), cfg);
    }
}