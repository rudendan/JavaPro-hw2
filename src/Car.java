public class Car {

    public void start() {
        System.out.println("Car was started");
        startCommand();
        startElectricity();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity was started");
    }

	private void startCommand() {
        System.out.println("Command was started");
    }

	private void startFuelSystem() {
        System.out.println("Fuel system was started");
    }
}
