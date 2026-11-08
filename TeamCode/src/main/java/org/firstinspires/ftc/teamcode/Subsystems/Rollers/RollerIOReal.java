package org.firstinspires.ftc.teamcode.Subsystems.Rollers;

public class RollerIOReal implements RollerIO{
    private DcMotor roller;
    
    RollerIOReal(HardwareMap hardwareMap) {
        roller = hardwareMap.get(DcMotor.class, rollerID);
        roller.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override 
    public void UpdateInputs(RollerIOInputs inputs) {
        inputs.volts = roller.getPower();
    }

    @Override
    public void RunVolts(double volts) {
        rollers.setPower(volts);
    }


}


