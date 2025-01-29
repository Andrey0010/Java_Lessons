package start.Zadachki.OOPall;

import java.util.Random;

public class Game {


        public static void main(String[] args) {
            Game game = new Game();
            game.game();
        }

        public void game() {
            Score score = new Score(0, 0);
            doGame(10, score);
            System.out.println(score);

            while (score.noWinner()) {
                System.out.println("Дополнительный бросок");
                doGame(1, score);
                System.out.println(score);
            }

            System.out.println(score.printResult());
        }

        private void doGame(int rounds, Score score) {
            Random rand = new Random();
            int player1, player2;
            for (int round = 1; round <= rounds; round++) {
                player1 = rand.nextInt(10);
                player2 = rand.nextInt(10);
                System.out.printf("[%d] player1 = %d, player2 = %d\n", round, player1, player2);
                score.incScore(player1, player2);
            }
        }
    }


