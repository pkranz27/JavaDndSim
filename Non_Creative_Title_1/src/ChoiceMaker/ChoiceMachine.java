package ChoiceMaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChoiceMachine {
List<String>choiceList = new ArrayList();
Random rand = new Random();
public ChoiceMachine(){
	choiceList = this.choiceList;
};



public void choiceMaker(){
	
	
	System.out.println(choiceList.get(rand.nextInt(choiceList.size())));
	}
public List<String> getChoices() {
	choiceList.add("Eureka");
	choiceList.add("Roulette");
	choiceList.add("Mount Farm");
	choiceList.add("Halloween");
	choiceList.add("GreatHunt");
	return choiceList;
};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChoiceMachine choose =  new ChoiceMachine();
		choose.getChoices();
		choose.choiceMaker();
	}

}
