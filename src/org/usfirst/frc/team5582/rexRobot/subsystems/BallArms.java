package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.RotateBallArms;
import edu.wpi.first.wpilibj.Spark;

/**
 *
 */
public class BallArms extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark rotator = new Spark(RobotMap.liftSpark);
	
	// First, some Singleton housekeeping. Make sure there is only one.	
	public static BallArms instance;
	
	public static BallArms getInstance() {
		
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new BallArms(); 
		}
		SmartDashboard.putData(instance);
		return instance;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new RotateBallArms());
    }
    
    public void setMotorPower(double power) {
    		rotator.set(power);
    }
    
}

