
public class ScoreBoard {
	private int[] A;
	private int[] B;
	private final int SETS;
	
	private final int SETS_TO_WIN;
	private final int MIN_GAMES_TO_WIN = 6;
	private final int MIN_POINTS_TO_WIN = 4;
	
	public ScoreBoard(int sets) {
		this.SETS = sets;
		this.SETS_TO_WIN = this.SETS / 2 + 1;
		A = new int[3];
		B = new int[3];
	}
	
	public void increment(char player) {
		
	}
	
	public String printScore() {
		return null;
	}
	
	public void parse(String order) {
		
	}
}
