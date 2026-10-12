public class FlywheelsIOSim {
    public double appliedVolts = 0;

    public FlywheelsIOSim() {}

    @Override
    public void UpdateInputs(FlywheelsIOInputs inputs) {
        inputs.topFlywheelVolts = appliedVolts;
        inputs.bottemFlywheelVolts = -appliedVolts;
    }

    @Override void RunVolts(double volts) {
        appliedVolts = volts;
    } 
}
