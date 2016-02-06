package org.usfirst.frc.team5582.rexRobot.subsystems;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.kauailabs.navx.frc.AHRS;

/**
 *
 */
public class NavX extends Subsystem {
	
	private AHRS ahrs;
	
	public static NavX instance;
	
	public static NavX getInstance() {
		
		// Only instantiate if no prior instance exists
		if (instance == null) {
			instance = new NavX(); 
		}
    		try {
            /* Communicate w/navX MXP via the MXP SPI Bus.                                     */
            /* Alternatively:  I2C.Port.kMXP, SerialPort.Port.kMXP or SerialPort.Port.kUSB     */
            /* See http://navx-mxp.kauailabs.com/guidance/selecting-an-interface/ for details. */
            ahrs = new AHRS(SPI.Port.kMXP);
        } catch (RuntimeException ex ) {
            DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
        }
		return instance;
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public double getPitch() {
		return ahrs.getPitch();
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

