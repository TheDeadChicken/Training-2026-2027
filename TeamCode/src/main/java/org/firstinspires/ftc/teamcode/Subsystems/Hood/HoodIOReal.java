public class HoodIOReal implements HoodIO {
    private Servo hoodMotor;

    HoodIOReal(HardwareMap hardwareMap) {
        hoodMotor = hardware.get(Servo.class, "hoodServo");
        hoodMotor.setPosition(startHoodPosition);
    }

    @Override
    public void UpdateInputs(HoodIOInputs inputs) {
        inputs.hoodPosition = hoodMotor.getPosition();
    }

    @Override
    public void SetHoodPosition(double position) {
        hoodMotor.setPosition(position);
    }

}
