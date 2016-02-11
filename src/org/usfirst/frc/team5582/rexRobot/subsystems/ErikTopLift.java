package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

/**
 *
 */
public class ErikTopLift extends Subsystem {
    
	CANTalon topLiftMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public static BottomLift instance;
	
	public static BottomLift getInstance() {
		if (instance == null) {
			instance = new BottomLift();
		}
		return instance;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

