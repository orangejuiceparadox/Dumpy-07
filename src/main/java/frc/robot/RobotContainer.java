// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import static frc.robot.Constants.BUTTON_A;
import static frc.robot.Constants.BUTTON_B;
import static frc.robot.Constants.BUTTON_LB;
import static frc.robot.Constants.BUTTON_RB;
import static frc.robot.Constants.BUTTON_X;
import static frc.robot.Constants.BUTTON_Y;
import static frc.robot.Constants.CONTROLLER_ID;
import static frc.robot.Constants.DUMP;

import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ShiftGear;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Dump;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems
  private final Drive drive = new Drive();
  private final Dump dump = new Dump();
  private final Intake intake = new Intake();
  private final Shooter shooter = new Shooter();

  // Commands
  private final ShiftGear shiftGear = new ShiftGear(drive);
  private final IntakeBalls intakeBalls = new ShiftGear(intake);
  private final DumpBalls dumpBalls = new ShiftGear(dump);
  private final Shoot shoot = new ShiftGear(shooter);

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final XboxController xboxController =
      new XboxController(CONTROLLER_ID);
  private final JoystickButton gearShiftButton = new JoystickButton(xboxController, BUTTON_B);
  private final JoystickButton intakeButton = new JoystickButton(xboxController, BUTTON_A);
  private final JoystickButton dumpButton = new JoystickButton(xboxController, BUTTON_Y);
  private final JoystickButton shootButton = new JoystickButton(xboxController, BUTTON_X);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */

  private void configureBindings() {
    gearShiftButton.toggleWhenPressed(shiftGear);
    intakeButton.toggleWhenPressed(intakeBalls);
    dumpButton.toggleWhenPressed(dumpBalls);
    shootButton.toggleWhenPressed(shoot);
  }
}
