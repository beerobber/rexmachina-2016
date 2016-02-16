package org.usfirst.frc.team5582.rexRobot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ErikFollowObject extends CommandBase {

    public ErikFollowObject() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis) ;
    	
    	//We require exclusive use of the drive train
    	requires(driveTrain);
   
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {  
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
         double voltage = driveTrain.ultrasonicSensor.getVoltage();
         double inches = (voltage/9.766)*1000-6;
         SmartDashboard.putNumber("raw ultrasonic range", voltage);
         SmartDashboard.putNumber("inches ultrasonic range", inches);
         
         // Determine range of inches for object to be considered "followed"
         // so that the robot is still. 
         // (e.g. min-inches 24, max-inches 36)
         int followMinimumInches = 12;
         int followMaximumInches = 24;
         
         //sets variables for following direction to null
         Boolean followForward = false;
         Boolean followBackward = false;
         
         // Determine direction and speed to intercept object
         if (inches > followMaximumInches){
        	 followForward = true;	 
         }
         if (inches < followMinimumInches){
        	 followBackward = true;
         }
         
         // Set drive train motors to intercept object
         if (followForward){
        	 // Setting the motors to move forwards
        	 driveTrain.tankDrive(-0.6, -0.6);
         }
         if (followBackward){
        	 //Setting the motors to move backwards
        	 driveTrain.tankDrive(0.6, 0.6);
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
    }
}
