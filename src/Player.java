
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Player {

	private int points = 0;

	public List<String> score = new ArrayList<>(Arrays.asList("love", "fifteen", "thirty", "forty", "fifty", "sixty"));

	HashMap<String, Integer> hmap = new HashMap<String, Integer>();

	public Player() {
		hmap.put("love", 0);
		hmap.put("fifteen", 15);
		hmap.put("thirty", 30);
		hmap.put("forty", 40);
		hmap.put("fifty", 50);
		hmap.put("sixty", 60);
	}

	public int winPoint() {

		return points += 1;

	}

	public String getScore() {
		return score.get(points);
	}

	public int getPlayerScore(Player player) {
		return hmap.get(player.getScore());
	}

}
