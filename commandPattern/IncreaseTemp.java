package commandPattern;

public class IncreaseTemp implements Command{

    private Thermostat thermos;

    public IncreaseTemp(Thermostat thermos){
        this.thermos = thermos;
    }
    
    @Override
    public String execute() {
        return thermos.IncreaseTemp();

    }
}