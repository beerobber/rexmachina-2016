package org.usfirst.frc.team5582.rexRobot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OperateBottomLift extends CommandBase {

    public OperateBottomLift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//need the Bottom Lift and Winch
    	requires(bottomLift);
    	requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//getting tilt from bottom lift
    	double bottomLiftTilt = bottomLift.getBottomLiftTilt(); 
    	//TODO set up turn counter for winch encoder
    	
    	
    	
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
