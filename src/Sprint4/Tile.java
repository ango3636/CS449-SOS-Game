package Sprint4;

public class Tile implements Comparable<Tile> {
    private TileValue value;

    public Tile(TileValue value) {
        this.setValue(value);
    }

    public TileValue getValue() {
        return this.value;
    }

    public void setValue(TileValue value) {
        this.value = value;
    }

    public String toString() {
        switch (this.value) {
            case S: return "S";
            case O: return "O";
            default: return "None";
        }
    }

    public int compareTo(Tile other) {
        if (this.getValue() == other.getValue()) {
            return 0;
        } else {
            return 1;
        }
    }

    public enum TileValue {
        S, O, None
    }
}
