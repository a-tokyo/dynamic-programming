/**
 * You are given a schedule of video game tournaments, sorted by the date on which they will occur.
 * Each tournament i has a difficulty level d[i] and a prize amount p[i].
 * You feel confident you can win any tournament,
 * however the organizers do not allow anyone who has won a more difficult tournament to participate 
 * (so if you won a tournament with difficulty 2, from this point on, you can only participate in tournaments with difficulty level 2 or greater. 
 * Design and implement in Java a Dynamic Programming algorithm to select which tournaments you should participate in,
 * if you want to maximize your profit 
 * Notes: - You plan to win all the tournaments in which you participate!
 */
package analysisAssignment3;

/**
 * @author Tokyo
 *
 */
public class VideoGameTournaments {
	static int [][] dpArray;
	
	public static void fillDPArray(int [] difficulties, int []prizes) {
		dpArray = new int [difficulties.length][difficulties.length];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}