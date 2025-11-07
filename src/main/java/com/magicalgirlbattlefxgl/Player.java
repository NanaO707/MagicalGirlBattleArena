package com.magicalgirlbattlefxgl;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.MenuType;
import com.almasb.fxgl.dsl.FXGL;


public class Player extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(800); //set the window size
        gameSettings.setHeight(500);
        gameSettings.setTitle("Magical Girl Arena");
        gameSettings.setVersion("0.1");
        gameSettings.setMainMenuEnabled(true);


    }


    public static void main(String[] args) {
        launch(args);
    }
}
