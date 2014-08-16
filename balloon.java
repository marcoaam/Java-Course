public class Balloon
{
    private double volume;
    final double PI = (double) Math.PI;
    
    public Balloon()
    {
        
    }
    public void addAir(double amount)
    {
        this.volume = this.volume + amount;
    }
    
    public double getVolume()
    {
        return this.volume;
    }
    
    public double getSurfaceArea()
    {
        double radius = (double) Math.cbrt((3 * volume)/(4.0 * Math.PI));
        double radius2 = (double) Math.pow(radius, 2);
        double surface = (double) (4.0 * this.PI * radius2);
        return surface;
    }
    
    public double getRadius()
    {
        double radius = (double) Math.cbrt((3 * volume)/(4.0 * Math.PI));
        return radius;
    } 

}