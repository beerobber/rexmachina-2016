//This branch has been commandeered by drew
package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	RobotDrive rexDrive;
	CANTalon leftTalon, rightTalon;
    public AnalogInput ultrasonicSensor;

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
		
		ultrasonicSensor = new AnalogInput(RobotMap.ultrasonicSensorChannel);

    }
    
    public void tankDrive(double leftY, double rightY) {
    	rexDrive.tankDrive(leftY, rightY);
    }
    
    public void arcadeDrive(Joystick stick) {
    	rexDrive.arcadeDrive(stick);
    }
    
}

