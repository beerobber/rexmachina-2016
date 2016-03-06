package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BallGrabber extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Solenoid grabberSolenoid = new Solenoid(RobotMap.grabberSolenoid); // Closest to Arm
	Solenoid lifterSolenoid = new Solenoid(RobotMap.liftSolenoid); // Farthest from arm
	Solenoid shooterSolenoid = new Solenoid(RobotMap.shooterSolenoid);
	public static BallGrabber instance;
	
	public static BallGrabber getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new BallGrabber(); 
		}
			SmartDashboard.putData(instance);
			return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here. Or don't.
        
    }
    
    public void grab() {
    		grabberSolenoid.set(false);
    }
    public void release() {
    		grabberSolenoid.set(true);
    }
    public void shoot() {
    		shooterSolenoid.set(true);
    }
    public void retract() {
    		shooterSolenoid.set(false);
    }
    public void lift() {
    		lifterSolenoid.set(true);
    }
    public void drop() {
    		lifterSolenoid.set(false);
    }
    
}

