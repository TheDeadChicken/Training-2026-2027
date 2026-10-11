public class FlywheelsIOSim implements FlywheelsIO {
    private double appliedVolts = 0;
    

    public FlywheelsIOSim() {}

    @Override
    public void UpdateInputs(FlywheelsIOInputs inputs) {}
        inputs.upvolts = appliedVolts;
        inputs.lowvolts = appliedVolts;
}