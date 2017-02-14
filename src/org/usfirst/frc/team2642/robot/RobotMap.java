package org.usfirst.frc.team2642.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//PWM
	//RobotDrive
	public static int frontLeft = 2;
	public static int rearLeft = 0;
	public static int frontRight = 1;
	public static int rearRight = 3;
	//Shooter
	public static int flywheel = 6;
	public static int shooterControl = 7;
	public static int shooterRotate;
	//Other
	public static int intake = 4;
	public static int gearEjector = 5;

	//Analog
	public static int gearUltra = 3;
	public static int turretPot = 0;
	
	//Relay
	
	// USB
	//Cameras
	public static int cameraBoiler = 0;
	public static int cameraGear = 1;
	
	//DIO
	//Encoders
	public static int lEncoder1 = 0;
	public static int lEncoder2 = 1;
	public static int rEncoder1 = 2;
	public static int rEncoder2 = 3;
	public static int gearEncoder1 = 4;
	public static int gearEncoder2 = 5;
	//Other
	
	//PID
	//Drive
	public static double driveP = 1.0;
	public static double driveI = 0.0;
	public static double driveD = 0.0;
	//Turret
	public static double turretP = 0.0;
	public static double turretI = 0.0;
	public static double turretD = 0.0;
	//Gear
	public static double gearP = 0.0;
	public static double gearI = 0.0;
	public static double gearD = 0.0;

	//Variables
	//Drive
	public static double driveForwardOffset = 0.5;
	public static double driveTurnOffset = 0.5;
	public static double driveCorrection = 0.2;
	//Gear
	public static double gearTwoRev = 100;
	public static double gearOffset = 0.1;
	//Image resoulution constants
	public static final int IMG_WIDTH = 320;
	public static final int IMG_HEIGHT = 240;
	//Turret Potentiometer Limits
	public static double turretUpper = 0.8;
	public static double turretLower = 0.2;
	
	
	
}



