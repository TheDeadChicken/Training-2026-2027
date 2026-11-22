public class FlywheelsIOReal implements FlywheelsIO {
    private DcMotor frontFlywheel;
    private DcMotor backFlywheel;

    FlywheelsIOReal(HardwareMap hardwareMap) {
        // Reorder so that the directions and maps are together with 1 enter betwean them
        frontFlywheel = hardwareMap.get(DcMotor.class, frontFlywheelID);
        backFlywheel = hardwareMap.get(DcMotor.class, backFlywheelID);
    
        frontFlywheel.setDirection(DcMotor.Direction.FORWARD);
        backFlywheel.setDirection(DcMotor.Direction.FORWARD);
        
    }

    @Override 
    public void UpdateInputs(FlywheelsIOInputs inputs) {
        inputs.frontVolts = frontFlywheel.getPower();
        inputs.backVolts = backFlywheel.getPower();
    }

    @Override
    public void RunVolts(double frontVolts, double backVolts) {
        frontFlywheel.setPower(frontVolts);
        backFlywheel.setPower(backVolts);
    }

}