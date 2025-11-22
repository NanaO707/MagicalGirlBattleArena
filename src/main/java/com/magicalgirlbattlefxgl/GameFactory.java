package com.magicalgirlbattlefxgl;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class GameFactory implements EntityFactory{

    @Spawns("player")

    public Entity spawnPlayer(SpawnData data){

        MagicalGirlFightStyle style = (MagicalGirlFightStyle) data.get("style");

        return FXGL.entityBuilder(data)
                .viewWithBBox(new Circle(20, Color.PURPLE))//testing circle for magic girl
                .buildAndAttach();

    }
}
