package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] agrs){

	//2. create an array of 5 robots.
	
	Robot[] ray =  new Robot[5];
	int x = 100;
	int y=500;
	//3. use a for loop to initialize the robots.
for(int i=0; i<ray.length; i++){
	ray [i] = new Robot();
	ray[i].moveTo(x,y);
	x=x+100;
}
	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random fifty = new Random();

int hey = 0;
int yo =0;

int loser = hey;
int winner = hey;

do{

for(int i=0; i<ray.length; i++){
	int coop = fifty.nextInt(50);
	ray[i].setSpeed(30);
	ray[i].move(coop);
	hey = ray[i].getY();
	yo = ray[i].getX();
	
	if(hey<loser){
		loser=hey;
	}
	if(hey>winner){
		winner=hey;
	winner=yo;
}
	
}
}while (hey>=90);

System.out.println("Robot "+yo+" has won! WOOOOOOO!");
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!


	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}
}
