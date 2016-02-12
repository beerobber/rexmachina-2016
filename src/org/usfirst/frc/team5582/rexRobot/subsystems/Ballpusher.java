package org.usfirst.frc.team5582.rexRobot.subsystems;

import org.usfirst.frc.team5582.rexRobot.commands.Pushball;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 */
public class Ballpusher extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Solenoid Ballpusher = new Solenoid(2);
	
	// First, some Singleton housekeeping. Make sure there is only one.	
	public static Ballpusher instance;
		
	public static Ballpusher getInstance() {
			
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new Ballpusher(); 
		}
			return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Pushball());
    	
    }
   public void in(){
	 Ballpusher.set(false);  
   }
   public void out(){
	 Ballpusher.set(true);  
   }
}

    
    


