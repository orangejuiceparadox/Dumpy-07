// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Dump;

public class DumpBalls extends CommandBase {
	private final Dump dump;
	public DumpBalls(Dump dump) {
		this.dump = dump;
		addRequirements(dump);
	}

	@Override
	public void initialize() {
		dump.querySolenoid();
	}
}