package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.OperateBottomLift;

import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.CANTalon;


/**
 *
 */
public class BottomLift extends Subsystem {
   
	// sets up sensors and motors for use
	// Mapping Accelerometer to its port and range (placeholder mode: +-2g mode)
	Accelerometer accel = new ADXL345_I2C(I2C.Port.kOnboard, Accelerometer.Range.k4G);
	CANTalon bottomLiftMotor = new CANTalon(RobotMap.bottomLiftMotor);
	// set up the speed controller
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static BottomLift instance;
	
	public static BottomLift getInstance() {
		
		// Makes sure only one instance exists
		if (instance == null) {
			instance = new BottomLift(); 
		}
		return instance;		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new OperateBottomLift());
    }	

	// Y Tilt Getter
	public double getBottomLiftTilt(){
		return accel.getY();
	}
	
	public void down(){
	bottomLiftMotor.set(-0.5);
	}
	public void up() {
	bottomLiftMotor.set(0.5);
	}
	public void stop() {
	bottomLiftMotor.set(0);
	}
}