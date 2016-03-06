package org.usfirst.frc.team5582.rexRobot;

import edu.wpi.first.wpilibj.DriverStation;
import org.usfirst.frc.team5582.rexRobot.subsystems.*;
import org.usfirst.frc.team5582.rexRobot.commands.*;
import edu.wpi.first.wpilibj.buttons.Button;



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
    // GRABBER ARMS STATE
    public enum GrabberArmsState {
		GRABBED("grabbed"), RELEASED("released"), STOP("stop");
		String state;
		
		private GrabberArmsState(String stateIn) {
			this.state = stateIn;
		}
		
		public String toString() {
			return "GrabberArmsState" + this.state;
		}
		
    }

    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public static DriverStation driverStation;
	public static XboxController xboxControllerOne;
	public static XboxController xboxControllerTwo;
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
	public static Button ballGrabClose;
	public static Button ballGrabOpen;
	public static Button ballShoot;
	
	
	public static void init()
	{
		driverStation = DriverStation.getInstance();
		
		// Tank controls
		xboxControllerOne = new XboxController(RobotMap.xboxControllerOne);
		xboxControllerTwo = new XboxController(RobotMap.xboxControllerTwo);
		xboxControllerOne.setDeadZone(0.1);
		xboxControllerTwo.setDeadZone(0.1);
		/** BUTTONS **/
		// BOTTOM LIFT
		// bottomLiftUp = xboxControllerTwo.rt;
		// bottomLiftDown = xboxControllerTwo.lt;
		//TOP LIFT
		topLiftUp = xboxControllerTwo.y;
		topLiftDown = xboxControllerTwo.x;
		// WHEEL ARMS
		// armsDownButton = xboxControllerOne.rb;
		// armsUpButton = xboxControllerOne.lb;
		// WINCH
		winchMotorUpButton = xboxControllerOne.x;
		winchMotorDownButton = xboxControllerOne.a;
		//BALL GRABBER
		ballGrabClose = xboxControllerTwo.lb;
		ballGrabOpen = xboxControllerTwo.rb;
		ballGrabOpen.whenPressed(new BallGrabOpen());
		ballGrabClose.whenPressed(new BallGrabClose());
		ballShoot = xboxControllerTwo.a;
		ballShoot.whenPressed(new ShootBall());
		
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
	// BOTTOM LIFT STATE
	public static BottomLiftState getBottomLiftState(){
		if (bottomLiftUp.get()) {
			return BottomLiftState.UP;
		} else if (bottomLiftDown.get()) {
			return BottomLiftState.DOWN;
		} else {
			return BottomLiftState.STOP;
		}
	}
	// TOP LIFT STATE
	public static TopLiftState getTopLiftState(){
		if (topLiftUp.get()) {
			return TopLiftState.UP;
		} else if (topLiftDown.get()) {
			return TopLiftState.DOWN;
		} else {
			return TopLiftState.STOP;
		}
	}
	// GRABBER ARMS STATE
	public static GrabberArmsState getGrabberArmsState(){
		if (ballGrabClose.get()) {
			return GrabberArmsState.GRABBED;
		} else if (ballGrabOpen.get()){
			return GrabberArmsState.RELEASED;
		} else {
			return GrabberArmsState.STOP;
		}
	}

}