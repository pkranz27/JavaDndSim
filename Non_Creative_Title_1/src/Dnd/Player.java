package Dnd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Player extends Enemy implements Npc{
	static Scanner user = new Scanner(System.in);
	Enemy Zombie  = new Enemy("Zombie",50, 10, 1);
	String name = user.toString();
	int hitPoints = 100; 
	Map<String,Integer>playerInventory  = new HashMap<String,Integer>();
	List<String>journal = new ArrayList<String>();
	Enemy obeseTroll = new Enemy("Fat Troll",200,20,12);
	Integer exp = 0;
	Integer level = 0;
	int mana = 100;
	
	
	Player(Scanner user, int hitPoints, Integer exp, Integer level, String name, int mana){
		super();
		this.journal = journal;
		exp = this.exp;
		user = Player.user;
		hitPoints = this.hitPoints;
		playerInventory  = this.playerInventory;
		level = this.level;
		name = user.toString();
		mana = this.mana;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> addJournal(){	
		if(journal.isEmpty()) {
			journal.add("BE YOUR OWN BOSS\n");
			journal.add("1. Make Friends\n");	
			journal.add("2. Get Gold to buy Pryamid Soap from Druid\n");	
			journal.add("3.Trick....Pitch the idea of Pryamid Soap so they can sell it to their Friends\n");
			System.out.println(journal);
			return journal;
		}
		else {
			System.out.println(journal);
			return journal;
		}
	}
	
	public int myAttack(Enemy enemy) { // Lowers HP and
		getHitPoints();
		randomRoll();
		do{
			this.hitPoints = (int) (this.hitPoints - crit);
			System.out.println("You have hit points left: "+ hitPoints+"\n");
			return hitPoints;
		}while(hitPoints > 0);
	}
	public int castSpell(Enemy enemy) {
		enemy.getIntellegence();
		int mana = this.mana;
			do {
				if(playerInventory.containsValue(-3)) {
					enemy.intellegence-=3;
					int manaDecrease = mana-20;
					System.out.println("you cast PITCH\n It hit for -3 \n Remaning mana: "+manaDecrease);
					System.out.println(enemy.intellegence);
				}
		return enemy.intellegence;
		}while(enemy.intellegence<=0);
		
	}

	public Scanner getUser() {
		return user;
	}

	public void menu() {
		
			for(Integer i = 0; i<1; i++){
				String j = user.nextLine();
					String jo; 
					switch(j) {
					case "j": jo = "you open your journal";
						addJournal();
						break;
					case "h": jo ="Your health";
						System.out.println("Your Health is " + this.hitPoints);
						break;
					case"i": jo = "Your Inventory";
						System.out.println(playerInventory);
						break;
					case "e": jo = "Your Experince";
					levelUp(i);
					case "c" : jo = "continue";
						default : System.out.println("");
					break;
					}
			}

			
		}		

	public Integer levelUp(Integer lvlUp) {	 
		lvlUp=this.level;	
			if(Zombie.hitPoints <= 0 && lvlUp ==0) {	
				lvlUp=this.level+1;	
			}
			if(lvlUp <= 0) {
				System.out.println("Your current Level: "+level+"\n Your current Exp:"+exp+"/10");
			}
			if(lvlUp > 0) {
				System.out.println("Your current Level: "+lvlUp+"\n Your current Exp:"+exp+"/20");
			}
		return lvlUp;
	}
	

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public String user() {
		System.out.println("Hello Travler please enter your name below: ");
		this.name = Player.user.nextLine();
		System.out.println("Hello " + this.name + "\n Welcome to my project! Below are some menu items to acess outside of Combat:");
		return user.toString();
	}
	
	public String getName() {
		return name;
	}

	public Map<String, Integer> equip(Enemy enemy){
		if(enemy.name == "Zombie") {
			enemy.getInventory(Zombie);
			playerInventory.remove("Your inventory is empty");
			playerInventory.putAll(Zombie.inventory);
			System.out.println(playerInventory+ "\n You feel a surge of Stupidity, *ping* you now have access to the spell\n \"GET RICH\"\n This spell makes it so that the enemy does less damage.\nSub-effect: Makes you pitch more interesting!\n Press m to check your menu");
		}
		if(enemy.name.equals("Fat Troll")){
			enemy.getInventory(Zombie);
			playerInventory.remove("Your inventory is empty");
			playerInventory.putAll(Zombie.inventory);
			System.out.println(playerInventory+ "You have equipped");   
		}
		return playerInventory;
	} 
	 public int ridddleMeThis(Enemy enemy) {
		
		 String one = "What four-letter word can be written forward, backward, or upside down, and can still be read from left to right?";
		 String two = "What walks on four feet in the morning, two in the afternoon, and three at night? ";
		 String three ="What can jump higher than a building? ";
		 String four = "The Troll with a goofy smile and begins to chuckle, he then seems to stand still for a few moments till he falls over and dies";
		 String oneAnswer ="noon";
		 
		 		for(int i = 0; i<1; i++) {
		 			
		 			if(obeseTroll.intellegence == 9) {
		 				System.out.println(one);
		 				String answer= input.nextLine();
		 				if(answer.equals("noon")&& enemy.intellegence == 9) {
		 					System.out.println("you solved the Riddle congrats, we hope you and your new pratner work out!\n *DING* Journal Entry Complete Press i to inspect");
		 					String loot = input.nextLine();
		 						if(loot.equals("i")||loot.equals("Inspect")) {
		 								inspect(enemy);
		 								String take = input.nextLine();
		 									if(take.equals("yes")|| take.equals("y")) {
		 										loot(enemy);
		 										return intellegence-=3;
		 									}
		 									else {
		 											System.out.println("You leave the corpse and its low level garabage.\nFor you awaits greater riches");
		 											return intellegence -=3;
		 										}
		 						}
		 				}
		 			}
		 			if(obeseTroll.intellegence == 6) {
		 				System.out.println(two);
		 				String answer= input.nextLine();
		 				if(answer.equals("man")&& enemy.intellegence == 6) {
		 						System.out.println("you solved the Riddle congrats, we hope you and your new pratner work out!\n *DING* Journal Entry Complete press i to insepect ");
		 						String loot = input.nextLine();
		 							if(loot.equals("i")||loot.equals("Inspect")) {
		 								inspect(enemy);
		 								String take = input.nextLine();
		 									if(take.equals("yes")|| take.equals("y")) {
		 										loot(enemy);
		 										return intellegence-=3;
					}else {
						System.out.println("You leave the corpse and its low level garabage.\nFor you awaits greater riches");
						return intellegence;
					}
				}
			}
		}
		if(obeseTroll.intellegence == 3) {
			 System.out.println(three);
			 String answer= input.nextLine();
			 if(answer.equals("man")&& enemy.intellegence == 6) {
					System.out.println("you solved the Riddle congrats, we hope you and your new pratner work out!\n *DING* Journal Entry Complete ");
					String loot = input.nextLine();
						if(loot.equals("i")||loot.equals("Inspect")) {
							inspect(enemy);
							String take = input.nextLine();
							if(take.equals("yes")|| take.equals("y")) {
								loot(enemy);
								return intellegence-=3;
						}
								else {
									System.out.println("You leave the corpse and its low level garabage.\nFor you awaits greater riches");
									return intellegence;
								}
						}
			}
		}
		if(obeseTroll.intellegence == 0) {
			System.out.println(four);
		}
	    }
		 		return obeseTroll.intellegence;
	 }

	public Map<String, Integer> getPlayerInventory() {
		Map<String, Integer> PlayerInventory =this.playerInventory; 
		PlayerInventory.put("Your inventory is empty", 0);
		return playerInventory;
	}

	public void setPlayerInventory(Map<String, Integer> playerInventory) {
		this.playerInventory = playerInventory;
	}

}
