package org.firstinspires.ftc.teamcode.Subsystems.Rollers;

public class RollerIOReal implements RollerIO{
    private DcMotor leftRoller;
    private DcMotor rightRoller;
    
    RollerIOReal(HardwareMap hardwareMap) {
        leftRoller = hardwareMap.get(DcMotor.class, leftRollerID);
        rightRoller = hardwareMap.get(DcMotor.class, rightRollerID);

        leftRoller.setDirection(DcMotor.Direction.FORWARD);
        rightRoller.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override 
    public void UpdateInputs(RollerIOInputs inputs) {
        inputs.leftVolts = leftRoller.getPower();
        inputs.rightVolts = rightRoller.getPower();
    }

    @Override
    public void RunVolts(double volts) {
        leftRoller.setPower(volts);
        rightRoller.setPower(volts);
    }


}


