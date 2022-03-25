package Tetris;
class pieceConst{
  //I,O,S,Z,T,L,J
  
  static final Tile G = new Tile("GREEN", false);
  static final Tile C = new Tile("CYAN", false);
  static final Tile B = new Tile("BLUE", false);
  static final Tile R = new Tile("RED", false);
  static final Tile Y = new Tile("YELLOW", false);
  static final Tile O = new Tile("ORANGE", false);
  static final Tile M = new Tile("ORANGE", false);
  static final Tile X = new Tile("BLANK", true);

  public static final Tile[][][] pX = 
  { {{ X, X, X, X }, 
     { X, X, X, X },
     { X, X, X, X }, 
     { X, X, X, X }},
      
    {{ X, X, X, X }, 
     { X, X, X, X },
     { X, X, X, X }, 
     { X, X, X, X }},
      
    {{ X, X, X, X }, 
     { X, X, X, X },
     { X, X, X, X }, 
     { X, X, X, X }},
      
    {{ X, X, X, X }, 
     { X, X, X, X },
     { X, X, X, X }, 
     { X, X, X, X }}};

  public static final Tile[][][] pI = 
  { {{ X, X, X, X }, 
     { X, X, X, X },
     { R, R, R, R }, 
     { X, X, X, X }},
      
    {{ X, X, R, X }, 
     { X, X, R, X },
     { X, X, R, X }, 
     { X, X, R, X }},
      
    {{ X, X, X, X }, 
     { X, X, X, X },
     { R, R, R, R }, 
     { X, X, X, X }},
      
    {{ X, R, X, X }, 
     { X, R, X, X },
     { X, R, X, X }, 
     { X, R, X, X }}};

  public static final Tile[][][] pO = 
  {{{Y, Y}, 
    {Y, Y}},
   
   {{Y, Y}, 
    {Y, Y}},

   {{Y, Y}, 
    {Y, Y}},

   {{Y, Y}, 
    {Y, Y}}};

  public static final Tile[][][] pS = 
  { {{ X, X, X }, 
     { X, M, M },
     { M, M, X }},
      
    {{ X, M, X }, 
     { X, M, M },
     { X, X, M }},
      
    {{ X, X, X }, 
     { X, M, M },
     { M, M, X }},
      
    {{ M, X, X }, 
     { M, M, X },
     { X, M, X }}};

  public static final Tile[][][] pZ = 
  { {{ X, X, X }, 
     { G, G, X },
     { X, G, G }},
      
    {{ X, X, G }, 
     { X, G, G },
     { X, G, X }},
      
    {{ X, X, X }, 
     { G, G, X },
     { X, G, G }},
      
    {{ X, G, X }, 
     { G, G, X },
     { G, X, X }}};

  public static final Tile[][][] pT = 
  { {{ X, X, X }, 
     { C, C, C },
     { X, C, X }},
      
    {{ X, C, X }, 
     { C, C, X },
     { X, C, X }},
      
    {{ X, X, X }, 
     { X, C, X },
     { C, C, C }},
      
    {{ X, C, X }, 
     { X, C, C },
     { X, C, X }}};

  public static final Tile[][][] pL = 
  { {{ X, X, X }, 
     { O, O, O },
     { O, X, X }},
      
    {{ O, O, X }, 
     { X, O, X },
     { X, O, X }},
      
    {{ X, X, X }, 
     { X, X, O },
     { O, O, O }},
      
    {{ X, O, X }, 
     { X, O, X },
     { X, O, O }}};

  public static final Tile[][][] pJ = 
  { {{ X, X, X }, 
     { B, B, B },
     { X, X, B }},
      
    {{ X, B, X }, 
     { X, B, X },
     { B, B, X }},
      
    {{ X, X, X }, 
     { B, X, X },
     { B, B, B }},
      
    {{ X, B, B }, 
     { X, B, X },
     { X, B, X }}};
} 