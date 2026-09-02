package commandPattern;

import java.util.*;

public class ViewerApp {

    public static void main(String[] args){

        boolean exitProgram = false;

        do {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Porch Lights");
        System.out.println("2. Thermostat");
        System.out.println("3. Air Conditioning");
        System.out.println("4. Exit Program");
    
        System.out.print("Select the appliance/device: ");

        Integer choice = input.nextInt();

            switch (choice) {
                case 1: 
                // Turn on & off the porch lights
                System.out.println();
                PorchLights lights = new PorchLights();

                PowerOn powerOn = new PowerOn(lights);
                System.out.println(powerOn.execute());

                PowerOff powerOff = new PowerOff(lights);
                System.out.println(powerOff.execute());
                System.out.println();
                break;

                case 2:
                    System.out.println();
                    boolean exitProgramThermos = false;
                    Thermostat thermos = new Thermostat();

                    do {
                        // Options for the thermostat
                        System.out.println("1 - Increase the temperature");
                        System.out.println("2 - Decrease the temperature");
                        System.out.println("3 - Exit the Thermostat");
                        System.out.print("Thermostat selected. Select an option: ");
                        System.out.println();

                        int choiceThermos = input.nextInt();

                        switch (choiceThermos) {
                            case 1:
                                IncreaseTemp higherTemp = new IncreaseTemp(thermos);
                                System.out.println(higherTemp.execute());
                                continue;

                            case 2:
                                DecreaseTemp lowerTemp = new DecreaseTemp(thermos);
                                System.out.println(lowerTemp.execute());
                                continue;

                            case 3:
                                exitProgramThermos = true;
                                break;
                        
                            default:
                                System.out.println("Invalid choice. Please select an available option.");
                                continue;
                        }


                    } while (!exitProgramThermos);
                        continue;

    
                case 3:
                System.out.println();


                case 4:
                    input.close();
                    System.out.println("Exiting the program...");
                    exitProgram = true;
                    break;
                
                default:
                    System.out.println("Invalid choice. Please select an available device.");
                    continue;
            }

        } while (!exitProgram);

        
    }
}