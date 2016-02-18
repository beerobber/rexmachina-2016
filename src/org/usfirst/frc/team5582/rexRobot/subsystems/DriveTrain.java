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

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	RobotDrive rexDrive;
	CANTalon leftTalonA, leftTalonB, rightTalonA, rightTalonB;
    public AnalogInput ultrasonicSensor;

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
    		double powerLeftA = leftTalonA.get();
    		double powerLeftB = leftTalonB.get();
    		double powerRightA = rightTalonA.get();
    		double powerRightB = rightTalonB.get();
    		rexDrive = new RobotDrive(leftTalonB, leftTalonA, rightTalonB, rightTalonA);
		
		ultrasonicSensor = new AnalogInput(RobotMap.ultrasonicSensorChannel);
    }
    
    public void tankDrive(double leftY, double rightY) {
    		rexDrive.tankDrive(leftY, rightY);
    }
    
    public void arcadeDrive(Joystick stick) {
    		rexDrive.arcadeDrive(stick);
    }
    
    public void turboDrive() {
    		/*double powerLeftA = leftTalonA.get();
		double powerLeftB = leftTalonB.get();
		double powerRightA = rightTalonA.get();
		double powerRightB = rightTalonB.get();
		*/
    		leftTalonA.set(1.2);
    		leftTalonB.set(1.2);
    		rightTalonA.set(1.2);
    		rightTalonB.set(1.2);
    }
    
}

