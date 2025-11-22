package com.magicalgirlbattlefxgl;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.ui.FXGLButton;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Player extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(800); //set the window size
        gameSettings.setHeight(500);
        gameSettings.setTitle("Magical Girl Arena");
        gameSettings.setVersion("0.1");
        gameSettings.setMainMenuEnabled(true);
        gameSettings.getSceneFactory().equals("selectedStyle");



    }



    @Override
    protected void initGame(){
        //factory is placed in world
        FXGL.getGameWorld().addEntityFactory((EntityFactory) new GameFactory());
        MagicalGirlFightStyle style = FXGL.geto("selectedStyle");

        if(style == null)
        {
            showMagicalGirlSelect();
            return;
        }



        SpawnData data = new SpawnData(400,300); //spawns magical gril
        data.put("style", style);

        FXGL.spawn("player", data);

        //spawn player as a circle rn test
        //Entity player = FXGL.spawn("player", 400,300);

    }

    private void showMagicalGirlSelect(){
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        //Title text
        Text title = new javafx.scene.text.Text("Choose your own character");

        //creation of buttons with text according to magical girl
        FXGLButton btnGun = new FXGLButton("Esme");
        FXGLButton btnJumboHammer = new FXGLButton("Astrid");
        FXGLButton btnDarkMagic = new FXGLButton("Iris");
        FXGLButton btnLightMagic = new FXGLButton("Evangeline");

        //buttons creates event to choose specific fight style according to magical girl
        btnGun.setOnAction(actionEvent -> chooseStyle(MagicalGirlFightStyle.gun));
        btnJumboHammer.setOnAction(actionEvent -> chooseStyle(MagicalGirlFightStyle.jumboHammer));
        btnDarkMagic.setOnAction(actionEvent -> chooseStyle(MagicalGirlFightStyle.darkMagic));
        btnLightMagic.setOnAction(actionEvent -> chooseStyle(MagicalGirlFightStyle.lightMagic));

        root.getChildren().addAll(title,btnGun,btnJumboHammer,btnDarkMagic,btnLightMagic);

        FXGL.getGameScene().addUINode(root);

    }

    private void chooseStyle(MagicalGirlFightStyle style){
        //magical girl choice variable saved
        FXGL.set("selectedStyle", style);

        //clear ui
        FXGL.getGameScene().clearUINodes();

        //start game with elements
        FXGL.getGameController().startNewGame();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
