package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.commands.RotateArms;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.AnalogPotentiometer;


/**
 *
 */
public class WheelArms extends Subsystem {
    
	
	Spark wheelArms = new Spark(0);
	// String potentiometer declared for port zero
	AnalogPotentiometer wheelArmsPot = new AnalogPotentiometer(0, 360, 30);
	
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
    		wheelArms.set(-0.75);
    }
    public void up() {
    		wheelArms.set(0.75);
    }
    public void stop() {
		wheelArms.set(0);
    }
    
    // Code creating a public variable with the wheel arms position
    		public double getWheelArmsPosition() {
    			return wheelArmsPot.get();
    		}
}

