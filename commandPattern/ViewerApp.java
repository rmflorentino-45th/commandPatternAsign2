package commandPattern;

import java.util.*;

public class ViewerApp {

    public static void main(String[] args){

        boolean exitProgram = false;

        do {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Porch Lights");
        System.out.println("2. Thermostat");
        System.out.println("3. Music Player");
        System.out.println("4. Exit Program");
    
        System.out.print("Select the appliance: ");

        Integer choice = input.nextInt();

            switch (choice) {
                case 1: 
                    System.out.println();
                    boolean exitProgramLights = false;
                    PorchLights lights = new PorchLights();

                    do {
                        System.out.println("1 - Turn on the lights");
                        System.out.println("2 - Turn off the lights");
                        System.out.println("3 - Exit the lights\n");
                        System.out.print("Porch Lights selected. Select an option: ");

                        int choiceLights = input.nextInt();

                        switch (choiceLights) {
                            case 1:
                                PowerOn powerOn = new PowerOn(lights);
                                System.out.println(powerOn.execute());
                                continue;
                        
                            case 2:
                                PowerOff powerOff = new PowerOff(lights);
                                System.out.println(powerOff.execute());
                                continue;

                            case 3:
                                exitProgramLights = true;
                                break;

                            default:
                                System.out.println("Invalid choice. Please select an available option.");
                                continue;
                        }
                        
                    } while (!exitProgramLights);
                        continue;

                
                case 2:
                    System.out.println();
                    boolean exitProgramThermos = false;
                    Thermostat thermos = new Thermostat();

                    do {
                        // Options for the thermostat
                        System.out.println("1 - Increase the temperature");
                        System.out.println("2 - Decrease the temperature");
                        System.out.println("3 - Exit the Thermostat\n");
                        System.out.print("Thermostat selected. Select an option: ");

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

                    boolean exitProgramMusic = false;
                    MusicPlayer sound = new MusicPlayer();

                    do {
                        // Options for the thermostat
                        System.out.println("1 - Increase the volume");
                        System.out.println("2 - Decrease the volume");
                        System.out.println("3 - Exit the Music Player\n");

                        System.out.print("Music player selected. Select an option: ");

                        int choiceThermos = input.nextInt();

                        switch (choiceThermos) {
                            case 1:
                                IncreaseVolume higherVol = new IncreaseVolume(sound);
                                System.out.println(higherVol.execute());
                                continue;

                            case 2:
                                DecreaseVolume lowerVol = new DecreaseVolume(sound);
                                System.out.println(lowerVol.execute());
                                continue;

                            case 3:
                                exitProgramMusic = true;
                                break;
                        
                            default:
                                System.out.println("Invalid choice. Please select an available option.");
                                continue;
                        }

                    } while (!exitProgramMusic);
                        continue;

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