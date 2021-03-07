package san.ibm.demo.constants;

import java.util.ArrayList;

/*This class contains static final strings to be used in application*/
public class AppConstants {
	public static String GAME_ENDS_WITH_A_DRAW="GAME ENDS WITH A DRAW!";
	public static String BORD_CREATED="Board Created.The game will start with player X:";
	public static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
	public static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();
	public static char[][] gameBord = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
			{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };


}

