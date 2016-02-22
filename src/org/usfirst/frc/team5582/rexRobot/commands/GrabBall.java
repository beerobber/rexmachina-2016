package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;

/**
 *
 */
public class GrabBall extends CommandBase {

    public GrabBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(ballGrabber);
    		requires(ballPinchers);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		ballGrabber.grabberDown();
    		ballPinchers.pinchersOpen();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    		
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !OI.ballGrab.get();
    }

    // Called once after isFinished returns true
    protected void end() {
    		ballPinchers.pinchersClose();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}