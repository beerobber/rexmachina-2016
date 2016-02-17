package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.RotateArms;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.AnalogPotentiometer;

/**
 *
 */
public class WheelArms extends Subsystem {
    
	// Speed controller
	Spark myWheelArms;
	// String potentiometer
	AnalogPotentiometer wheelArmsPot;
	
	// First, some Singleton housekeeping. Make sure there is only one.	
	public static WheelArms instance;
		
	public static WheelArms getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new WheelArms(); 
		}
		SmartDashboard.putData(instance);

		return instance;
	}
	
    protected WheelArms() {
		myWheelArms = new Spark(RobotMap.wheelArms);
		wheelArmsPot = new AnalogPotentiometer(0, 360, 30);
    }
	
    public void initDefaultCommand() {
        setDefaultCommand(new RotateArms());
    }
    public void down() {
    		myWheelArms.set(-0.5);
    		SmartDashboard.putString("WheelArms motion", "down");
    }
    public void up() {
    		myWheelArms.set(0.5);
    		SmartDashboard.putString("WheelArms motion", "up");
    }
    public void stop() {
		myWheelArms.set(0);
		SmartDashboard.putString("WheelArms motion", "stop");
    }
    
    // Code creating a public variable with the wheel arms position
    	public double getWheelArmsPosition() {
    		return wheelArmsPot.get();
    	}
}

