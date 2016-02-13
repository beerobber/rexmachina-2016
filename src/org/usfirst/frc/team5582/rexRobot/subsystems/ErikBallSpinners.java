package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

/**
 *
 */
public class ErikBallSpinners extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon ballSpinnerMotor = new CANTalon(6);
	
	public static ErikBallSpinners instance;
	
	public static ErikBallSpinners getInstance(){
		if (instance == null) {
			instance = new ErikBallSpinners();
		}
		return instance;
	}
	
	public void out(){
		ballSpinnerMotor.set(0.7);
	}
	public void in(){
		ballSpinnerMotor.set(-0.7);
	}
	public void stop(){
		ballSpinnerMotor.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

