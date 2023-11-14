package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.SwerveSubsystem;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;
  private RobotContainer m_robotContainer;
  private SwerveSubsystem swerveDrive;
  private CommandXboxController xboxController;

  //Telemtry

  // private final AddressableLED m_led = RobotMap.led;
  // private final AddressableLEDBuffer m_ledBuffer = RobotMap.ledBuffer;

  @Override
  public void robotInit() {
    m_robotContainer = new RobotContainer();
    swerveDrive = new SwerveSubsystem();
    xboxController = new CommandXboxController(0); // Controller is on port 0
  }

  @Override
  public void robotPeriodic() {
    // LEDSubsystem.rainbow();
    // m_led.setData(m_ledBuffer);

    double xSpeed = xboxController.getLeftX();
    double ySpeed = -xboxController.getLeftY();
    double rotate = xboxController.getRightX();

    swerveDrive.drive(xSpeed, ySpeed, rotate);
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  @Override
  public void autonomousInit() {
     m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }

  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {

    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {
    
  }

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {
  }

  @Override
  public void simulationInit() {
  }

  @Override
  public void simulationPeriodic() {
  }
}
