package org.usfirst.frc.team5582.rexRobot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.subsystems.BallSpinners;

/**
 *
 */
public class SpinBall extends Command {
	
	BallSpinners ballspinners;

    public SpinBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(ballspinners);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	OI.SpinnerState state = OI.getSpinnerState();
		switch (state) {
		case DOWN: {
			ballspinners.down();
			break;
		}
		case UP: {
			ballspinners.up();
			break;
		}
		case STOP: {
			ballspinners.stop();
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

