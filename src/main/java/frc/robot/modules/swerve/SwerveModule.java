package frc.robot.modules.swerve;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class SwerveModule {
    private CANSparkMax driveMotor;
    private CANSparkMax turnMotor; //does thing

    public SwerveModule(int driveMotorId, int turnMotorId) {
        driveMotor = new CANSparkMax(driveMotorId, MotorType.kBrushless);
        turnMotor = new CANSparkMax(turnMotorId, MotorType.kBrushless);
    }

    public void drive(double speed, double rotation) {
        driveMotor.set(speed);
        // As you don't have encoders, the rotation control of the module is limited.
        // Normally, you would use feedback from an encoder to control the rotation precisely.
        turnMotor.set(rotation);
    }
}