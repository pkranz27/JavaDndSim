package Dnd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Encounters start = new Encounters();
		Animation walk = new Animation();
		Player player = new Player(null, 100, null, 0,"",100);
		player.playerInventory.put("Your inventory is empty", 0);
		player.getPlayerInventory();
		player.user();	
		start.start();
		start.fightOne();
		start.Interlude();
		start.fightTwo();
	}

}	
