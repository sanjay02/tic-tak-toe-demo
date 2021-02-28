package san.ibm.demo.service;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static san.ibm.demo.constants.AppConstants.*;
@Component
public class TicTakToeRequestService {

	static String[] board;
	Logger log = LoggerFactory.getLogger(this.getClass());
	public void process() {
		log.info("Start the process() from TicTakToeRequestService");
		Scanner in = new Scanner(System.in);
		board = new String[9];
		TURN = X;
		String winner = null;
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}

		System.out.println(WELCOME);
		printBoard();
		System.out.println(BORD_CREATED);

		while (winner == null) {
			int numInput;

			/*
			 * Exception handling. numInput will take input from user like from 1 to 9. If
			 * it is not in range from 1 to 9. then it will show you an error
			 * "Invalid input."
			 */
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println(INVALID_INPUT_SLOT_NUMBER);
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println(INVALID_INPUT_SLOT_NUMBER);
				continue;
			}

			/* This game has two player x and O. Here is the logic to decide the TURN. */
			if (board[numInput - 1].equals(String.valueOf(numInput))) {
				board[numInput - 1] = TURN;

				if (TURN.equals(X)) {
					TURN = O;
				} else {
					TURN = X;
				}

				printBoard();
				winner = checkWinner();
			} else {
				System.out.println(SLOT_ALREADY_TAKEN);
			}
		}

		/*
		 * If no one win or lose from both player x and O. then here is the logic to
		 * print "draw".
		 */		
		if (winner.equalsIgnoreCase(DRAW)) {
			System.out.println(GAME_ENDS_WITH_A_DRAW); // It's a draw! Thanks for playing.
		}
		else {
			System.out.println(PLAYER + "\t" +  winner +  WON);
		}
	}

	/* This method is created basic board */
	public void printBoard() {
		//System.out.println("Start checkWinner from TicTakToeRequestService:");
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|---|---|---|");
	}
	
	/*
	 * This method is used for allocated the value of X and O based on the metrics
	 */
	public String checkWinner() {
		//System.out.println("Start checkWinner from TicTakToeRequestService:");
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			// For X winner
			if (line.equals(XXX)) {
				return X;
			}

			// For O winner
			else if (line.equals(OOO)) {
				return O;
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8) {
				return DRAW;
			}
		}

		// To enter the X Or O at the exact place on board.
		System.out.println(TURN + "'s TURN; enter a slot number to place " + TURN + " in:");
		return null;
	}


}
