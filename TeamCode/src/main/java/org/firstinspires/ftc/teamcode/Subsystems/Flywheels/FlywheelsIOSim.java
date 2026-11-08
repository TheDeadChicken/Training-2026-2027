public class FlywheelsIOSim implements FlywheelsIO{
    private double upperAppliedVolts = 0;
    private double lowerAppliedVolts = 0;

    public FlywheelsIOSim() {}

    @Override
    public void updateInputs(FlywheelsIOInputs inputs) {
        inputs.upperVolts = upperAppliedVolts;
        inputs.lowerVolts = -1 * lowerAppliedVolts;
    }

    @Override
    public void RunVolts(double upperVolts, double lowerVolts) {
        upperAppliedVolts = upperVolts;
        lowerAppliedVolts = lowerVolts;
    }
}