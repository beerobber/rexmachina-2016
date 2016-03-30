package org.usfirst.frc.team5582.rexRobot.commands;

import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.commands.CommandBase;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RotateBallArms extends CommandBase {

    public RotateBallArms() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(ballArms);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		SmartDashboard.putData(this);
		SmartDashboard.putString("RotateBallArms init", "here");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double power = OI.xboxControllerTwo.rightStick.getY();
    	ballArms.setMotorPower(power);
    	SmartDashboard.putNumber("Ball Arms Position", ballArms.getBallArmsPosition());
    }
    
    /*
	double upperLimitValue = 0;
	double lowerLimitValue = 0;
	if (ballArms.getballArmsPosition() == upperLimitValue) {
		ballArms.setMotorPowerDown(power);
	}
	if (ballArms.getballArmsPosition() == lowerLimitValue) {
		ballArms.setMotorPowerUp(power);
	}
	*/

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
