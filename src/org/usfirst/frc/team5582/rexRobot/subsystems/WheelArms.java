package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.commands.RotateArms;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.AnalogPotentiometer;


/**
 *
 */
public class WheelArms extends Subsystem {
    
	// The speed controller is a Spark, but it is used like a Talon
	Spark wheelArmsTalon;
	// String potentiometer declared for port zero
	AnalogPotentiometer WheelArmsPot = new AnalogPotentiometer(0, 360, 30);
	
	// First, some Singleton housekeeping. Make sure there is only one.	
		public static WheelArms instance;
		
		public static WheelArms getInstance() {
			
			// Only instantiate if no prior instance exists
			if (instance == null) {
				instance = new WheelArms(); 
			}
			return instance;
		}
	
		

	
    public void initDefaultCommand() {
        // Setting the default command for a subsystem here.
    		// This command always runs
        setDefaultCommand(new RotateArms());
    }
    public void down() {
    		wheelArmsTalon.set(-0.75);
    }
    public void up() {
    		wheelArmsTalon.set(0.75);
    }
    public void stop() {
		wheelArmsTalon.set(0);
    }
}

