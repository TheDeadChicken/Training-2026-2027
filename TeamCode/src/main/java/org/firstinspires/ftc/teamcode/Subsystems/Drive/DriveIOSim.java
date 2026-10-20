public class DriveIOSim {
    private double appliedFrontRightVolts = 0;
    private double appliedFrontLeftVolts = 0;
    private double appliedBackRightVolts = 0;
    private double appliedBackLeftVolts = 0;

    public DriveIOSim() {}

    @Override
    public void UpdateInputs(DriveIOInputs inputs) {
        inputs.frontRightVolts = frontRightVolts;
        inputs.frontLeftVolts = frontLeftVolts;
        inputs.backRightVolts = backRightVolts;
        inputs.backLeftVolts = backLeftVolts;
        
    }

    @Override
    public void RunVolts(double frontRightVolts, double frontLeftVolts, double backRightVolts, double backLeftVolts) {
        appliedFrontRightVolts = frontRightVolts;
        appliedFrontLeftVolts = frontLeftVolts;
        appliedBackRightVolts = backRightVolts;
        appliedBackLeftVolts = backLeftVolts;
    }

}
