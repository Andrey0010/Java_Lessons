package start.Zadachki.OOPall;

public class Score {

        private int player1;
        private int player2;

        public Score(int player1, int player2) {
            this.player1 = player1;
            this.player2 = player2;
        }

        public void incScore(int player1, int player2) {
            this.player1 += player1;
            this.player2 += player2;
        }

        @Override
        public String toString() {
            return String.format("Первый игрок = %d, Второй игрок = %d", player1, player2);
        }

        public boolean hasWinner() {
            return player1 != player2;
        }

        public boolean noWinner() {
            return player1 == player2;
        }

        public String printResult() {
            if (noWinner())
                return "Ничья";
            return player1 > player2 ? "Первый игрок победитель!" : "Второй игрок победитель!";
        }
    }


