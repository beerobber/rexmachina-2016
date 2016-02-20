package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Compressor;

import org.usfirst.frc.team5582.rexRobot.commands.ManageAirCompressor;

/**
 *
 */
public class AirCompressor extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Compressor compressor = new Compressor(2);
	
	public static AirCompressor instance;
	
	public static AirCompressor getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new AirCompressor(); 
		}
		SmartDashboard.putData(instance);
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    		setDefaultCommand(new ManageAirCompressor());
    }
    
    public void compressAir() {
    		compressor.start();
    }
    
}

