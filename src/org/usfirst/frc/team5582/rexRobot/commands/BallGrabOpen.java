package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BallGrabOpen extends CommandBase {

    public BallGrabOpen() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(ballGrabber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		//Scheduler.getInstance().add(new RetractShooter());
    		ballGrabber.grabberRelease();
    		SmartDashboard.putString("grabber-open", "init");

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    		SmartDashboard.putString("grabber-open", "execute");
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
		SmartDashboard.putString("grabber-open", "end");

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
		SmartDashboard.putString("grabber-open", "interrupt");

    }
}
