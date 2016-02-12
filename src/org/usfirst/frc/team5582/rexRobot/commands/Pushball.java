package org.usfirst.frc.team5582.rexRobot.commands;

import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc.team5582.rexRobot.OI;
import org.usfirst.frc.team5582.rexRobot.subsystems.Ballpusher;
/**
 *
 */
public class Pushball extends CommandBase {
	Timer timer = new Timer();
	Ballpusher ballpusher;
	
    public Pushball() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(ballpusher);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.reset();
    	timer.start();
    	ballpusher.out();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (timer.get() > .5);
    }

    // Called once after isFinished returns true
    protected void end() {
    	ballpusher.in();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	ballpusher.in();
    }
}
