package commandPattern;

public class PowerOff implements Command{

    private PorchLights lights;

    public PowerOff(PorchLights lights){
        this.lights = lights;
    }
        
    @Override
    public String execute() {
        return lights.switchOff();

    }
}