package san.ibm.demo.constants;

import java.util.ArrayList;

/*This class contains static final strings to be used in application*/
public class AppConstants {
	
	public static String TURN="turn";
	public static String GAME_ENDS_WITH_A_DRAW="GAME ENDS WITH A DRAW!";
	public static String PLAYER="PLAYER";
	public static String WON=" WON!";
	public static String DRAW="draw";
	public static String INVALID_INPUT_SLOT_NUMBER="Invalid input; re-enter slot number:";
	public static String BORD_CREATED="Board Created.The game will start with player X:";
	public static String WELCOME="Welcome to 3x3 Tic Tac Toe.";
	public static String SLOT_ALREADY_TAKEN="Slot already taken; re-enter slot number:";
	public static String XXX="XXX";
	public static String OOO="OOO";
	public static String X="X";
	public static String O="O";
	
	public static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
	public static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();

	public static char[][] gameBord = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
			{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

	public enum AppConstant {
		player,cpu

	}

}

