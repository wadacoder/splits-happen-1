package scorer;

import bowling.Game;

/**
 * @author suhas
 *
 */
public class BowlingScoreReporter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args != null && args.length == 1 && !args[0].trim().isEmpty()) {
			Game game = new Game(args[0]);
			System.out.println("\tGame recorded with rolls as: " + args[0]);
			System.out.println("\tTotal score: " + game.getScore());
		} else {
			System.out.println("\tPlease provide valid roll sequence for all 10 frames");
			System.out.println("\t\t\"X\" indicates a strike");
			System.out.println("\t\t\"/\" indicates a spare");
			System.out.println("\t\t\"-\" indicates a miss");
			System.out.println("\t\ta number indicates the number of pins knocked down in the roll");
			System.out.println("\tExamples:");
			System.out.println("\t\t2/32345/24X43546/XX4");
			System.out.println("\t\tXXXXXXXXXX25");
		}
	}

}
