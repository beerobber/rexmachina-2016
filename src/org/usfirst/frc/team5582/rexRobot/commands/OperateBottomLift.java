package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OperateBottomLift extends CommandBase {

    public OperateBottomLift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//need the Bottom Lift, Winch, and Drive Train
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
    	
    	OI.BottomLiftState state = OI.getBottomLiftState();
    	//possibly set state to false if button for other system is pressed
    	switch (state) {
    	case DOWN: {
    		bottomLift.down();
    		break;
    	}
    	case UP: {
    		bottomLift.up();
    		break;
    	}
    	case STOP: {
    		bottomLift.stop();
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
    	//stops operation of lift if interupted
    	bottomLift.stop();
    }
}
