public class PhoneCall {
    private double durationInMinutes;
    private double costPerMinute = 0.069;

    public PhoneCall(double duration){
        this.durationInMinutes = duration;
        System.out.println("PhoneCall instance has been created");
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        if(durationInMinutes > 0){
            this.durationInMinutes = durationInMinutes;
        }else {
            System.out.println("You cannot have phonecalls lesser than 0 seconds long");
            System.out.print("The given input was: " + durationInMinutes);
        }
    }
    public double calculateCost(){
        return costPerMinute * durationInMinutes;
    }
}
