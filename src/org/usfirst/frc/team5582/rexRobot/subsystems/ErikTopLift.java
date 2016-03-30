package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.ErikOperateTopLift;

/**
 *
 */
public class ErikTopLift extends Subsystem {
    
	CANTalon topLiftMotor;
    // encoder needs to be made here

	public static ErikTopLift instance;
	
	public static ErikTopLift getInstance() {
		if (instance == null) {
			instance = new ErikTopLift();
		}
		return instance;
	}
	
	protected ErikTopLift() {
		topLiftMotor = new CANTalon(RobotMap.topLiftMotor);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new ErikOperateTopLift());
    }
    public void down(){
    	topLiftMotor.set(-0.3);
    }
    public void up(){
    	topLiftMotor.set(1);
    }
    public void stop() {
    	topLiftMotor.set(0);
    }
}


