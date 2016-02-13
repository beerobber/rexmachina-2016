package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.commands.RotateBallArms;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallArms extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Solenoid armsLifterOut = new Solenoid(0); // Closest to Arm
	Solenoid armsLifterIn = new Solenoid(1); // Farthest from arm
	
	public static BallArms instance;
	
	public static BallArms getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new BallArms(); 
		}
			return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RotateBallArms());
    }
    public void up() {
    	armsLifterOut.set(true);
    	armsLifterIn.set(false);
    }
    public void down() {
    	armsLifterOut.set(false);
    	armsLifterIn.set(true);
    }
    public void stop() {
    	armsLifterOut.set(false);
    	armsLifterIn.set(false);
    }
}

