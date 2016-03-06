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
	Solenoid shooterSolenoidOne = new Solenoid(RobotMap.shooterSolenoidOne); 
	Solenoid shooterSolenoidTwo = new Solenoid(RobotMap.shooterSolenoidTwo);
	
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
		shooterSolenoidOne.set(true);
		shooterSolenoidTwo.set(true);
    }
    public void shooterRetract() {
    		shooterSolenoidOne.set(false);
    		shooterSolenoidTwo.set(false);
    }  
}
