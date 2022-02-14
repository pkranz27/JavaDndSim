package Dnd;

import java.awt.Menu;
import java.util.Scanner;

public class Encounters extends Player {
	String firstEncounter;
	
	Scanner next = new Scanner(System.in);
	String continueOn = "c";
	
	
	public void start() {
		System.out.println(" Press j to check journal \n Press H to check Health \n Press i to Check inventory \n Press e to check Level");
		menu();
		menu();
		menu();
		menu();
			for(Integer i = 0; i<1; i++){ // MAke into sing;le button next	
				menu();
				System.out.println("You walk down a dusty road in the fadding sunshine\n In your hand is a sheet of paper that reads \"MLM Wyvern Soap\"");
				menu();
				System.out.println("\n\"HA unlimted money and I get to be my own boss, time to get rich quick!\"\n");
				menu();
				System.out.println("\nYou enter a dusky cavern, inside you hear a dull voice groaning nonsense\n You approach slowly");
				System.out.println("\n\"That Old Druid said to come here to get gold and recurit other poeple to be a solid foundation for his Pryamid\"");
				menu();
				System.out.println("\n As you creep ever slowly foward you see a silloute of a person, What do you choose?");
				menu();
				System.out.println("\n Attack or Talk? ");

			}
	}
	
	public void fightOne() { // Action/ might change later to be more broad
		for(Integer i = 0; i<10; i++){
			String j = user.nextLine();
			j.toLowerCase();
				String jo; 
				switch(j) {
					case "t": jo = "YouTalk";
					Zombie.question1(Zombie);
					if(Zombie.hitPoints != 50) {
						System.out.println("The Zombie is a lot tougher then it appears, prehaps if all your gold was spent on armor and not soap the outcome could be diffrent.\n Alas, that is unforunatley not the case, as your final moments of your life falsh before your eyes you vow to yourself that in your next you will think things through....propably.\n You Died.");
						break;
					}
						break;
					case "s": jo ="Your health";
					castSpell(Zombie);
					break;
					case"a": jo = "Your attack";
					myAttack(Zombie);
					Zombie.myAttack();
					String t = "t";
					t.toUpperCase();
				
					if(hitPoints <= 0) {
					System.out.println("The Zombie is a lot tougher then it appears, prehaps if all your gold was spent on armor and not soap the outcome could be diffrent.\n Alas, that is unforunatley not the case, as your final moments of your life falsh before your eyes you vow to yourself that in your next you will think things through....propably.\n You Died.");
					}
					if(Zombie.hitPoints <= 0) {						
						levelUp(0);
						System.out.println("\n Congrats on Killing a " +Zombie.name + " you are rewarded: "+ Zombie.exp +" exp You have leveled up!");
						System.out.println("\n \nIt isnt theft if they are dead! \n Press I to inspect the corpse");
						String loot = input.nextLine();
							if(loot.equals("i")||loot.equals("Inspect")) {
								inspect(Zombie);
								String take = input.nextLine();
									if(take.equals("yes")|| take.equals("y")) {
										Zombie.loot(Zombie);
										return;
									}
									else {
								System.out.println("You leave the corpse and its low level garabage.\nFor you awaits greater riches");
								return;
							}
						}
					}
					break;	
					default : System.out.println("As you contemplate your next move the zombie suddenly turns.\n Startled by the horrible visage of a living dead, you summon all of your courage and might, then promptly run away.\n Unforunately, in your haste, you lose your balance, trip and break your neck.\n The Zombie looks on with what can be best descirbed as pity mixed with embarassment, He then proceeds to devour your corpse.");
					hitPoints = 0;
					break;
					
				}
				
		}
	}
	public void Interlude() {
		
		if(hitPoints > 0) {	
			System.out.println("SUCCESS, on killing a Zombie who did nothing wrong, Go you! Equip the item by going opening your inventory and pressing l");
	
			for (Integer i = 0; i < 1; i++) {
				String answer = input.nextLine();
				answer = answer.toLowerCase();
					if(answer.equals("l")|| answer.equals("equip")) {
						equip(Zombie);
						String nex = input.nextLine();
							if(nex.equals("m")|| nex.equals("menu")) {
								System.out.println("Even sociopaths need a rest. Take a moment to look through your menu\n \n Press H to check Health \n Press i to Check inventory \n Press e to check Level");
								int x = 0;
									do {
										x++;
										menu();
									}
									while(x < 5);
							}	
					}
			else {
					System.out.println("You stare at the Corpse and the previous battle flashes before your mind's eye, filling you with a rigtheous power.\n You let out a bestial roar of trimuph, for you are the great Zombie murder and nothing can... \nSuddenly a rock the size of a small ball cracks from the celing, striking your head and instantly killing you.");
					return;
			}
		  }	
		}	
	}
	public void fightTwo() {
		
		for(Integer i = 0; i<10; i++){
			String j = user.nextLine();
			j.toLowerCase();
				String jo; 
				switch(j) {
				case "c": jo = "you open your journal";
					System.out.println("You hear a strange sound in the coming from deeper in the cave. \n Gripping you stachel you slowly  move towards your next encounter.");
					String sub = user.nextLine();
					System.out.println("Ahead is a sign that reads "+"["+"\"Riddels by Theo\" "+"]"+" \n under the poorly written sign, in tiny print reads\n "+"["+"if you answer correctly then you may live in my cave with me rent free. \n Must be younger than 25, pretty and Female."+"]");
					String sub1 = user.nextLine();
					System.out.println("\n \"Not sure what this means, but this sign sounds desperate. Maybe they are like me and want to be there own boss!\" \n Reassured by your awkard ramblings in the dark to yourself, you nod and move foward.\n");
					String sub2 = user.nextLine();
					System.out.println("You arrive to the next wide expanse in the carven, and are greeted with a most peicular sight and a most henious smell.\n Before you sits a absolute fat **** of a troll, he is furiously wrting with his fat **** hand in an notebook and laughing to himself.\n");
					String sub3 = user.nextLine();
					System.out.println(" You slowly approach the fat ***** troll, the fat ***** troll lets out a fat ****** snort and looks up from his  book and give you a annoyed snear.\n \"Who are you\" says the fat **** troll\"My name is player.name and i am here to take your challenege\" \n Will you Attack Talk or Cast a spell? ");
					break;
				case "a": jo ="attack";
				myAttack();
				obeseTroll.myAttack();
				if(hitPoints <= 0) {
					System.out.println("The Troll is a lot tougher then it appears, prehaps if all your gold was spent on armor and not soap the outcome could be diffrent.\n Alas, that is unforunatley not the case, as your final moments of your life falsh before your eyes you vow to yourself that in your next you will think things through....propably.\n You Died.");
					}
					if(obeseTroll.hitPoints <= 0) {						
						levelUp(2);
						System.out.println("\n Congrats on Defeating a " +obeseTroll.name + " you are rewarded: "+ Zombie.exp +" exp You have leveled up!");
						System.out.println("\n \nIt isnt theft if they are dead! \n Press I to inspect the corpse");
						String loot = input.nextLine();
							if(loot.equals("i")||loot.equals("Inspect")) {
								inspect(obeseTroll);
								String take = input.nextLine();
									if(take.equals("yes")|| take.equals("y")) {
										Zombie.loot(Zombie);
										return;
									}
									else {
								System.out.println("You leave the corpse and its low level garabage.\nFor you awaits greater riches");
								return;
									}
						}
					}
				break;
				case"t": jo = "You Talk";
					Zombie.question1(obeseTroll);
					if(obeseTroll.hitPoints != 50) {
						System.out.println("The Troll is a lot tougher then it appears, prehaps if all your gold was spent on armor and not soap the outcome could be diffrent.\n Alas, that is unforunatley not the case, as your final moments of your life falsh before your eyes you vow to yourself that in your next you will think things through....propably.\n You Died.");
					}
					break;
				case "s": jo = "Your Spells";
					if(obeseTroll.intellegence == 12) {
						castSpell(obeseTroll);
							if(obeseTroll.intellegence==9) {
								ridddleMeThis(obeseTroll);	
							}
					}		
					if(obeseTroll.intellegence==6) {
						ridddleMeThis(obeseTroll);
					}
					if(obeseTroll.intellegence == 3) {
						ridddleMeThis(obeseTroll);
					}
					break;
					default : System.out.println("Noywokring");
				break;
				}
				
		}
	}
}