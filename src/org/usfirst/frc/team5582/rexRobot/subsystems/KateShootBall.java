package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5582.rexRobot.OI;
import edu.wpi.first.wpilibj.CANTalon;


/**
 *
 */
public class KateShootBall extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//naming  snow blower motor speed controllers
	CANTalon ballWheelLeft;
	CANTalon ballWheelRight;
	
	
	// First, some Singleton housekeeping. Make sure there is only one.	
		public static DriveTrain instance;
		
		public static DriveTrain getInstance() {
			
			// Only instantiate if no prior instance exists
			if (instance == null) {
				instance = new DriveTrain(); 
			}
			return instance;
		}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	//if the trigger is hit the wheels spin at 90% power
    	if (OI.shootBallButton.get()) {
    		ballWheelLeft.set(.9);
    		ballWheelRight.set(.9);
    	}
    	//if the button is hit the wheels spin at negative 90% power 
    	else if (OI.getBallButton.get()) {
    		ballWheelLeft.set(-.9);
    		ballWheelRight.set(-.9);
    	}
    	//if both the button and the trigger are hit at the same time, the wheels are still
    	else if (OI.getBallButton.get() && OI.shootBallButton.get()) {
    		ballWheelLeft.set(0);
    		ballWheelRight.set(0);	
    	}
    }
}


















