package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class ShootBall extends CommandBase {
	
	double time;
    public ShootBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(ballGrabber);
    	requires(ballShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	ballGrabber.grabberRelease();
	ballShooter.shooterPush();
    	time = Timer.getFPGATimestamp();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//TODO if timer greater than half second,  shoot/push
    	
    		//Timer.delay(0.5);
        	time = Timer.getFPGATimestamp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
    		if (time < 1) {
    			return false;
    		}
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//TODO retract, maybe stop timer
    		ballShooter.shooterRetract();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//TODO also retract, maybe stop timer
    		ballShooter.shooterRetract();
    }
}
