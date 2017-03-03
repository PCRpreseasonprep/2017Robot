package org.usfirst.frc.team2642.robot.commands.auto;

import org.usfirst.frc.team2642.robot.commands.drive.DegreesTurnDrive;
import org.usfirst.frc.team2642.robot.commands.drive.DriveAtPeg;
import org.usfirst.frc.team2642.robot.commands.drive.InchesDrive;
import org.usfirst.frc.team2642.robot.commands.gear.EjectGear;
import org.usfirst.frc.team2642.robot.commands.gear.SetCameraGearVision;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BlueMiddleGear extends CommandGroup {

    public BlueMiddleGear() {
    	/*
    	 * Autonomous mode that places a gear on the center peg and drives toward the boiler to shoot
    	 * 
    	 * Procedure:
    	 * 1.Change vision to dark mode and drive toward gear peg
    	 * 2.Enable autonomous gear tracking
    	 * 3.Place the gear and back up
    	 * 4.Turn and drive toward boiler
    	 * 5.Aim the turret at the boiler and shoot
    	 */
    	addSequential(new SetCameraGearVision(true));
    	addSequential(new InchesDrive(-36.0));
    	addSequential(new DriveAtPeg(5.0));
    	addSequential(new InchesDrive(-16.0));
    	addSequential(new EjectGear());
    	addSequential(new Wait(0.5));
    	addSequential(new InchesDrive(30.0));
    	addSequential(new DegreesTurnDrive(80.0));
    	addSequential(new InchesDrive(96.0));
    	addSequential(new DegreesTurnDrive(-40.0));
    	addSequential(new InchesDrive(24.0));
    	addSequential(new AimAndShoot());
    	addSequential(new SetCameraGearVision(false));
    }
}
