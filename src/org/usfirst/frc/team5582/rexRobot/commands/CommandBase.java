package org.usfirst.frc.team5582.rexRobot.commands;


import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5582.rexRobot.subsystems.AirCompressor;
import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.subsystems.BallPinchers;
import org.usfirst.frc.team5582.rexRobot.subsystems.BottomLift;
import org.usfirst.frc.team5582.rexRobot.subsystems.DriveTrain;
import org.usfirst.frc.team5582.rexRobot.subsystems.WheelArms;
import org.usfirst.frc.team5582.rexRobot.subsystems.BallGrabber;
import org.usfirst.frc.team5582.rexRobot.subsystems.Winch;
import org.usfirst.frc.team5582.rexRobot.subsystems.ErikTopLift;

/**
 *
 */
public abstract class CommandBase extends Command {
	
	public static OI oi;
	public static AirCompressor airCompressor;
	public static DriveTrain driveTrain;
	public static WheelArms wheelArms;
	public static Winch winch;
	public static BottomLift bottomLift;
	public static BallGrabber ballGrabber;
	public static BallPinchers ballPinchers;
	public static ErikTopLift topLift;
	
	public static void init() {
		driveTrain = DriveTrain.getInstance();
		bottomLift = BottomLift.getInstance();
		topLift = ErikTopLift.getInstance();
		wheelArms = WheelArms.getInstance();
		airCompressor = AirCompressor.getInstance();
		ballGrabber = BallGrabber.getInstance();
		ballPinchers = BallPinchers.getInstance();
		winch = Winch.getInstance();
		oi = new OI();
		oi.init();
	}

    public CommandBase() {
    		super();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
