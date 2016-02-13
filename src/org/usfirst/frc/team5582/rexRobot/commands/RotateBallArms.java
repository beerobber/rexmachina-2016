package org.usfirst.frc.team5582.rexRobot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.subsystems.BallArms;

/**
 *
 */
public class RotateBallArms extends Command {

	BallArms ballArms;
	
    public RotateBallArms() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(ballArms);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	OI.BallArmsState state = OI.getBallArmsState();
		switch (state) {
		case DOWN: {
			ballArms.down();
			break;
		}
		case UP: {
			ballArms.up();
			break;
		}
		case STOP: {
			ballArms.stop();
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
