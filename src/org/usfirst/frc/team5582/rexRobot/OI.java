package org.usfirst.frc.team5582.rexRobot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
// import org.usfirst.frc.team5582.rexRobot.commands.ErikFollowObject;
import edu.wpi.first.wpilibj.DriverStation;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    
	// WHEEL ARMS STATE
    public enum WheelArmsState {
    		DOWN("down"), UP("up"), STOP("stop");
    		String state;
    		
    		private WheelArmsState(String stateIn) {
    			this.state = stateIn;
    		}
    		public String toString() {
    			return "WheelArmsState" + this.state;
    		}
    }
    // WINCH STATE
    public enum WinchState {
		DOWN("down"), UP("up"), STOP("stop");
		String state;
		
		private WinchState(String stateIn) {
			this.state = stateIn;
		}
		public String toString() {
			return "WinchState" + this.state;
		}
}
    // BALL ARMS STATE
    public enum BallArmsState {
		DOWN("down"), UP("up"), STOP("stop");
		String state;
		
		private BallArmsState(String stateIn) {
			this.state = stateIn;
		}
		
		public String toString() {
			return "Ball Arm State" + this.state;
		}
}
    // BOTTOM LIFT STATE
    public enum BottomLiftState {
		DOWN("down"), UP("up"), STOP("stop");
		String state;
		
		private BottomLiftState(String stateIn) {
			this.state = stateIn;
		}
		public String toString() {
			return "BottomLiftState" + this.state;
		}
    }
    // TOP LIFT STATE
    public enum TopLiftState {
		DOWN("down"), UP("up"), STOP("stop");
		String state;
		
		private TopLiftState(String stateIn) {
			this.state = stateIn;
		}
		
		public String toString() {
			return "TopLiftState" + this.state;
		}
    }
    // BALL SPINNER STATE
    public enum BallSpinnerState {
 		OUT("out"), IN("in"), STOP("stop");
 		String state;
 		
 		private BallSpinnerState(String stateIn) {
 			this.state = stateIn;
 		}
 		
 		public String toString() {
 			return "BallLiftState" + this.state;
 		}
     }
    // TURBO STATE
    public enum TurboState {
 		PRESSED("pressed"), NOTPRESSED("Not pressed");
 		String state;
 		
 		private TurboState(String stateIn) {
 			this.state = stateIn;
 		}
 		
 		public String toString() {
 			return "TurboState" + this.state;
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
	//top lift
	public static Button topLiftUp;
	public static Button topLiftDown;
	// winch motor
	public static Button winchMotorUpButton;
	public static Button winchMotorDownButton;
	// Ball Arm Buttons
	public static Button ballArmIn;
	public static Button ballArmOut;
	//ball spinner
	public static Button ballSpinnerOut;
	public static Button ballSpinnerIn;
	// Turbo Drive
	public static Button turboDrive;
	
	
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
		// followButton = new JoystickButton(arcadeStick, 6);
		// followButton.whileHeld(new ErikFollowObject());
		// Bottom Lift Buttons
		bottomLiftUp = new JoystickButton(arcadeStick, 6);
		bottomLiftDown = new JoystickButton(arcadeStick, 7);
		//Top Lift Buttons
		topLiftUp = new JoystickButton(arcadeStick, 8);
		topLiftDown = new JoystickButton(arcadeStick, 9);
		// WHEEL ARMS
		armsDownButton = new JoystickButton(arcadeStick, 2);
		armsUpButton = new JoystickButton(arcadeStick, 3);
		// WINCH Buttons
		winchMotorUpButton = new JoystickButton(arcadeStick, 10);
		winchMotorDownButton = new JoystickButton(arcadeStick, 11);
		//BALL ARM Buttons
		ballArmIn = new JoystickButton(arcadeStick, 8);
		ballArmOut = new JoystickButton(arcadeStick, 9);
		//Ball Spinner Buttons
		ballSpinnerIn = new JoystickButton(arcadeStick, 4);
		ballSpinnerOut = new JoystickButton(arcadeStick, 5);
		// TURBO DRIVE
		turboDrive = new JoystickButton(arcadeStick, 1);
			
	}	
	// WHEEL ARMS STATE
	public static WheelArmsState getWheelArmsState() {
		if (armsDownButton.get()) {
			return WheelArmsState.DOWN;
		} else if (armsUpButton.get()) {
			return WheelArmsState.UP;
		} else {
			return WheelArmsState.STOP;
		}
	}
	// WINCH STATE
	public static WinchState getWinchState() {
		if (winchMotorDownButton.get()) {
			return WinchState.DOWN;
		} else if (winchMotorUpButton.get()) {
			return WinchState.UP;
		} else {
			return WinchState.STOP;
		}
	}
	// BALL ARMS STATE
	public static BallArmsState getBallArmsState() {
		if (ballArmIn.get()) {
			return BallArmsState.DOWN;
		} else if (ballArmOut.get()) {
			return BallArmsState.UP;
		} else {
			return BallArmsState.STOP;
		}
	}
	// BOTTOM LIFT STATE
	public static BottomLiftState getBottomLiftState(){
		if (bottomLiftUp.get()) {
			return BottomLiftState.UP;
		}
		else if (bottomLiftDown.get()) {
			return BottomLiftState.DOWN;
		}
		else {
			return BottomLiftState.STOP;
		}
	}
	// TOP LIFT STATE
	public static TopLiftState getTopLiftState(){
		if (topLiftUp.get()) {
			return TopLiftState.UP;
		}
		else if (topLiftDown.get()) {
			return TopLiftState.DOWN;
		}
		else {
			return TopLiftState.STOP;
		}
	}
	// BALL SPINNER STATE
	public static BallSpinnerState getBallSpinnerState(){
		if (ballSpinnerOut.get()) {
			return BallSpinnerState.OUT;
		}
		else if (ballSpinnerIn.get()) {
			return BallSpinnerState.IN;
		}
		else {
			return BallSpinnerState.STOP;
		}
	}
	// TURBO STATE
		public static TurboState getTurboState(){
			if (turboDrive.get()) {
				return TurboState.PRESSED;
			} else {
				return TurboState.NOTPRESSED;
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