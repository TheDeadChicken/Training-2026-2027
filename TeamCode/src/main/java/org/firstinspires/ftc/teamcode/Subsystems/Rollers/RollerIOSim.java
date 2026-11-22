public class RollerIOSim implements RollerIO {
    private double appliedVolts = 0;

    public RollerIOSim(HardwareMap hardwareMap) {}

    @Override
    public void UpdateInputs(RollerIOInputs inputs) {
        inputs.leftVolts = appliedVolts;
        inputs.rightVolts = appliedVolts;
    }

    @Override
    public void RunVolts(double volts) {
        appliedVolts = volts;
    }

    
}
