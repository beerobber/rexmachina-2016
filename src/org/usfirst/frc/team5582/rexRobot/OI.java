package org.usfirst.frc.team5582.rexRobot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team5582.rexRobot.commands.ErikFollowObject;
import edu.wpi.first.wpilibj.DriverStation;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
     //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    public enum WheelArmState {
    		DOWN("down"), UP("up"), STOP("stop");
    		String state;
    		
    		private WheelArmState(String stateIn) {
    			this.state = stateIn;
    		}
    		
    		public String toString() {
    			return "WheelArmState" + this.state;
    		}
    }
    
    public enum WinchState {
		DOWN("down"), UP("up"), STOP("stop");
		String state;
		
		private WinchState(String stateIn) {
			this.state = stateIn;
		}
		
		public String toString() {
			return "WheelArmState" + this.state;
		}
		
	 public enum SpinnerState {
				DOWN("out"), UP("in"), STOP("stop");
				String state;
				
				private SpinnerState(String stateIn) {
					this.state = stateIn;
				}
				
				public String toString() {
					return "SpinnerState" + this.state;
				}
}
    
	
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public static DriverStation driverStation;
	public static Joystick tankLeftStick;
	public static Joystick tankRightStick;
	public static Joystick arcadeStick;
	public static Button followButton;
	// wheel arms
	public static Button armsDownButton;
	public static Button armsUpButton;
	// bottom lift
	public static Button bottomLiftUp;
	public static Button bottomLiftDown;
	// winch motor
	public static Button winchMotorUpButton;
	public static Button winchMotorDownButton;
	// button spinners
	public static Button buttonSpinIn;
	public static Button buttonSpinOut;
	
	public static void init()
	{
		driverStation = DriverStation.getInstance();
		
		// Tank controls
		tankLeftStick = new Joystick(0);
		tankRightStick = new Joystick(1);
		// Just a convenience reference
		arcadeStick = tankLeftStick;
		// FOLLOW OBJECT
		// Ultrasonic follow buttons
		followButton = new JoystickButton(arcadeStick, 6);
		followButton.whileHeld(new ErikFollowObject());
		// WHEEL ARMS
		// buttons control snowblower motor using CANTalon at 75% power
		armsDownButton = new JoystickButton(arcadeStick, 2);
		armsUpButton = new JoystickButton(arcadeStick, 3);
		// WINCH Buttons
		winchMotorUpButton = new JoystickButton(arcadeStick, 10);
		winchMotorDownButton = new JoystickButton(arcadeStick, 11);
		// BALL Spinner buttons
		buttonSpinIn = new JoystickButton(arcadeStick, 8); 
		buttonSpinOut = new JoystickButton(arcadeStick, 9);
		
		
		
			
	}
	
	public static WheelArmState getWheelArmState() {
		if (armsDownButton.get()) {
			return WheelArmState.DOWN;
		} else if (armsUpButton.get()) {
			return WheelArmState.UP;
		} else {
			return WheelArmState.STOP;
		}
	}
	
	public static WinchState getWinchState() {
		if (winchMotorDownButton.get()) {
			return WinchState.DOWN;
		} else if (winchMotorUpButton.get()) {
			return WinchState.UP;
		} else {
			return WinchState.STOP;
		}
	}
	
	public static SpinnerState getSpinnerState() {
		if (buttonSpinOut.get()) {
			return SpinnerState.DOWN;
		} else if (buttonSpinIn.get()) {
			return SpinnerState.UP;
		} else {
			return SpinnerState.STOP;
		}
	}


    public static double getArcadeJoystickX()
    {
      return arcadeStick.getX();
    }

    public static double getArcadeJoystickY()
    {
      return arcadeStick.getY();
    }
}
