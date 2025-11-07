package com.magicalgirlbattlefxgl;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.MenuType;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import org.jetbrains.annotations.NotNull;
import javafx.scene.control.Button;


public class MainMenu  extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(800); //set the window size
        gameSettings.setHeight(500);
    }


    protected void initMainMenu(Pane mainMenuRoot){
        Rectangle bg = new Rectangle(800,500);

        Font font = Font.font(60);

        Button btnStart = new Button("Start");
        btnStart.setFont(font);
        //btnStart.setOnAction(event-> startGame);
    }
}



