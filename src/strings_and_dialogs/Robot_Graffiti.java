package strings_and_dialogs;

import java.awt.event.TextEvent;

import javax.swing.plaf.FontUIResource;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {
public static void main(String[] args) {
	Robot g=new Robot();
	g.setSpeed(100);
	g.turn(-90);
	g.move(300);
	g.turn(90);
	g.penDown();
	g.setSpeed(100);
	g.turn(30);
	g.move(240);
	g.turn(180);
	g.move(75);
	g.turn(240);
	g.move(70);
	g.turn(240);
	g.move(75);
	g.turn(180);
	g.move(240);
	g.penUp();
	
	g.turn(-60);
	g.move(100);
	g.turn(-90);
	g.penDown();
	
	g.move(200);
	g.turn(180);
	g.move(65);
	g.turn(-145);
	g.move(65);
	g.turn(180);
	g.move(60);
	g.turn(-70);
	g.move(170);
	
	g.turn(180);
	g.move(170);
	g.turn(-145);
	g.penUp();
	g.move(135);
	g.turn(-90);
	g.move(200);
	g.penDown();
	g.setSpeed(100);
	g.hide();
	for (int i = 0; i < 180; i++) {
		g.move(1);
	g.turn(-1);
	}
	for (int i = 0; i <180; i++) {
		g.move(1);
		g.turn(1);
	}
	g.penUp();
	g.show();
	g.move(200);
	g.turn(90);
	
	g.penDown();
	g.move(200);
	g.turn(-90);
	g.move(50);
	g.turn(180);
	g.move(50);
	g.turn(90);
	g.move(100);
	g.turn(90);
	g.move(50);
	g.turn(180);
	g.move(50);
	g.turn(90);
	g.move(100);
	g.turn(90);
	g.move(50);
	g.turn(180);
	g.move(50);
	g.turn(180);
	g.penUp();
	g.move(250);
	g.turn(90);
	g.penDown();
	g.move(200);
	g.turn(-90);
	g.move(50);
	g.penUp();
	g.move(100);
	
	
}
}
