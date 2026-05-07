public class GamePiece {
    private String label;
    private String color;
    private int pointValue;

    /**
    * Default constructor for the game piece
    */

	public GamePiece (String label, String color, int pointValue) {
        this.label = label;
        this.color = color;
        this.pointValue = pointValue;
    }
    
    /**
    * Getters for the label, point value, and colour of the game piece
    */

    public String getlabel() {
        return this.label;
    }
    public int getpoint() {
        return this.pointValue;
    }
    public String getcolor() {
        return this.color;
    }
    
    /**
    * A method that returns the game piece as one combined string
    */

    public String toString() {
        return (this.label + this.color);
    }
    
    /**
    * A method that finds out if two game pieces are exactly the same
    */

    public boolean equals() {
        if (getlabel() == this.label && getcolor() == this.color && getpoint() == this.pointValue) {
            return true;
        }
        return false;
    }
}

