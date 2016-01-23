package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	Encoder encoder;
	RobotDrive rexDrive;
	CANTalon leftTalon, rightTalon;

	// First, some Singleton housekeeping. Make sure there is only one.	
	public static DriveTrain instance;
	
	public static DriveTrain getInstance() {
		
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new DriveTrain(); 
		}
		return instance;
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArcadeDrive());
    }
    
    protected DriveTrain() {
    	leftTalon = new CANTalon(RobotMap.leftMotorCAN);
    	rightTalon = new CANTalon(RobotMap.rightMotorCAN);
    	rexDrive = new RobotDrive(leftTalon, rightTalon);
    	encoder = new Encoder(1, 2, true, EncodingType.k4X);
    }
    
    public void tankDrive(double leftY, double rightY) {
    	rexDrive.tankDrive(leftY, rightY);
    }
    
    public void arcadeDrive(Joystick stick) {
    	rexDrive.arcadeDrive(stick);
    }
    
}

