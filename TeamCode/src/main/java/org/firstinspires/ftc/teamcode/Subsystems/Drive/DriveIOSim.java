public class DriveIOSim implements DriveIO {
    private double frontLeftVolts = 0;
    private double frontRightVolts = 0;
    private double backLeftVolts = 0;
    private double backRightVolts = 0;

    public DriveIOSim() {}

    @Override
    public void UpdateInputs(DriveIOInputs inputs) {
        inputs.frontLeftVolts = frontLeftVolts;
        inputs.frontRightVolts = frontRightVolts;
        inputs.backLeftVolts = backLeftVolts;
        inputs.backRightVolts = backRightVolts; 
    }

    @Override
    public void RunVolts(double volts) {
        frontLeftVolts = volts;
        frontRightVolts = volts;
        backLeftVolts = volts;
        backRightVolts = volts;
    }


}