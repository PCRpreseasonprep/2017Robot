package org.usfirst.frc.team2642.robot.commands.auto;

import org.usfirst.frc.team2642.robot.commands.drive.DegreesTurnDrive;
import org.usfirst.frc.team2642.robot.commands.drive.DriveAtPeg;
import org.usfirst.frc.team2642.robot.commands.drive.InchesDrive;
import org.usfirst.frc.team2642.robot.commands.gear.EjectGear;
import org.usfirst.frc.team2642.robot.commands.gear.SetCameraGearVision;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GearAuto extends CommandGroup {

    public GearAuto() {
    	addSequential(new SetCameraGearVision(true));
    	addSequential(new InchesDrive(-70));
    	addSequential(new DegreesTurnDrive(55));
    	addSequential(new DriveAtPeg(5.0));
    	addSequential(new InchesDrive(-16.0));
    	addSequential(new EjectGear());
    	//addSequential(new SetCameraGearVision(false));
    }
}