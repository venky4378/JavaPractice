package com.oops.projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakesandLadders {

	public static void gameStart(List<Players> playerList) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Map<Integer, Integer> ladders = new HashMap<>();
		ladders.put(12, 45);
		ladders.put(42, 76);
		ladders.put(23, 92);
		ladders.put(78, 85);
		ladders.put(34, 63);
		ladders.put(8, 51);

		Map<Integer, Integer> snakes = new HashMap<>();
		snakes.put(99, 2);
		snakes.put(32, 18);
		snakes.put(73, 17);
		snakes.put(48, 37);
		snakes.put(29, 7);
		snakes.put(64, 49);

		int currentPlayerIndex = 0;
//		System.out.println(player.getName() + " " + player.getPosition());

		while (true) {

			int dice = random.nextInt(5) + 1;
			Players player = playerList.get(currentPlayerIndex);
			sc.nextLine();
			int newPosition = player.getPosition() + dice;

			if (newPosition > 100) {

			} else {
				if (ladders.containsKey(newPosition)) {
					player.setPosition(ladders.get(newPosition));
					System.out.println(player.getName() + " " + player.getPosition());
				} else if (snakes.containsKey(newPosition)) {
					player.setPosition(snakes.get(newPosition));
					System.out.println(player.getName() + " " + player.getPosition());
				} else {
					player.setPosition(newPosition);
					System.out.println(player.getName() + " " + player.getPosition());
				}
				if (player.getPosition() == 100) {
					System.out.println("Congratualations");
					System.out.println("Player " + player.getName() + " Wins");
					break;
				}
			}
			currentPlayerIndex = (currentPlayerIndex + 1) % playerList.size();
		}

	}

	public static void main(String[] args) {

		Players player1 = new Players("Swamy");
		Players player2 = new Players("Navya");

		List<Players> li = new ArrayList<>();

		li.add(player1);
		li.add(player2);
		gameStart(li);

	}

}
