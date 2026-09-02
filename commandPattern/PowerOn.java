package commandPattern;

public class PowerOn implements Command{

    private PorchLights lights;

    public PowerOn (PorchLights lights){
        this.lights = lights;

    }
    
    @Override
    public String execute() {
        return lights.switchOn();
    }
}