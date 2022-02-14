
package Dnd;
import java.util.Random;
	public abstract class Dice {
		double rollOne;
		double rollTwo;
		double crit;
		Dice(){
			
		}
		public Dice(double rollOne, double rollTwo) {
		this.rollOne = rollOne;
		this.rollTwo = rollTwo;
		this.crit = crit;
	}
	
	public double randomRoll() {
		
		this.rollOne = (int)(Math.random()*20);
		this.crit= rollOne + rollTwo;
			if(crit > 15) {
				System.out.println("CRITICAL HIT: " + crit + " points of damage");				
			}
			else if(crit == 0){
				System.out.println("Attack has missed  " + crit);
			}
			else if(crit < 6) {
				System.out.println("Glancing Blow: " + crit + " points of damage");
				
				
				
				
			}
			else {
				System.out.println("Attack has Done: "+ crit + " points of damage");
			}
		return crit;
					
		}


}
