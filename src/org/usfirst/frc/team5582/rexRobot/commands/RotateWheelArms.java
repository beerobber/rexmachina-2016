package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RotateWheelArms extends CommandBase {

    public RotateWheelArms() {
        // Declaring subsystem dependencies
        // RotateArms requires exclusive wheeled arm use
    		requires(wheelArms);
    }
   
    // Called just before this Command runs the first time
    protected void initialize() {
		SmartDashboard.putData(this);
		SmartDashboard.putString("RotateWheelArms init", "here");
		//wheelArms.initializeLimitCounter();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    		/*
    		OI.WheelArmsState state = OI.getWheelArmsState();
    		switch (state) {
    		case DOWN: {
    			wheelArms.down();
    			//wheelArms.initializeLimitCounter();
    			break;
    		}
    		case UP: {
    			wheelArms.up();
    			/*
    			if (!wheelArms.isLimitSwitchTripped()) {
        			wheelArms.up();    				
    			} else {
    				wheelArms.stop();
    			}
    			
    			break;
    		}
    		case STOP: {
    			wheelArms.stop();
    			break;
    		}
    		}
    		*/
    		double power = OI.xboxControllerOne.rightStick.getY();
    		wheelArms.setMotorPower(power);
    		
    		// This puts the position of the wheel arms on the screen
    		SmartDashboard.putNumber("Wheel Arms Position", wheelArms.getWheelArmsPosition());
    		
    		/*
    		double upperLimitValue = 0;
    		double lowerLimitValue = 0;
    		if (wheelArms.getWheelArmsPosition() == upperLimitValue) {
    			wheelArms.setMotorPowerDown(power);
    		}
    		if (wheelArms.getWheelArmsPosition() == lowerLimitValue) {
    			wheelArms.setMotorPowerUp(power);
    		}
    		*/
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
    		wheelArms.stop();
    }
}
