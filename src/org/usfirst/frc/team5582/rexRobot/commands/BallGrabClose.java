package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BallGrabClose extends CommandBase {

    public BallGrabClose() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(ballGrabber);
    		
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    		
    		ballGrabber.grabberGrab();
    		SmartDashboard.putString("grabber-close", "init");

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		SmartDashboard.putString("grabber-close", "execute");

    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
		SmartDashboard.putString("grabber-close", "end");

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
		SmartDashboard.putString("grabber-close", "interrupt");

    }
}