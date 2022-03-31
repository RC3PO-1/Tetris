package Tetris;

public class Constants {
    public static final int origionalTileSize = 16;
    public static final int scale = 2;
  
    public static final int tileSize = origionalTileSize * scale;
    public static final int maxScreenCol = 12;
    public static final int maxScreenRow = 25;
    public static final int screenWidth = tileSize * maxScreenCol;
    public static final int screenHeight = tileSize * maxScreenRow;
    
    public static final int boardCol = 10;
    public static final int boardRow = 24;

    public static final int FPS = 1;//60;
}
