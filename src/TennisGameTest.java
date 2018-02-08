import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TennisGameTest {

	Player player1 = new Player();
	Player player2 = new Player();
	TennisGame game = new TennisGame(player1, player2);
	private static final int LOVE = 0;
	private static final int FIFTEEN = 15;
	private static final int THIRTY = 30;
	private static final int FORTY = 40;
	private static final int FIFTY = 50;
	private static final int SIXTY = 60;

	@Test
	void testNoScore() {
		assertEquals(LOVE, game.getPlayerScore(player1));
		assertEquals(LOVE, game.getPlayerScore(player2));
	}

	@Test
	void testFifteenScore() {
		player1.winPoint();
		player2.winPoint();
		assertEquals(FIFTEEN, game.getPlayerScore(player1));
		assertEquals(FIFTEEN, game.getPlayerScore(player2));
	}

	@Test
	void testThirtyScore() {
		player1.winPoint();
		player1.winPoint();
		player2.winPoint();
		player2.winPoint();
		assertEquals(THIRTY, game.getPlayerScore(player1));
		assertEquals(THIRTY, game.getPlayerScore(player2));
	}

	@Test
	void testTwoPlayerScore() {
		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		player2.winPoint();
		player2.winPoint();

		assertEquals(FORTY, game.getPlayerScore(player1));
		assertEquals(THIRTY, game.getPlayerScore(player2));

	}

	@Test
	void testDeuce() {
		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		assertEquals(FORTY, game.getPlayerScore(player1));
		assertEquals(FORTY, game.getPlayerScore(player2));
		game.gameScore();
	}

	@Test
	void testAdvantage() {
		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		assertEquals(FORTY, game.getPlayerScore(player1));
		assertEquals(FIFTY, game.getPlayerScore(player2));
		game.gameScore();
	}

	@Test
	void testWin() {
		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		assertEquals(FORTY, game.getPlayerScore(player1));
		assertEquals(SIXTY, game.getPlayerScore(player2));
		game.gameScore();
	}

	@Test
	void testPlayer1Win() {
		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		assertEquals(SIXTY, game.getPlayerScore(player1));
		assertEquals(FORTY, game.getPlayerScore(player2));
		game.gameScore();
	}

	@Test
	void testSkunk() {
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		player2.winPoint();
		assertEquals(LOVE, game.getPlayerScore(player1));
		assertEquals(SIXTY, game.getPlayerScore(player2));
		game.gameScore();
	}

	@Test
	void testNoWinnerTie() {
		player1.winPoint();
		player1.winPoint();
		player2.winPoint();
		player2.winPoint();
		assertEquals(THIRTY, game.getPlayerScore(player1));
		assertEquals(THIRTY, game.getPlayerScore(player2));
		game.gameScore();
	}

}
