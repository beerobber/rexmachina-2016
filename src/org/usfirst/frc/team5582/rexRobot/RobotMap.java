package org.usfirst.frc.team5582.rexRobot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    public static int leftMotorCANA = 3;
    public static int leftMotorCANB = 4;
    public static int rightMotorCANA = 1;
    public static int rightMotorCANB = 2;
    public static int wheelArms = 0;
    public static int bottomLiftMotorA = 6;
    public static int bottomLiftMotorB = 7;
    public static int topLiftMotor = 8;
    public static int winch = 5;
    public static int grabberSolenoid = 0;
    public static int liftSolenoid = 1;
    public static int shooterSolenoid = 3;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
    
    public static int ultrasonicSensorChannel = 3;
}
