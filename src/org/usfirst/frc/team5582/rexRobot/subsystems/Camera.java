package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5582.rexRobot.RobotMap;
import org.usfirst.frc.team5582.rexRobot.commands.ViewCamera;

/**
 *
 */
public class Camera extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CameraServer camera;
	
	
	public static Camera instance;
	
	public static Camera getInstance() {
		
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new Camera(); 
		}
		SmartDashboard.putData(instance);
		return instance;
	}


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    		setDefaultCommand(new ViewCamera());
    }
    
    public void getCameraFeed() {
  	  camera = CameraServer.getInstance();
   	  camera.setQuality(50);
  	  camera.startAutomaticCapture("cam0");
    }
    
}

