
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
	
	public void processPoints(String pts1, String pts2){
		if(isDeuce()){
			pts1 = "D";
			pts2 = "D";
		}
		int FLAG = 0;
		if((FLAG = getAdvantage())>0){
			if(FLAG == 1){
				pts1 = "A";
				pts2 = "-";
			}
			else if(FLAG == 2){
				pts1 = "-";
				pts2 = "A";
			}
		}
	}
	
	public String printScore() 
	{
		String pts1 = "";
		String pts2 = "";
		for(int i = 0; i<A.length; i++ ){
			pts1 = pts1 + arr[A[2]];
			pts2 = pts2 + arr[B[2]];
			processPoints(pts1, pts2);
			System.out.println("-----------------------");
			System.out.println("| Player|"+"SET"+"|GAME| PTS|");
			System.out.println("-----------------------");
			System.out.println("|   A   | "+A[0]+" |"+" "+A[1]+"  |"+"  "+pts1+"|");
			System.out.println("-----------------------");
			System.out.println("|   B   | "+B[0]+" |"+" "+B[1]+"  |"+"  "+pts2+"|");
			System.out.println("-----------------------");
		}
		return null;
	}
	
	public void parse(String order) {
		
	}
	
}
