package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "TestAutonomous")
public class TestAutonomous extends OpMode {

    DcMotor frontLeftMotor;

    @Override
    public void init() {

        frontLeftMotor = hardwareMap.dcMotor.get("frontleft");

    }

    @Override
    public void loop() {

        frontLeftMotor.setPower(0.25);

    }
}
