package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BallShooter extends Subsystem {
    
	/*
	 * The BallPinchers are attached to the BallGrabber assembly 
	 * but can operate independently
	 */
	Solenoid shooterSolenoid = new Solenoid(RobotMap.shooterSolenoid); 
	
	public static BallShooter instance;
	
	public static BallShooter getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new BallShooter(); 
		}
		SmartDashboard.putData(instance);
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());


}
    
    public void shooterPush() {
		shooterSolenoid.set(true);
    }
    public void pinchersOpen() {
    		shooterSolenoid.set(false);
    }  
}
