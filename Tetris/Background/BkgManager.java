package Tetris.Background;
import java.awt.*;

import Tetris.Constants;
import Tetris.Tile;

public class BkgManager {


    public BkgManager(){

    }

    public void draw(Graphics2D g2){
        for(int i = 0; i <= Constants.maxScreenCol; i++){
            for(int j = 0; j <= Constants.maxScreenRow; j++){
                new Tile().draw("B", Constants.tileSize*i, Constants.tileSize*j, g2);
            }
        }
    }
}
