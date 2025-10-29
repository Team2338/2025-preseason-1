// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class DriveTrain extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    private WPI_TalonSRX leftCIM;
    private WPI_TalonSRX rightCIM;

    private DifferentialDrive drive;
    public DriveTrain() {
       leftCIM = new WPI_TalonSRX(RobotMap.LEFT_CIM_ID);
       rightCIM = new WPI_TalonSRX(RobotMap.RIGHT_CIM_ID);

        leftCIM.configFactoryDefault();
        rightCIM.configFactoryDefault();

        leftCIM.setNeutralMode(NeutralMode.Brake);
        rightCIM.setNeutralMode(NeutralMode.Brake);


        drive = new DifferentialDrive(leftCIM, rightCIM);
    }
    public void driveArcade(double speed, double rotation) {drive.arcadeDrive(speed, rotation);}
    }

