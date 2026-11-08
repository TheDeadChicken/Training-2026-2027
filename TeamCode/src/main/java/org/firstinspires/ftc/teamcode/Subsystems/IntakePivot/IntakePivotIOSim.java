public class IntakePivotIOSim implements IntakePivotIO{
    private double appliedPivotPosition = 0;


    public IntakePivotIOSim(HardwareMap hardwareMap){}

    @Override 
    public void UpdateInputs(IntakePivotIOInputs inputs){
        inputs.pivotPosition = appliedPivotPosition;
    }

    @Override 
    public void SetPivotPosition(double position){
        appliedPivotPosition = position;

    }
    
}
