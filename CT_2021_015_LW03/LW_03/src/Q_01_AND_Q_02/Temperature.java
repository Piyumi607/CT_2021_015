package Q_01_AND_Q_02;

public class Temperature {
    private double celsius;
    public Temperature(){

    }
    public Temperature(double celsius){
        this.celsius=celsius;
    }

    public double tocelsius(){
        return celsius;
    }

    public double toFahrenheit(){
        return (celsius*((double)9/5)+32 );
    }
    public void setcelsius(double celsius){
        this.celsius=celsius;
    }

    public void setFahrenheit(double fahrenheit){
        this.celsius=(fahrenheit-32)*((double)5/9 );
    }

}
