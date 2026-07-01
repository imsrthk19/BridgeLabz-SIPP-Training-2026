public class FitnessDevice implements ITrackable {
    int steps;
    int calories;

    public FitnessDevice(int steps, int calories){
        this.steps= steps;
        this.calories= calories;
    }
    @Override
    public  void logActivity(){
        System.out.println("----------------------");
        System.out.println("Activity is Logged");
        System.out.println("Steps:- "+ steps);
        System.out.println("Calories Burned:- "+ calories);
        System.out.println("-----------------------");
    }

    
    public void generateReport(){     //signature should be same= public, not private or protected.
        System.out.println("----------------------");
        System.out.println("FITNESS REPORT");
        System.out.println("----------------------");
        System.out.println("Total Steps:- " + steps);
        System.out.println("Calories Burned:- "+ calories);
        System.out.println("----------------------");
    }


    public void sendAlert()
    {
        int remainingSteps= 5000 - steps;
        if(steps<5000){
            System.out.println("You Need to walk more "+ remainingSteps);
        }
        else{
            System.out.println("Goal of 5000 steps is achieved");
        }
    }
}
