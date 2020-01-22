package main.java.breakoutgame.GameObjects;

import main.java.breakoutgame.GameHelpers.GameObject;

import javafx.scene.paint.Color;

public class Block extends GameObject {
    public static final int BLOCK_MARGIN = 1;
    public static final int BLOCK_WIDTH = 40 - 2 * BLOCK_MARGIN;
    public static final int BLOCK_HEIGHT = 20 - 2 * BLOCK_MARGIN;


    public Block(Map root, double x, double y) {
        super(root, x, y, BLOCK_WIDTH, BLOCK_HEIGHT);
    }

    @Override
    public void draw() {
        map.gc.setFill(Color.RED);
        map.gc.fillRect(position.x + BLOCK_MARGIN, position.y + BLOCK_MARGIN,
            BLOCK_WIDTH, BLOCK_HEIGHT);
    }
}