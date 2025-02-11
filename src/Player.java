/**
 * The Player class symbolized a player in the game.
 * Each player has a name and a score.
 */
public class Player {
    private String name;
    private int score;
    public Player(){
    }
    public Player (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score += score;
    }
}
