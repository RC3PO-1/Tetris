package Tetris;

public class GameConst {
    public static final int origionalTileSize = 16;
    public static final int scale = 2;
  
    public static final int tileSize = origionalTileSize * scale;
    public static final int maxScreenCol = 18;
    public static final int maxScreenRow = 25;
    public static final int screenWidth = tileSize * maxScreenCol;
    public static final int screenHeight = tileSize * maxScreenRow;
    
    public static final int boardCol = 10;
    public static final int boardRow = 24;

    public static final int FPS = 60;

    //frames per drop
    public static final int L1_FPD = 30;
    public static final int L2_FPD = 60;
    public static final int L3_FPD = 60;
    public static final int L4_FPD = 60;
}
