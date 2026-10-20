public class RollersIOSim implements RollersIO {

    private double appliedVolts = 0;

    public RollersIOSim() {


    }

    @Override
    public void UpdateInputs(RollerIOInputs inputs) {
        inputs.volts = appliedVolts;

    }

    @Override
    public void RunVolts(double volts) {
        appliedVolts = volts;

    }

}