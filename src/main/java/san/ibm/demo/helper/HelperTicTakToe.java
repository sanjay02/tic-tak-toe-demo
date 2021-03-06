package san.ibm.demo.helper;

import org.springframework.stereotype.Component;
import san.ibm.demo.constants.AppConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static san.ibm.demo.constants.AppConstants.*;

@Component
public class HelperTicTakToe {

	public static void placePiece(char[][] gameBord, int pos, String user) {
		char symbol = ' ';
		if (user.equals("player")) {
			symbol = 'X';
			playerPosition.add(pos);
		} else if (user.equals("cpu")) {
			symbol = '0';
			cpuPosition.add(pos);
		}

		switch (pos) {
		case 1:
			gameBord[0][0] = symbol;
			break;
		case 2:
			gameBord[0][2] = symbol;
			break;
		case 3:
			gameBord[0][4] = symbol;
			break;
		case 4:
			gameBord[2][0] = symbol;
			break;
		case 5:
			gameBord[2][2] = symbol;
			break;
		case 6:
			gameBord[2][4] = symbol;
			break;
		case 7:
			gameBord[4][0] = symbol;
			break;
		case 8:
			gameBord[4][2] = symbol;
			break;
		case 9:
			gameBord[4][4] = symbol;
			break;
		default:
			break;
		}

	}

	public static String checkWinner() {
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);

		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);

		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);

		for (List l : winning) {
			if (playerPosition.containsAll(l)) {
				return "Congratutions you won";
			} else if (cpuPosition.containsAll(l)) {
				return "CPU wins : Sorry:(";
			} else if (playerPosition.size() + cpuPosition.size() == 9) {
				return GAME_ENDS_WITH_A_DRAW;
			}
		}
		return "";
	}



	public static void printGameBord(char[][] gameBord) {
		for (char[] row : gameBord) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
