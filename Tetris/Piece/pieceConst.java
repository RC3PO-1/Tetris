package Tetris.Piece;

class pieceConst{
  //I,O,S,Z,T,L,J
  
  static final PieceTile G = new PieceTile("GREEN", false);
  static final PieceTile C = new PieceTile("CYAN", false);
  static final PieceTile B = new PieceTile("BLUE", false);
  static final PieceTile R = new PieceTile("RED", false);
  static final PieceTile Y = new PieceTile("YELLOW", false);
  static final PieceTile O = new PieceTile("ORANGE", false);
  static final PieceTile M = new PieceTile("ORANGE", false);
  static final PieceTile X = new PieceTile("BLANK", true);

  public static final PieceTile[][][] pX = 
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

  public static final PieceTile[][][] pI = 
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

  public static final PieceTile[][][] pO = 
  {{{Y, Y}, 
    {Y, Y}},
   
   {{Y, Y}, 
    {Y, Y}},

   {{Y, Y}, 
    {Y, Y}},

   {{Y, Y}, 
    {Y, Y}}};

  public static final PieceTile[][][] pS = 
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

  public static final PieceTile[][][] pZ = 
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

  public static final PieceTile[][][] pT = 
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

  public static final PieceTile[][][] pL = 
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

  public static final PieceTile[][][] pJ = 
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