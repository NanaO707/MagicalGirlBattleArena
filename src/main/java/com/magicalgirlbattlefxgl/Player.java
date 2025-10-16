package com.magicalgirlbattlefxgl;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class Player extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(800); //set the window size
        gameSettings.setHeight(500);
        gameSettings.setTitle("Magical Girl Fighting Arena");
        gameSettings.setVersion("0.1");

    }

    public static void main(String[] args) {
        launch(args);
    }
}
