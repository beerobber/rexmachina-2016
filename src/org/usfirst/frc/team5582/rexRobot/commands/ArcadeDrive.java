package org.usfirst.frc.team5582.rexRobot.commands;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team5582.rexRobot.OI;

/**
 *
 */
public class ArcadeDrive extends CommandBase {

    public ArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires((Subsystem) driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	driveTrain.arcadeDrive(OI.arcadeStick);
    	double voltage = driveTrain.ultrasonicSensor.getVoltage();
        double inches = (voltage/9.766)*1000-6;
        SmartDashboard.putNumber("raw ultrasonic range", voltage);
        SmartDashboard.putNumber("inches ultrasonic range", inches);
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