/**
 * The Game class symbolized the game logic.
 * It contains methods related to playing the dice game.
 */
public class Game {
    Player player = new Player();
    public boolean diceGame(int firstDice, int secondDice, Player player, String[] args){
        /**
         * Plays a round of the dice game with the given dice rolls.
         * Updates the player's score and writes game events to a file.
         *
         * @param firstDice  the result of the first dice roll
         * @param secondDice the result of the second dice roll
         * @param player     the player participating in the game
         * @param args       the command line arguments passed to the program
         * @return true if the player's turn is not over yet, false otherwise
         */
        if(firstDice == 0 && secondDice == 0){
            FileOutput.writeToFile(args[1],player.getName() + " skipped the turn and " + player.getName() + "\u2019s score is " + player.getScore() + "." , true, true);
            return true;
        }else if(firstDice == 1 && secondDice == 1 ){
            FileOutput.writeToFile(args[1],player.getName() + " threw " + firstDice + "-" + secondDice + ". Game over " + player.getName() + "!" , true, true);
            return false;
        }else if(firstDice == 1 || secondDice == 1){
            FileOutput.writeToFile(args[1],player.getName() + " threw " + firstDice + "-" + secondDice + " and " + player.getName() + "\u2019s score is " + player.getScore() + "." , true, true);
            return true;
        }else{
            int score = firstDice + secondDice;
            player.setScore(score);
            FileOutput.writeToFile(args[1],player.getName() + " threw " + firstDice + "-" + secondDice + " and " + player.getName() + "\u2019s score is " + player.getScore() + "." , true, true);
            return true;
        }

    }
}
