//THIS CLASS STILL NEEDS WORK. MUST EXPERIMENT WITH VALUES GIVEN OFF BY WINCH AND ACCELEROMETER

package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;

/**
 *
 */
public class OperateBottomLift extends CommandBase {

    public OperateBottomLift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//need the Bottom Lift, Winch, and Drive Train
    	requires(bottomLift);
    	//requires(driveTrain);
    	//requires(winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	//TODO set up turn counter for winch encoder
    	
    	//TODO set up way of making corrections of winch/encoder according to accelerometer and encoder
    	
    	
    	OI.BottomLiftState state = OI.getBottomLiftState();
    	//possibly set state to false if button for other system is pressed
    	switch (state) {
    	case DOWN: {
    		//winch.down(.1);
    		bottomLift.down();
    		break;
    	}
    	case UP: {
    		//winch.up(.1);
    		bottomLift.up();
    		break;
    	}
    	case STOP:  {
    		winch.stop();	
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
    	winch.stop();
    }
}
