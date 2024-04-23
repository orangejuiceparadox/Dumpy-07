// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.LEFT_INTAKE;
import static frc.robot.Constants.RIGHT_INTAKE;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

  public static final TalonFX leftIntake = new TalonFX(LEFT_INTAKE);
  public static final TalonFX rightIntake = new TalonFX(RIGHT_INTAKE);

  /** Creates a new Intake. */
  public Intake() {}

  public static void setSpeed(double speed){
    leftIntake.set(TalonFXControlMode.Velocity, speed);
    rightIntake.set(TalonFXControlMode.Velocity, -speed);
  }

 
}
