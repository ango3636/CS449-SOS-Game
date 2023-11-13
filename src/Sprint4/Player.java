package Sprint4;

import Sprint4.Tile.TileValue;

public class Player {
    private final String name;
    private Tile tile;
    private PlayStyle style;
    private Integer points;
    public Player(TileValue value, String name) {
        this.name = name;
        this.tile = new Tile(value);
        this.style = PlayStyle.Human;
        this.points = 0;
    }

    public Tile getTile() {
        return this.tile;
    }

    public void setTile(TileValue tile) {
        this.tile = new Tile(tile);
    }

    public PlayStyle getStyle() {
        return this.style;
    }

    public void setStyle(PlayStyle style) {
        this.style = style;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPoints() {
        return this.points;
    }

    public void incrementPoints() {
        this.points++;
    }

    public void resetPoints() {
        this.points = 0;
    }

    public String toString() {
        return String.format("%s (%s, %s)", this.name, this.tile, this.style);
    }

    public enum PlayStyle {
        Human, Computer
    }
}
