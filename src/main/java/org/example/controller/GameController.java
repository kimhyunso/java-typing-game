package org.example.controller;

import org.example.model.GameModel;
import org.example.view.GameView;

public class GameController {
    private GameModel gameModel;
    private GameView gameView;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }
}