public class FlywheelsIOSim implements FlywheelsIO {
    private double appliedVolts = 0;

    public FlywheelsIOSim() {}

    @Override
    public void UpdateInputs(FlywheelsIOInputs inputs) {
        inputs.upperVolts = appliedVolts;
        inputs.lowerVolts = -1 * appliedVolts;
    }

    @Override
    public void RunVolts(double volts) {
        appliedVolts = volts;
    }

}