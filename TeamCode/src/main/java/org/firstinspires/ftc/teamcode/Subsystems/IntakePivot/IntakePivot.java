public class IntakePivot extends SubsystemBase{
    private final IntakePivotIO io;
    private final IntakePivotIOInputsAutoLogged inputs = new IntakePivotIOInputsAutoLogged();
    double targetIntakePivotPosition = highPivotPosition;
    
    public IntakePivot(IntakePivotIO io){
        this.io = io;
    }

    public void Periodic(){
        io.UpdateInputs(inputs);
    }

    public Command SetPivotPositionHigh(){
        return run(() -> io.SetPivotPosition(highPosition));
        targetIntakePivotPosition = highPosition;

    }
    public Command SetPivotPositionLow(){
        return run(() -> io.SetPivotPosition(lowPosition));
        targetIntakePivotPosition = lowPosition;
    }

    public Command HoldIntakePivotPosition(){
        return run(() -> io.SetPivotPosition(targetIntakePivotPosition));
    }
}
