package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.CANTalon;
/**
 *
 */
public class CoryUpperLift extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	CANTalon upperLift = new CANTalon(8);
	
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
    	
    }
    
    public void down() {
    	upperLift.set(-0.75);
    }
    public void up() {
    	upperLift.set(0.75);
    }
}

