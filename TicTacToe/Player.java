public class Player {
    String Name;
    PlayingPiece piece;

    Player(String Name,PlayingPiece piece) {
        this.Name = Name;
        this.piece = piece;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public PlayingPiece getPlayingPiece() {
        return piece;
    }
    public void setPlayingPiece(PlayingPiece piece) {
        this.piece = piece;
    }
}
