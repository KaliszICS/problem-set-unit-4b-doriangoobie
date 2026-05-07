public class Main {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        GamePiece dog = new GamePiece("Dog", "Green", 849);
        GamePiece cat = new GamePiece("Cat", "Blue", 65);
        board.placePiece(dog, 1, 1);
        board.placePiece(cat, 2, 1);
        System.out.println(board);
    }
}
