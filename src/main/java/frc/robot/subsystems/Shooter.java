// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.LEFT_SHOOTER;
import static frc.robot.Constants.RIGHT_SHOOTER;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

  public static final TalonFX leftShooter = new TalonFX(LEFT_SHOOTER);
  public static final TalonFX rightShooter = new TalonFX(RIGHT_SHOOTER);

  /** Creates a new Shooter. */
  public Shooter() {}

  public static void setSpeed(double speed){
    leftShooter.set(TalonFXControlMode.Velocity, speed);
    rightShooter.set(TalonFXControlMode.Velocity, -speed);
  }

 
}
