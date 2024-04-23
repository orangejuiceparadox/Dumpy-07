// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */

 public class Constants {
  //Controller
  public static final int CONTROLLER_ID = 0;
	public static final int BUTTON_A = 1, BUTTON_B = 2, BUTTON_X = 3, BUTTON_Y = 4;
	public static final int BUTTON_LB = 5, BUTTON_RB = 6;

  //PCM
  public static final int PCM = 40;

  //Drive
  public static final int LEFT_LEADER = 1, LEFT_FOLLOWER = 2;
  public static final int RIGHT_LEADER = 3, RIGHT_FOLLOWER = 4;

  //Gear Shift
  public static final int GEARSHIFT = 30;

  //Intake
  public static final int LEFT_INTAKE = 5, RIGHT_INTAKE = 6;
  
  //Dump
  public static final int DUMP = 7;

  //Shooter
  public static final int LEFT_SHOOTER = 8;
  public static final int RIGHT_SHOOTER = 9;

  //XBOX Controller
  public static final int K_DRIVER_CONTROLLER_PORT = 0;
}
