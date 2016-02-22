package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BallPinchers extends Subsystem {
    
	/*
	 * The BallPinchers are attached to the BallGrabber assembly 
	 * but can operate independently
	 */
	Solenoid pincherSolenoid = new Solenoid(RobotMap.pincherSolenoid); 
	
	public static BallPinchers instance;
	
	public static BallPinchers getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new BallPinchers(); 
		}
		SmartDashboard.putData(instance);
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void pinchersClose() {
		pincherSolenoid.set(false);
    }
    public void pinchersOpen() {
		pincherSolenoid.set(true);
    }
}

