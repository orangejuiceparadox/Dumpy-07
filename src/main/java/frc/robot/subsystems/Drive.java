// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import static frc.robot.Constants.LEFT_LEADER;
import static frc.robot.Constants.LEFT_FOLLOWER;
import static frc.robot.Constants.RIGHT_LEADER;
import static frc.robot.Constants.RIGHT_FOLLOWER;
import static frc.robot.Constants.PCM;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.Command;it 
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

  private final CANSparkMax leftLeader = new CANSparkMax(leftLeader, MotorType.kBrushless);
  private final CANSparkMax leftFollower = new CANSparkMax(leftFollower, MotorType.kBrushless);
  private final CANSparkMax rightLeader = new CANSparkMax(rightLeader, MotorType.kBrushless);
  private final CANSparkMax rightFollower = new CANSparkMax(rightFollower, MotorType.kBrushless);
 
  private final Solenoid gearPiston = new Solenoid(PCM, PneumaticsModuleType.REVPH, 0);

  /** Creates a new Drive. */
  public Drive(){}

  public void shiftGear() {
		if (gearPiston.get()){
      gearPiston.set(false);
    } else {
      gearPiston.set(true);
    }
	}

}
