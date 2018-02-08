
public class TennisGame {

	private static final int TWENTY = 19;
	private static final int FORTY = 39;
	private Player player1;
	private Player player2;

	public TennisGame() {

	}

	public TennisGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;

	}

	public void gameScore() {

		System.out.println(toString());
		if (isWinner()) {
			determineWinner();

		}
		if (isDeuce()) {
			deuce();

		} else if (isAdvantage()) {
			advantage();

		}

	}

	private void advantage() {

		System.out.println("advantage");

	}

	private boolean isAdvantage() {

		return (getPlayerScore(player1) > FORTY && getPlayerScore(player2) > FORTY && !isDeuce());

	}

	private boolean isWinner() {

		return (getPlayerScore(player1) > FORTY || getPlayerScore(player2) > FORTY);

	}

	private void determineWinner() {

		if (getPlayerScore(player1) > getPlayerScore(player2) + TWENTY) {
			System.out.println("Player 1 Won");
		} else if (getPlayerScore(player1) + 19 < getPlayerScore(player2)) {
			System.out.println("Player 2 Won");
		}

	}

	public int getPlayerScore(Player player) {
		return player.getPlayerScore(player);
	}

	private boolean isDeuce() {
		return (getPlayerScore(player1) == getPlayerScore(player2) && getPlayerScore(player1) > FORTY
				&& getPlayerScore(player2) > FORTY);

	}

	private void deuce() {
		System.out.println("deuce");

	}

	@Override
	public String toString() {
		String score = ("Player 1 " + player1.getScore() + "\n" + "Player 2 " + player2.getScore());

		return score;

	}

}
