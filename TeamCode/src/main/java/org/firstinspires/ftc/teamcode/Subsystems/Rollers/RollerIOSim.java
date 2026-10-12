public class RollerIOSim implements RollerIO {
    private double appliedVolts = 0;

    public RollerIOSim() {}

    @Override
    public void UpdateInputs(RollerIOInputs inputs) {
        inputs.volts = appliedVolts;
    }

    @Override
    public void RunVolts(double volts) {
        appliedVolts = volts;
    }

    
}
