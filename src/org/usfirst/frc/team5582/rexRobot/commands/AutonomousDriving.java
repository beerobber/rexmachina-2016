package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;

/**
 *
 */
public class AutonomousDriving extends CommandBase {

	private double time = 0;
	
    public AutonomousDriving() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		time = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		if (time < 100) {
        		driveTrain.arcadeDriveAutonomous();
    		} else {
    			driveTrain.stopDrive();
    		}
    		time++;

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