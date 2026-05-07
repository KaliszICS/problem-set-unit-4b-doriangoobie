public class GameBoard {
    
    private String[][] board;
    private GamePiece[][] board1;
    
    /**
    * Default constructor for the GameBoard class
    */

    public GameBoard() {
        this.board = new String[4][4];
        for (int i = 0; (this.board).length > i; i++) {
           for (int j = 0; j < (this.board[i]).length; j++) {
               this.board[i][j] = "Empty";
           }
        }
        this.board[0][0] = "Start";
        this.board[0][0] = "Start";
        this.board[4][4] = "End";
        this.board[0][3] = "Bonus";
        this.board[1][0] = "Penalty";
        this.board[1][2] = "Bonus";
        this.board[2][1] = "Penalty";
        this.board[3][0] = "Bonus";
        this.board[3][4] = "Bonus";
        this.board[3][2] = "Penalty";
        this.board[4][3] = "Penalty";
        this.board1 = new GamePiece[5][5];
    }
        
        /**
        * Constructor for the GameBoard, in the form of a 2D array
        * @param board A 2D array board with rows and columns
        * @throws NullPointerException if board is null
        * @throws IllegalArgumentException if board is not a perfect square
        */
    
        public GameBoard (String[][] board) throws NullPointerException, IllegalArgumentException {
        if (board == null) {
           throw new NullPointerException("Board cannot be null");
       }
       if (board.length >=1 && board[0].length >=1) {
           throw new IllegalArgumentException("Game board must be greater than 1:1");
       }
       for (String[] x: board) {
           if (x.length != board[0].length) {
               throw new IllegalArgumentException ("Board must be a perfect square");
           }
       }
       this.board = board;
       this.board1 = new GamePiece [board.length][board[0].length];
    }
    
        /**
        * Methods which return the number of rows and columns in the game board
        * There are already five rows and columns so the integer can be returned by itself
        */

    public int getRows(){
        return 5;
    }
    public int getCols(){
        return 5;
    }
     /**
     * Getter and setter for each game tile
     * @param row Row of tile
     * @param col Column of tile
     * @return The tile at the exact row or column as a string
     * @throws IndexOutOfBoundsException If rows and columns are invalid or do not exist
     */

    public String getTile(int row, int col) {
        try {
            return this.board[row-1][col-1] ;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid row or column");
            return null;
        }
    }
    public void setTile(int row, int col, String type) {
        try {
            this.board[row - 1][col - 1] = type;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid row or column");
        }
    }

     /**
     * Method that places a game piece on a specific row and column of the game board
     * @param row Row of tile
     * @param col Column of tile
     * @throws IndexOutOfBoundsException If rows and columns are invalid or do not exist
     * @throws NullPointerException if piece is invalid
     */

    public void placePiece(GamePiece piece, int row, int col) {
        try {
            this.board1[row - 1][col - 1] = piece;
        }
        catch (NullPointerException e) {
            System.out.println("Invalid piece");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid row or column");
        }
    }

    /**
     * A method which removes a piece from a tile
     * @param row Row of tile
     * @param col Column of tile
     * @throws IndexOutOfBoundsException If rows and columns are invalid or do not exist
     * @throws NullPointerException If piece is invalid
     */

    
    public void removePiece(int row, int col) {
        try {
            this.board[row - 1][col - 1] = null;
        }
        catch (NullPointerException e) {
            System.out.println("Invalid piece");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid row or column");
        }
    }
    
    /**
    * A method that returns the game piece at a specific tile
    * @param row The row where the tile is located
    * @param col The column where the tile is located
    * @return The game piece at that specific tile, returns null if the game piece does not exist/is not there
    * @throws IndexOutOfBoundsException if the row or column does not exist on the board
    */

    public GamePiece getPiece (int row, int col) {
        try {
            if (this.board1[row - 1][col - 1] == null) {
                return null;
            }
        GamePiece piece = this.board1[row - 1][col- 1];
           return piece;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid row or column");
            return null;
        }
        }
        
    /**
    * A method that checks if a game piece is on a specific tile
    * @param row The row where the tile is located
    * @param col The column where the tile is located
    * @return true if the piece is located at the tile, false otherwise
    * @throws IndexOutOfBoundsException if the row or column does not exist on the board
    */
        
    public boolean hasPiece(int row, int col) {
        try {
        if (this.board1[row-1][col-1] == null) {
            return false;
        }
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Invalid row or column");
        }
        return true;
    }

    /**
    * A method that prints out the game board, and replaces it with strings given by array tiles
    * @param x is the output, prints out the game board with all strings, tile types, and the game piece
    */

    public String toString() {
        String x = "";
        for (int i = 0; i < this.board.length; i++) {
           for (int j = 0; j < this.board[0].length; j++) {
               x += board[i][j];
               if (board[i][j] != null) {
                   x += "(" + board1[i][j].toString() + ")";
                   x += (j != this.board[0].length - 1) ? " | " : "\n";

               }
            }
        }
        return x;
    }
}
