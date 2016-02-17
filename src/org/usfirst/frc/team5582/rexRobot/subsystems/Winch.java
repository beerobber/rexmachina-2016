package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.commands.OperateWinch;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;
import org.usfirst.frc.team5582.rexRobot.RobotMap;

/**
 *
 */
public class Winch extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	CANTalon winch = new CANTalon(RobotMap.winch);
	
	// First, some Singleton housekeeping. Make sure there is only one.	
	public static Winch instance;
		
	public static Winch getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new Winch(); 
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
    public void down(double speed) {
    		winch.set(Math.abs(speed)*-1.0);
    }
    public void up() {
    		winch.set(0.75);
    }
    public void up(double speed) {
		winch.set(Math.abs(speed));
}
    public void stop() {
    		winch.set(0);
    }
    
}

