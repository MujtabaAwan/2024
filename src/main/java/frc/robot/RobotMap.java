package frc.robot;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.SPI;

public class RobotMap {
        // Spark MAXs

        // Front Left Motors
        public static final CANSparkMax frontLeftDriveMotor = new CANSparkMax(
                        Constants.DriveConstants.kFrontLeftDriveMotorCanId,
                        MotorType.kBrushless);
        public static final CANSparkMax frontLeftTurnMotor = new CANSparkMax(
                        Constants.DriveConstants.kFrontLeftTurnMotorCanId,
                        MotorType.kBrushless);

        // Front Right Motors
        public static final CANSparkMax frontRightDriveMotor = new CANSparkMax(
                        Constants.DriveConstants.kFrontRightDriveMotorCanId,
                        MotorType.kBrushless);
        public static final CANSparkMax frontRightTurnMotor = new CANSparkMax(
                        Constants.DriveConstants.kFrontRightTurnMotorCanId,
                        MotorType.kBrushless);

        // Rear Left Motors
        public static final CANSparkMax rearLeftDriveMotor = new CANSparkMax(
                        Constants.DriveConstants.kRearLeftDriveMotorCanId,
                        MotorType.kBrushless);
        public static final CANSparkMax rearLeftTurnMotor = new CANSparkMax(
                        Constants.DriveConstants.kRearLeftTurnMotorCanId,
                        MotorType.kBrushless);

        // Rear Right Motors
        public static final CANSparkMax rearRightDriveMotor = new CANSparkMax(
                        Constants.DriveConstants.kRearRightDriveMotorCanId,
                        MotorType.kBrushless);
        public static final CANSparkMax rearRightTurnMotor = new CANSparkMax(
                        Constants.DriveConstants.kRearRightTurnMotorCanId,
                        MotorType.kBrushless);

        // LED Strips
        public static final AddressableLED led = new AddressableLED(Constants.LEDStripConstants.kLEDStripPWMPort);
        public static final AddressableLEDBuffer ledBuffer = new AddressableLEDBuffer(
                        Constants.LEDStripConstants.kLEDStripCount);

        // Gyro
        public static final AHRS gyro = new AHRS(SPI.Port.kMXP);
}
