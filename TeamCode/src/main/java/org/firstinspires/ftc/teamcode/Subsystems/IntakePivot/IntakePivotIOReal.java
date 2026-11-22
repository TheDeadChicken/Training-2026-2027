public class IntakePivotIOReal implements IntakePivotIO {
    //rename to please intakePivotMotor
    private Servo intakePivotMotor;

    IntakePivotIOReal(HardwareMap hardwareMap) {
        intakePivotMotor = hardware.get(Servo.class, "intakeServo");
        intakePivotMotor.setPosition(highPivotPosition);
    }

    @Override
    public void UpdateInputs(IntakePivotIOInputs inputs) {
        inputs.pivotPosition = intakePivotMotor.getPosition();
    }

    @Override
    public void SetPivotPosition(double position) {
        intakePivotMotor.setPosition(position);
    }

}
