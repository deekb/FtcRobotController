package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;

final class MecanumDrivetrain {

    DcMotor frontLeftMotor, frontRightMotor, rearLeftMotor, rearRightMotor;

    public MecanumDrivetrain() {
        frontLeftMotor = hardwareMap.dcMotor.get(Constants.HardwareConstants.MotorConstants.frontLeftMotorPort);
        frontRightMotor = hardwareMap.dcMotor.get(Constants.HardwareConstants.MotorConstants.frontRightMotorPort);
        rearLeftMotor = hardwareMap.dcMotor.get(Constants.HardwareConstants.MotorConstants.rearLeftMotorPort);
        rearRightMotor = hardwareMap.dcMotor.get(Constants.HardwareConstants.MotorConstants.rearRightMotorPort);

        frontLeftMotor.setDirection(Constants.HardwareConstants.MotorConstants.frontLeftMotorDirection);
        frontRightMotor.setDirection(Constants.HardwareConstants.MotorConstants.frontRightMotorDirection);
        rearLeftMotor.setDirection(Constants.HardwareConstants.MotorConstants.rearLeftMotorDirection);
        rearRightMotor.setDirection(Constants.HardwareConstants.MotorConstants.rearRightMotorDirection);

    }

    public void set_speeds(double direction, double speed, double spin) {

        double frontLeftPower = calculate_wheel_power(Constants.HardwareConstants.WheelConstants.frontLeftWheelDirection, direction, speed);
        double frontRightPower = calculate_wheel_power(Constants.HardwareConstants.WheelConstants.frontRightWheelDirection, direction, speed);
        double rearLeftPower = calculate_wheel_power(Constants.HardwareConstants.WheelConstants.rearLeftWheelDirection, direction, speed);
        double rearRightPower = calculate_wheel_power(Constants.HardwareConstants.WheelConstants.rearRightWheelDirection, direction, speed);

        frontLeftMotor.setPower(frontLeftPower + spin);
        rearLeftMotor.setPower(frontRightPower + spin);
        frontRightMotor.setPower(rearLeftPower - spin);
        rearRightMotor.setPower(rearRightPower - spin);
    }

    public void stop() {
        set_speeds(0, 0, 0);
    }

    private double calculate_wheel_power(double wheel_direction, double target_direction, double target_speed) {
        return target_speed * Math.cos(wheel_direction - target_direction);
    }
}
