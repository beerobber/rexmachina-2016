package org.usfirst.frc.team5582.rexRobot.commands;


import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.subsystems.*;

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
	public static BallShooter ballShooter;
	public static ErikTopLift topLift;
	public static BallArms ballArms;
	public static Camera camera;
	
	public static void init() {
		driveTrain = DriveTrain.getInstance();
		bottomLift = BottomLift.getInstance();
		topLift = ErikTopLift.getInstance();
		wheelArms = WheelArms.getInstance();
		airCompressor = AirCompressor.getInstance();
		ballGrabber = BallGrabber.getInstance();
		ballShooter = BallShooter.getInstance();
		winch = Winch.getInstance();
		ballArms = BallArms.getInstance();
		camera = Camera.getInstance();
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
