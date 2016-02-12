package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

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
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void down(){
    	topLiftMotor.set(-0.25);
    }
    public void up(){
    	topLiftMotor.set(0.25);
    }
    public void stop() {
    	topLiftMotor.set(0);
    }
}


