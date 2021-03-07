package san.ibm.demo.handler;

import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import san.ibm.demo.constants.AppConstants;
import san.ibm.demo.helper.HelperTicTakToe;

import static san.ibm.demo.constants.AppConstants.*;
@Component
public class HandlerTicTakToe {

	@Autowired
	HelperTicTakToe helper;
	
	public void processTicTakToeGame() {
		try {
			char[][] gameBord = AppConstants.gameBord;
			helper.printGameBord(gameBord);

			while (true) {
				Scanner scan = new Scanner(System.in);
				System.out.println(BORD_CREATED + "Enter your placement 1 to 9");
				int playerPos = scan.nextInt();
				while (playerPosition.contains(playerPos) || cpuPosition.contains(playerPosition)) {
					System.out.println("Position taken! Enter a correct position");
					playerPos = scan.nextInt();
				}

				helper.placePiece(gameBord, playerPos, "player");


				if (winnerResult()) break;

				Random rand = new Random();
				int cpuPos = rand.nextInt(9) + 1;
				while (playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPos)) {
					// System.out.println("Position taken! Enter a correct position");
					cpuPos = rand.nextInt(9) + 1;
				}

				helper.placePiece(gameBord, cpuPos, "cpu");
				helper.printGameBord(gameBord);

				if (winnerResult())

					break;
			}
		} catch (Exception e) {
			System.out.println("Exception occur during procesDraw():"+e);
		}
	}


	private boolean winnerResult() {
		String result = helper.checkWinner();
		if (result.length() > 0) {
			System.out.println(result);
			helper.printGameBord(gameBord);
			return true;
		}
		return false;
	}
}
