package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;

/**
 *
 */
public class ErikOperateTopLift extends CommandBase {

    public ErikOperateTopLift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(topLift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	OI.TopLiftState state = OI.getTopLiftState();
    	
    	switch(state){
    	case DOWN: {
    		topLift.down();
    		break;
    	}
    	case UP: {
    		topLift.up();
    		break;
    	}
    	case STOP:{
    		topLift.stop();
    	}
    	}
    	//make the encoder once set up output to smart dashboard.
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
