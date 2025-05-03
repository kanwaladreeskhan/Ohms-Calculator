 
package MyPackage;
 
public class OhmsLaw {
     private double current;
     private  double voltage;
      private  double resistance;
 public String ToString()
        {
            return "Current={I=" + current +"}";
        }
        public void setVoltage(double voltage)
        {
            this.voltage = voltage;
        } 
        public double getVoltage()
        {
            return voltage;
        }
        public void setResistance(double resistance)
        {
            this.resistance = resistance;
        } 
        
        public double GetResistance(){
            return resistance;
        }
        public double calculateCurrent() {
    if (resistance == 0) return 0; // avoid division by zero
    return voltage / resistance;
}
}
