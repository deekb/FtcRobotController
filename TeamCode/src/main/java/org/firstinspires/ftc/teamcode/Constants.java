package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Constants {
    public static class HardwareConstants {

        public static class MotorConstants {
            public static final String frontLeftMotorPort = "frontLeft";
            public static final String frontRightMotorPort = "frontRight";
            public static final String rearLeftMotorPort = "rearLeft";
            public static final String rearRightMotorPort = "rearRight";
            public static final DcMotorSimple.Direction frontLeftMotorDirection = DcMotorSimple.Direction.FORWARD;
            public static final DcMotorSimple.Direction frontRightMotorDirection = DcMotorSimple.Direction.REVERSE;
            public static final DcMotorSimple.Direction rearLeftMotorDirection = DcMotorSimple.Direction.REVERSE;
            public static final DcMotorSimple.Direction rearRightMotorDirection = DcMotorSimple.Direction.FORWARD;

        }

        public static class WheelConstants {
            public static final double frontLeftWheelDirection = Math.toRadians(0);
            public static final double frontRightWheelDirection = Math.toRadians(0);
            public static final double rearLeftWheelDirection = Math.toRadians(0);
            public static final double rearRightWheelDirection = Math.toRadians(0);
        }

    }

    public static class OperatorConstants {
        public static final double minimum_power = 0.25;
        public static final double maximum_power = 1;
    }

}
