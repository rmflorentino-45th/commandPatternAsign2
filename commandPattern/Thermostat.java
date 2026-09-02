package commandPattern;

public class Thermostat {

    private int actualTemp = 28;

    public Integer getTemp() {
        return actualTemp;
    }

    public void setTemp(Integer actualTemp) {
        this.actualTemp = actualTemp;
    }

    public String DecreaseTemp(){
        actualTemp--;
        return "The thermostat's temperature is now: " + actualTemp;

    }

    public String IncreaseTemp(){
        actualTemp++;
        return "The thermostat's temperature is now: " + actualTemp;
    }
    
}