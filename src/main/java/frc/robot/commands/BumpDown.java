// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift;

public class BumpDown extends CommandBase {
  private Lift m_subsystem;

  public BumpDown(Lift subsystem) {
    m_subsystem = subsystem;

    addRequirements(m_subsystem);
  }

  @Override
  public void initialize() {
    m_subsystem.decramentSetPoint();
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return m_subsystem.isAtSetPoint();
  }
}
