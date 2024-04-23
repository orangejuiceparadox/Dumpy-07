// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {
	private final Shooter shooter;
	public Shoot(Shooter shooter) {
		this.shooter = shooter;
		addRequirements(shooter);
	}

	@Override
	public void initialize() {
		shooter.setSpeed(1);
	}
}