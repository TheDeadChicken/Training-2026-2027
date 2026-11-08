public class IntakePivotIOSim implements IntakePivotIO{
    private double appliedPivotPosition = 0;


    public IntakePivotIOSim(HardwareMap hardwareMap){}

    @Override 
    public void UpdatePivot(IntakePivotIOInputs inputs){
        inputs.pivotPosition = appliedPivotPosition;
    }

    @Override 
    public void RunPivotPosition(double position){
        appliedPivotPosition = position;

    }
    
}
