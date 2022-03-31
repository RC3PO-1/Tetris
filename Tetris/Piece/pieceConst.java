package Tetris.Piece;

class pieceConst{
  //I,O,S,Z,T,L,J
  
  static final Block G = new Block("G", false);
  static final Block C = new Block("C", false);
  static final Block B = new Block("B", false);
  static final Block R = new Block("R", false);
  static final Block Y = new Block("Y", false);
  static final Block O = new Block("O", false);
  static final Block M = new Block("M", false);
  static final Block X = new Block("X", true);

  public static final Block[][][] pX = 
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

  public static final Block[][][] pI = 
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

  public static final Block[][][] pO = 
  {{{Y, Y}, 
    {Y, Y}},
   
   {{Y, Y}, 
    {Y, Y}},

   {{Y, Y}, 
    {Y, Y}},

   {{Y, Y}, 
    {Y, Y}}};

  public static final Block[][][] pS = 
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

  public static final Block[][][] pZ = 
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

  public static final Block[][][] pT = 
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

  public static final Block[][][] pL = 
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

  public static final Block[][][] pJ = 
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