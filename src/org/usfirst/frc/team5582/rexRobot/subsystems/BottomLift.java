package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.OperateBottomLift;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 *
 */
public class BottomLift extends Subsystem {
   
	// sets up sensors and motors for use
	CANTalon bottomLiftMotorA = new CANTalon(RobotMap.bottomLiftMotorA);
	CANTalon bottomLiftMotorB = new CANTalon(RobotMap.bottomLiftMotorB);
	DigitalInput wheelArmsLimitSwitch;
	Counter limitSwitchCounter;

	public static BottomLift instance;
	
	public static BottomLift getInstance() {
		
		// Makes sure only one instance exists
		if (instance == null) {
			instance = new BottomLift(); 
		}
		SmartDashboard.putData(instance);
		return instance;		
	}
	
	protected BottomLift() {
		wheelArmsLimitSwitch = new DigitalInput(9);
		limitSwitchCounter = new Counter(wheelArmsLimitSwitch);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new OperateBottomLift());
    }	
    
    public boolean isLimitSwitchTripped() {
    		SmartDashboard.putNumber("limitSwitchCounter", limitSwitchCounter.get());
    		return limitSwitchCounter.get() > 0;
    }
    
    public void initializeLimitCounter() {
    		limitSwitchCounter.reset();
    }
    
	public void down(){
		
		if (!wheelArmsLimitSwitch.get()) {
			// Disallow downward force if limit switch is closed (assembly at rest)
			bottomLiftMotorA.set(0);
			bottomLiftMotorB.set(0);
		} else {
			bottomLiftMotorA.set(0.6);
			bottomLiftMotorB.set(-0.6);
		}
		

		SmartDashboard.putString("Scaler motion", "down");
	}
	public void up() {
		bottomLiftMotorA.set(-1);
		bottomLiftMotorB.set(1);
		SmartDashboard.putString("Scaler motion", "up");
	}
	public void stop() {
		bottomLiftMotorA.set(0);
		bottomLiftMotorB.set(0);
		SmartDashboard.putString("Scaler motion", "stop");
	}
    public void setMotorPower(double power) {
		bottomLiftMotorA.set(power);
		bottomLiftMotorB.set(power);
    }
}