package commandPattern;

public class DecreaseTemp implements Command{

    private Thermostat thermos;

    public DecreaseTemp(Thermostat thermos){
        this.thermos = thermos;
    }
    
    @Override
    public String execute() {
        return thermos.DecreaseTemp();

    }
}