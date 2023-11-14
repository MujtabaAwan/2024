package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.modules.swerve.SwerveModule;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveSubsystem extends SubsystemBase {
    private SwerveModule frontLeft, frontRight, rearLeft, rearRight;

    public SwerveSubsystem() {
        frontLeft = new SwerveModule(Constants.DriveConstants.kFrontLeftDriveMotorCanId, Constants.DriveConstants.kFrontLeftTurnMotorCanId);
        frontRight = new SwerveModule(Constants.DriveConstants.kFrontRightDriveMotorCanId, Constants.DriveConstants.kFrontRightTurnMotorCanId);
        rearLeft = new SwerveModule(Constants.DriveConstants.kRearLeftDriveMotorCanId, Constants.DriveConstants.kRearLeftTurnMotorCanId);
        rearRight = new SwerveModule(Constants.DriveConstants.kRearRightDriveMotorCanId, Constants.DriveConstants.kRearRightTurnMotorCanId);
    }

    public void drive(double xSpeed, double ySpeed, double rotate) {
        frontLeft.drive(xSpeed, rotate);
        frontRight.drive(xSpeed, rotate);
        rearLeft.drive(xSpeed, rotate);
        rearRight.drive(xSpeed, rotate);
    }
}