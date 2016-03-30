package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;

/**
 *
 */
public class AutonomousWinch extends CommandBase {
	
	private double time = 0;
	
    public AutonomousWinch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		if (time < 50) {
    			winch.down();
    		} else {
    			winch.stop();
    		}
    		time++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
