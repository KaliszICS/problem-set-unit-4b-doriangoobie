public class Main {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        GamePiece pawn = new GamePiece("Dog", "Green", 849);
        GamePiece pawn1 = new GamePiece("Cat", "Blue", 65);
        board.placePiece(pawn, 1, 1);
        board.placePiece(pawn1, 2, 1);
        System.out.println(board);
    }
}
