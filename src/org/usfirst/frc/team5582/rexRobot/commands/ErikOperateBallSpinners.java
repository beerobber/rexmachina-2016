package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ErikOperateBallSpinners extends CommandBase {

    public ErikOperateBallSpinners() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	OI.BallSpinnerState state = OI.getBallSpinnerState();
    	//possibly set state to false if button for other system is pressed
    	switch (state) {
    	case IN: {
    		ballSpinner.in();
    		break;
    	}
    	case OUT: {
    		ballSpinner.out();
    		break;
    	}
    	case STOP:  {	
    		ballSpinner.stop();
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
