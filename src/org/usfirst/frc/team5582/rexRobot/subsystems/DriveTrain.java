//This branch has been commandeered by drew
package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	RobotDrive rexDrive;
	CANTalon leftTalonA, leftTalonB, rightTalonA, rightTalonB;
    public AnalogInput ultrasonicSensor;
    public Encoder encoder;
    private double time = 0;

	// First, some Singleton housekeeping. Make sure there is only one.	
	public static DriveTrain instance;
	
	public static DriveTrain getInstance() {
		
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new DriveTrain(); 
		}
		SmartDashboard.putData(instance);
		return instance;
	}
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArcadeDrive());
    }
    
    protected DriveTrain() {
    		leftTalonA = new CANTalon(RobotMap.leftMotorCANA);
    		leftTalonB = new CANTalon(RobotMap.leftMotorCANB);
    		rightTalonA = new CANTalon(RobotMap.rightMotorCANA);
    		rightTalonB = new CANTalon(RobotMap.rightMotorCANB);
    		rexDrive = new RobotDrive(rightTalonB, rightTalonA, leftTalonB, leftTalonA);

		ultrasonicSensor = new AnalogInput(RobotMap.ultrasonicSensorChannel);
		encoder = new Encoder(RobotMap.encoderLeftA, RobotMap.encoderLeftB);
    }
    
    public void tankDrive(double leftY, double rightY) {
    		rexDrive.tankDrive(leftY, rightY);
    }
    
    public void arcadeDriveSingleStick(Joystick stick) {
    		rexDrive.arcadeDrive(stick);
    }
    public void arcadeDriveStickAxis(double leftY, double leftX) {
    		rexDrive.arcadeDrive(leftY, leftX);
    		SmartDashboard.putNumber("Encoder value", encoder.getDistance());
    }
    public void arcadeDriveAutonomous() {
    		rexDrive.setLeftRightMotorOutputs(0.75, -0.75);
    }
    public void stopDrive() {
    		rexDrive.setLeftRightMotorOutputs(0, 0);
    }
    
    
}

