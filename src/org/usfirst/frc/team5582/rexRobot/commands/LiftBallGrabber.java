package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;;

/**
 *
 */
public class LiftBallGrabber extends CommandBase {

    public LiftBallGrabber() {
        // Use requires() here to declare subsystem dependencies
        requires(ballGrabber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	ballGrabber.grabberUp();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
