// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import static frc.robot.Constants.PCM;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Dump extends SubsystemBase {

  private final Solenoid solenoid = new Solenoid(PCM, PneumaticsModuleType.REVPH, 1);

  /** Creates a new Dump. */
  public Dump(){}

  public void querySolenoid() {
		if (solenoid.get()){
      solenoid.set(false);
    } else {
      solenoid.set(true);
    }
    }

}
