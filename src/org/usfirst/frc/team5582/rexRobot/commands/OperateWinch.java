package org.usfirst.frc.team5582.rexRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.subsystems.Winch;

/**
 *
 */
public class OperateWinch extends Command {

	Winch winch;
	
    public OperateWinch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	OI.WinchState state = OI.getWinchState();
		switch (state) {
		case DOWN: {
			winch.down();
			break;
		}
		case UP: {
			winch.up();
			break;
		}
		case STOP: {
			winch.stop();
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
