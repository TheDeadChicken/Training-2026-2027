public class RollersIOReal implements RollersIO{
    private DcMotor roller;
    RollersIOReal(HardwareMap hardwareMap) {
        roller.hardwareMap.get(DcMotor.class, rollerID);
        roller.setDirection(DcMotor.Direction.Forward);
    }
    @Override 
    public void RunVolts(double volts){
        roller.setPower(volts);

    }
}
