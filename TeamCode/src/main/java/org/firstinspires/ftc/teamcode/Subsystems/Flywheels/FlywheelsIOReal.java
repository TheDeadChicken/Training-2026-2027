public class FlywheelsIOReal implements FlywheelsIO {
    private DcMotor frontFlywheel;
    private DcMotor backFlywheel;

    FlywheelsIOReal(HardwareMap hardwareMap) {
        // Reorder so that the directions and maps are together with 1 enter betwean them
        frontFlywheel = hardwareMap.get(DcMotor.class, frontFlywheelID);
        frontFlywheel.setDirection(DcMotor.Direction.FORWARD);
        backFlywheel = hardwareMap.get(DcMotor.class, backFlywheelID);
        backFlywheel.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override 
    public void UpdateInputs(FlywheelsIOInputs inputs) {
        inputs.frontVolts = frontFlywheel.getPower();
        inputs.backVolts = backFlywheel.getPower();
    }

    // If your passing two voltages into the RunVolts command, you need to have two input fields like you did in sim
    @Override
    public void RunVolts(double volts) {
        frontFlywheel.setPower(volts);
        backFlywheel.setPower(volts);
    }

}