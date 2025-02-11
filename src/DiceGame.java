import java.util.ArrayList;
import java.util.List;

public class DiceGame {
    public static void main(String[] args) {
        /**
         * It reads input from a file, creates players, and manages the game process.
         *
         * @param args the command line arguments passed to the program
         */
        // FileInput and FileOutput objects are created for file input and output.
        FileInput input = new FileInput();
        FileOutput output = new FileOutput();

        // Entries are read from the file and player names and numbers are determined
        String [] inputFile = FileInput.readFile(args[0],true);
        String [] playerNames = inputFile[1].split(",");
        int countOfPlayers = Integer.parseInt(inputFile[0]);

        // Players are created as objects and added to a list
        List<Player>playerList = new ArrayList<Player>();
        for(int i = 0; i<countOfPlayers; i++){
            Player player = new Player(playerNames[i]);
            playerList.add(player);
            }

        // Created an array representing dice rolls
        String[] diceScoreList = new String[inputFile.length - 2];
        for (int i = 2; i < inputFile.length; i++) {
            diceScoreList [i - 2] = inputFile[i];
        }

        // Game object is created for the game
        Game game = new Game();

            //Game was started
            int i = 0; //the index of dice rolls array
            int j = 0; //the index of players array
            while ( i < diceScoreList.length){
                String diceScores [] = diceScoreList[i].split("-");
                i++;
                boolean result = game.diceGame(Integer.parseInt(diceScores[0]),Integer.parseInt(diceScores[1]),playerList.get(j), args);
                if (result == false) {
                    playerList.remove(j);
                    if(j >= playerList.size()){
                        j = 0 ;
                    }

                    // If a player wins the game, this status is written and the game ends
                    if (playerList.size() == 1) {
                        FileOutput.writeToFile(args[1],playerList.get(0).getName() + " is the winner of the game with the score of " + playerList.get(0).getScore() + ". Congratulations " + playerList.get(0).getName() + "!" , true, false);
                        break;
            }
                }else{
                    // If a player hasn't won, it goes to the next player
                    if(j < playerList.size() - 1){
                        j++;
                    }else{
                        j = 0;
                    }
                }
            }


    }





}

