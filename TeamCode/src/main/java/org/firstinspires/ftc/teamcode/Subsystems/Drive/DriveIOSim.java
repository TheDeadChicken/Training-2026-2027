public class DriveIOSim implements DriveIO{
    public  double appliedVoltsFL = 0;
    public  double appliedVoltsFR = 0;
    public  double appliedVoltsBL = 0;
    public  double appliedVoltsBR = 0;

    
    public DriveIOSim() {}

    @Override 
    public void UpdateInputs(DriveIOInputs inputs) {
        inputs.voltsFL = appliedVoltsFL;
        inputs.voltsFR = appliedVoltsFR;
        inputs.voltsBL = appliedVoltsBL;
        inputs.voltsBR = appliedVoltsBR;

    }

    @Override 
    public void RunVolts(double voltsFL, double voltsFR, double voltsBL, double voltsBR) {
        appliedVoltsFL = voltsFL;
        appliedVoltsFR = voltsFR;
        appliedVoltsBL = voltsBL;
        appliedVoltsBR = voltsBR;
    }

}
