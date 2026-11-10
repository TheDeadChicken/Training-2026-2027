public class FlywheelsIOReal implements FlywheelsIO {
    private DcMotor frontFlywheel;
    private DcMotor backFlywheel;

    FlywheelsIOReal(HardwareMap hardwareMap) {
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

    @Override
    public void RunVolts(double volts) {
        frontFlywheel.setPower(volts);
        backFlywheel.setPower(volts);
    }

}