import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	private static final int FORTY = 40;
	private static final int THIRTY = 30;
	private static final int FIFTEEN = 15;
	private static final int LOVE = 0;
	private static final int WONPOINT = 1;
	Player player1 = new Player();

	@Test
	void testWinPoint() {

		assertEquals(WONPOINT, player1.winPoint());

	}

	@Test
	void testLoveScore() {

		assertEquals("love", player1.getScore());
		assertEquals(LOVE, player1.getPlayerScore(player1));

	}

	@Test
	void testFifteenScore() {

		player1.winPoint();
		assertEquals("fifteen", player1.getScore());
		assertEquals(FIFTEEN, player1.getPlayerScore(player1));

	}

	@Test
	void testThirtyScore() {

		player1.winPoint();
		player1.winPoint();
		assertEquals("thirty", player1.getScore());
		assertEquals(THIRTY, player1.getPlayerScore(player1));
	}

	@Test
	void testFortyScore() {

		player1.winPoint();
		player1.winPoint();
		player1.winPoint();
		assertEquals("forty", player1.getScore());
		assertEquals(FORTY, player1.getPlayerScore(player1));
	}

}
