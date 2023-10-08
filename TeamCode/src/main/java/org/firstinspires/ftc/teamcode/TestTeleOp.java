package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


@TeleOp(name = "TestTeleOp")
public class TestTeleOp extends OpMode {

    MecanumDrivetrain drivetrain = new MecanumDrivetrain();

    @Override
    public void init() {
        drivetrain.stop();
    }

    @Override
    public void loop() {
        double left_stick_x = gamepad1.left_stick_x;
        double left_stick_y = gamepad1.left_stick_y;
        double rightStick_x = gamepad1.right_stick_x;

        double direction = Math.atan2(left_stick_y, left_stick_x);

        double speed = Math.hypot(left_stick_x, left_stick_y);

        speed *= Constants.OperatorConstants.minimum_power * (1 - speed) + Constants.OperatorConstants.maximum_power * speed;

        drivetrain.set_speeds(direction, speed, rightStick_x);
    }
}
