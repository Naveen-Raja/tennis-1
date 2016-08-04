
public class ScoreBoard {
	private int[] A;
	private int[] B;
	private final int SETS;
	
	private final int SETS_TO_WIN;
	private final int MIN_GAMES_TO_WIN = 6;
	private final int MIN_POINTS_TO_WIN = 4;
	
	private final char PLAYER1 = 'A';
	private final char PLAYER2 = 'B';
	
	public ScoreBoard(int sets) {
		this.SETS = sets;
		this.SETS_TO_WIN = this.SETS / 2 + 1;
		A = new int[3];
		B = new int[3];
	}
	
	private int[] returnWinner(char player) {
		if (player == PLAYER1) {
			return A;
		}
		return B;
	}
	
	public void increment(char player) {
		int [] winner = returnWinner(player);
		winner[2]++;
		if (!isDeuce()) {
			if (winner[2] >= MIN_POINTS_TO_WIN) {
				if (!isAdvantage()) {
					resetPoints();
					winner[1]++;
				}
				if (winner[1] >= MIN_GAMES_TO_WIN && (gameDifference() == 2)) {
					winner[0]++;
					resetGames();
				}
			}
		}
	}
	
	private boolean isDeuce() {
		if ((A[2] == B[2] && (A[2] >= MIN_POINTS_TO_WIN - 1))) {
			return true;
		}
		return false;
	}
	
	private boolean isAdvantage() {
		if (Math.abs(A[2]-B[2]) == 1 && A[2] >= MIN_POINTS_TO_WIN -1 &&
				B[2] >= MIN_POINTS_TO_WIN - 1) {
			return true;
		}
		return false;
	}
	
	private int gameDifference() {
		return Math.abs(A[1] - B[1]);
	}
 	
	private int whoAdvantage() {
		return A[2] - B[2];
	}
	
	public void resetPoints() {
		A[2] = 0;
		B[2] = 0;
	}
	
	public void resetGames() {
		A[1] = 0;
		B[1] = 0;
	}
 	
	public String printScore() {
		return null;
	}
	
	public void parse(String order) {
		for (char a : order.toCharArray()) {
			this.increment(a);
			this.printScore();
		}
	}
	
	public static void main(String[] args) {
		String pointsOrder = args[0];
		ScoreBoard scoreBoard = new ScoreBoard(3);
		scoreBoard.parse(pointsOrder);
	}
}
