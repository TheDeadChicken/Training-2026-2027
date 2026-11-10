public class IntakePivotIOReal implements IntakePivotIO {
    private Servo intakeMotor;
    IntakePivotIOReal(HardwareMap hardwareMap){
        intakeMotor = hardware.get(Servo.class, "intakeServo");
        intakeMotor.setPosition(highPivotPosition);
    }

    @Override 
    public void UpdateInputs(IntakePivotIOInputs inputs) {
        inputs.pivotPosition = intakeMotor.getPosition();
    }
}
