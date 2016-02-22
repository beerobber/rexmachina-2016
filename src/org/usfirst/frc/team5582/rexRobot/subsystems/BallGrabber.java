package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.LiftBallGrabber;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BallGrabber extends Subsystem {
    
    /*
     * The BallGrabber is the entire rotating assembly. It carries the BallPinchers
     * subsystem, but the BallPinchers subsystem can be operated independently.	
     */
	Solenoid lifterSolenoid = new Solenoid(RobotMap.liftSolenoid); 
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
        setDefaultCommand(new LiftBallGrabber());
    }
    
    public void shooterPush() {
    		shooterSolenoid.set(true);
    }
    public void shooterPull() {
    		shooterSolenoid.set(false);
    }
    public void grabberUp() {
    		lifterSolenoid.set(true);
    }
    public void grabberDown() {
    		lifterSolenoid.set(false);
    }
    
}

