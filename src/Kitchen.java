public class Kitchen {
    final int EXPECTED_MINUTES_IN_OVEN = 40;

    public Kitchen(){

    }

    public  int remainingMinutesInOven(int minutes){
        return EXPECTED_MINUTES_IN_OVEN - minutes;
    }

    public  int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }
    public  int totalTimeInMinutes(int numberOfLayers, int actualMinutesinOven){
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesinOven;
    }
}
