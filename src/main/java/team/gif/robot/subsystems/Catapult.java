// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Catapult extends SubsystemBase {
    private TalonSRX catapult;
    private final double catapultLow = 102.67;
    private final double catapultHigh = 410.67;
    /** Creates a new ExampleSubsystem. */
    public Catapult() {
catapult = new TalonSRX(RobotMap.CATAPULT_ID);
catapult.configFactoryDefault();
catapult.setNeutralMode(NeutralMode.Brake);
catapult.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
catapult.setSelectedSensorPosition(0);
catapult.setSensorPhase(true);
catapult.configForwardSoftLimitThreshold(catapultLow);
catapult.configReverseSoftLimitThreshold(catapultHigh);
catapult.configForwardSoftLimitEnable(true);
catapult.configReverseSoftLimitEnable(true);
    }
public void turnMotor(double percentoutput){
        catapult.set(TalonSRXControlMode.PercentOutput, percentoutput);
}
public void zeroEncoder(){
        catapult.setSelectedSensorPosition(0);
}
}
