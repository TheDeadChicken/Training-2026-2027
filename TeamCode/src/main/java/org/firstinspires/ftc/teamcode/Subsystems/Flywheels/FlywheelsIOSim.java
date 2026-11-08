public class FlywheelsIOSim implements FlywheelsIO{
    private double frontAppliedVolts = 0;
    private double backAppliedVolts = 0;

    public FlywheelsIOSim() {}

    @Override
    public void updateInputs(FlywheelsIOInputs inputs) {
        inputs.frontVolts = frontAppliedVolts;
        inputs.backVolts = -backAppliedVolts;
    }

    @Override
    public void RunVolts(double frontVolts, double backVolts) {
        frontAppliedVolts = frontVolts;
        backAppliedVolts = backVolts;
    }
}