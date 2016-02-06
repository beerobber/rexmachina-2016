package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RotateArms extends CommandBase {

	
	
    public RotateArms() {
        // Declaring subsystem dependencies
        // RotateArms requires exclusive wheeled arm use
    		requires((Subsystem) wheelArms);
    }
    


    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    		OI.WheelArmState state = OI.getWheelArmState();
    		switch (state) {
    		case DOWN: {
    			wheelArms.down();
    			break;
    		}
    		case UP: {
    			wheelArms.up();
    			break;
    		}
    		case STOP: {
    			wheelArms.stop();
    			break;
    		}
    		}
    	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
