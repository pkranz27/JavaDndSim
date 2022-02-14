package Dnd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Enemy extends Dice implements Npc {

	Scanner input = new Scanner(System.in);
	Map<String,Integer>inventory  = new HashMap<String,Integer>();
	Random rand = new Random();
	List<String>enemySpeak = new ArrayList<>();
	public String name;
	public int hitPoints;
	Integer exp = 10;
	Integer intellegence = 10;
	
	
	public Integer getIntellegence() {
		return intellegence;
	}

	public void setIntellegence(Integer intellegence) {
		this.intellegence = intellegence;
	}

	//constructor	
	public Enemy(){
		
	};
	
	Enemy(String name, int hitPoints, Integer exp, Integer intellgence) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.input = input;
		this.inventory = inventory;
		this.exp = exp;
		this.intellegence=intellgence;
	}
// MEthods

	public String question1(Enemy enemy) {
		
		if(enemy.name.equals("Zombie")) {
			System.out.println("Hi friend, would you like to make more Money and be your own boss? Well... ");
			System.out.println("Ah, a " + name + ", great."	+ "\n Looks like there is no other option, doesnt seem very chatty, time to die.");
		}
		if(enemy.name.equals("Fat Troll")){
			System.out.println("\"Hi, I ugh read your sign and Im here for the challenge\" \n The Troll looks down his pocked fat fucking nose and says \"Are you a Woman, Are you single, and are you under 25?\". You contemplate your reply when he rasies his hand \"The answer is no, obviously not, . You are lucky, Im a nice guy. Ill allow you to play the game./");   
		}
		return name;
	}
	

	public Map<String, Integer> inspect(Enemy enemy) {
		System.out.println("What do we have here:");
		getInventory(enemy);
		System.out.println(inventory);	
		System.out.println("Would you like to take these Items?");
		return inventory;

	}
	
	public Map<String, Integer> loot(Enemy enemy){
		if(enemy.name.equals("Zombie")) {
			getInventory(enemy);
			System.out.println("Congrats! You have obtained a " + inventory+ "\n A truly special kind of item");
		
		}
		if(enemy.name.equals("Fat Troll")) {
			System.out.println("Congrats! You have obtained a " + inventory+ "\n A truly special kind of item");
		}
		else {
			System.out.println("You have nothing to equip");
		}
		
		
		return getInventory(enemy);
	} 

	public Map<String, Integer> getInventory(Enemy enemy) {
		if(enemy.name.equals("Zombie")) {
			this.inventory.put("MLM broucher: Intellgence decrease", -3);
		}
		if(enemy.name.equals("Fat Troll")) {
			this.inventory.put("Sharp chicken Bone: Attack increase", +4);
			
		}
	return inventory;
		
	}
	
	public int myAttack() { // Lowers HP and
		getHitPoints();
		randomRoll();
			do{
				callForHelp();
				this.hitPoints = (int) (this.hitPoints - crit);
				System.out.println(this.name + " has hit points left: "+ hitPoints+"\n");
				return hitPoints;
				
			}while(hitPoints > 0);
	}
			

	// getters and setters


	public Enemy(String name) {
		super();
		this.name = name;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}




	// interface methods
	public void callForHelp() {
		talk();			
		String randomElement = enemySpeak.get(rand.nextInt(enemySpeak.size()));
		System.out.println( enemySpeak.get(rand.nextInt(enemySpeak.size())));
	}

	
	public List<String> talk() {
		enemySpeak.add("Gargh!");
		enemySpeak.add("blergh");
		enemySpeak.add("GAARRRAAR");
		enemySpeak.add("OK, stop hitting me already");
		return enemySpeak;
		
	}

	
	


	
	

}
