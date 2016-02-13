package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;

/**
 *
 */
public class AirCompressor extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Compressor compressor = new Compressor(0);
	
	public static AirCompressor instance;
	
	public static AirCompressor getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new AirCompressor(); 
		}
			return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void compressAir() {
    		compressor.start();
    }
    
}

