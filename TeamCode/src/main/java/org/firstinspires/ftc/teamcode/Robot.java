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
import org.firstinspires.ftc.teamcode.Subsystems.Roller.Roller;



@TeleOp(name = "Robot TeleOp")
public class Robot extends LinearOpMode {

    private GamepadEx gamepad;

    private ElapsedTime runtime = new ElapsedTime();

    private Roller roller = new Roller(rollerIO());

    private IntakePivot intakePivot = new IntakePivot(new intakePivotIO());

    private Flywheels flywheels = new Flywheels(new FlywheelsIO());

    


    @Override
    public void runOpMode() {
        CommandScheduler.getInstance().reset();


        switch(Constants.currentMode) {
            case REAL:
                roller = new Roller(RollerIOReal(hardwareMap));
                intakePivot = new intakePivot(new intakePivotIOReal(hardwareMap));
                flywheels = new Flywheels(new FlywheelsIOReal(hardwareMap));
                break;
            case SIM:
                roller = new Roller(RollerIOSim(hardwareMap));
                intakePivot = new intakePivot(new intakePivotIOSim(hardwareMap));

                flywheels = new Flywheels(new FlywheelsIOSim(hardwareMap));
                break;
        }

        roller.SetDefaultCommand(roller.RunNoVolts());
        flywheels.SetDefaultCommand(flywheels.stopFlywheels());
        intakePivot.SetDefaultCommand(intakePivot.HoldIntakePivotPosition());

        waitForStart();
        runtime.reset();


        while (opModeIsActive()) {
            gamepad.getGamepadButton(GamepadKeys.Button.RIGHT_BUMPER).whileActiveContinuous(rollers.RunVolts());
            gamepad.getGamepadButton(GamepadKeys.Button.LEFT_BUMPER).whileActiveContinuous(flywheels.RunVolts());

        }  
    }
}

