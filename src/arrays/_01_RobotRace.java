package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] arrRobot = new Robot[5];
	//3. use a for loop to initialize the robots.
    for(int i = 0; i < arrRobot.length; i++) {
	arrRobot[i] = new Robot();
	arrRobot[i].setY(500);
	arrRobot[i].setX(50+i*80);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
while(true) {
    for(int i = 0; i < arrRobot.length; i++) {
    	
    	int move = new Random().nextInt(50);
    	arrRobot[i].move(move);
    	if(arrRobot[i].getY()< 20) {
    		JOptionPane.showMessageDialog(null,"You won" );
    	}
    }
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}