public class IntakePivotIOReal implements IntakePivotIO {
    //rename to please intakePivotMotor
    private Servo intakeMotor;

    IntakePivotIOReal(HardwareMap hardwareMap) {
        intakeMotor = hardware.get(Servo.class, "intakeServo");
        intakeMotor.setPosition(highPivotPosition);
    }

    @Override
    public void UpdateInputs(IntakePivotIOInputs inputs) {
        inputs.pivotPosition = intakeMotor.getPosition();
    }

    @Override
    public void SetPivotPosition(double position) {
        intakeMotor.setPosition(position);
    }

}
