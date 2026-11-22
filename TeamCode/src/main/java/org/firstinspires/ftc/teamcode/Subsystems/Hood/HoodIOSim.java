public class HoodIOSim implements HoodIO {
    private double appliedHoodPosition = startHoodPosition;


    public HoodIOSim(HardwareMap hardwareMap){}

    @Override 
    public void UpdateInputs(HoodIOInputs inputs){
        inputs.hoodPosition = appliedHoodPosition;
    }

    @Override 
    public void SetHoodPosition(double position){
        appliedHoodPosition = position;

    }
}
