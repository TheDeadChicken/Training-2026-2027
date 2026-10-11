public class RollersIOSim implements RollersIO {
    private double appliedVolts = 0;

    public RollerIOSim() {}
   
    @Override
    public void UpdateInputs(RollersIOInputs inputs) {
        inputs.volts = appliedVolts;
    }
    
    @Override
    public void RunVolts(double volts) {
        appliedVolts = volts;
    }


}