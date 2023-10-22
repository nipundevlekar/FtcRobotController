package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// DO NOT USE, Tank Drive & No Comments.

@TeleOp(name="DcMotor Test", group="OpMode")
public class motorTest extends LinearOpMode {
    private DcMotor fl_drive = null;
    private DcMotor fr_drive = null;
    private DcMotor bl_drive = null;
    private DcMotor br_drive = null;

    @Override
    public void runOpMode() {
        fl_drive  = hardwareMap.get(DcMotor.class, "fl_drive");
        bl_drive  = hardwareMap.get(DcMotor.class, "bl_drive");
        fr_drive = hardwareMap.get(DcMotor.class, "fr_drive");
        br_drive = hardwareMap.get(DcMotor.class, "br_drive");

        fl_drive.setDirection(DcMotor.Direction.REVERSE);
        bl_drive.setDirection(DcMotor.Direction.REVERSE);
        fr_drive.setDirection(DcMotor.Direction.FORWARD);
        br_drive.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();

        while (opModeIsActive()) {
            double leftPower;
            double rightPower;

            leftPower  = -gamepad1.left_stick_y;
            rightPower = -gamepad1.right_stick_y;

            // Send calculated power to wheels
            fl_drive.setPower(leftPower);
            bl_drive.setPower(leftPower);
            fr_drive.setPower(rightPower);
            br_drive.setPower(rightPower);
        }
    }
}
