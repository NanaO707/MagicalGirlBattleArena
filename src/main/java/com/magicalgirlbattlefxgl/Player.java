package com.magicalgirlbattlefxgl;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;


public class Player extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(800); //set the window size
        gameSettings.setHeight(500);
        gameSettings.setTitle("Magical Girl Arena");
        gameSettings.setVersion("0.1");
        gameSettings.setMainMenuEnabled(true);


    }

    @Override
    protected void initGame(){
        //factory is placed in world
        FXGL.getGameWorld().addEntityFactory((EntityFactory) new GameFactory());

        //spawn player as a circle rn test
        Entity player = FXGL.spawn("player, 400,300");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
