package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;

/**
 *
 */
public class ViewCamera extends CommandBase {

    public ViewCamera() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(camera);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    //	camera.getCameraFeed(); *This is likely the only problem (unless it needs to be put to dashboard somehow)
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
