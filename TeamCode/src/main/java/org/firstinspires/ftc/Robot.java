package org.firstinspires.ftc.teamcode;


import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Drive.Drive;
import org.firstinspires.ftc.teamcode.Subsystems.Intake.Intake;


@TeleOp(name = "Robot TeleOp")
public class Robot extends LinearOpMode {


    private GamepadEx gamepad;

    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        CommandScheduler.getInstance().reset();

        waitForStart();
        runtime.reset();


        while (opModeIsActive()) {


        }
    }
}

