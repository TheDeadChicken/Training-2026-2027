public class DriveIOSIM implements DriveIO {
    private double appliedVoltsLeft = 0;
    private double appliedVoltsRight = 0;

    public DriveIOSIM() {}

    @Override
    public void UpdateInputs(DriveIOInputs inputs) {
        inputs.FrontLeftVolts = appliedVoltsFrontLeft;
        inputs.FrontRightVolts = appliedVoltsFrontRight;
        inputs.BackLeftVolts = appliedVoltsBackLeft;
        inputs.BackRightVolts = appliedVoltsBackRight;
    }

    @Override
    public void RunVolts(double left, double right) {
        appliedVoltsLeft = left;
        appliedVoltsRight = right;
    }
}