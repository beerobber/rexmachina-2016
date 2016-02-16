package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.commands.OperateWinch;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

/**
 *
 */
public class BallSpinners extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	CANTalon ballspinners = new CANTalon(6);
	
	// First, some Singleton housekeeping. Make sure there is only one.	
	public static BallSpinners instance;
		
	public static BallSpinners getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new BallSpinners(); 
		}
			return instance;
	}
	
	public void initDefaultCommand() {
	        // Set the default command for a subsystem here.
	        setDefaultCommand(new OperateWinch());
	    	
	    }
	    
	    public void down() {
			winch.set(-0.75);
	    }
	    public void up() {
			winch.set(0.75);
	    }
	    public void stop() {
	    		winch.set(0);
	    }
	    
	}


	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	public void reverse(); {
    		
    	}
    	public void forward(); {
    		
    	}
    }
}

