package dz9;

public class ApplePhone extends Phone{

    public ApplePhone(String number, String model, double weight) {
        super(number, model, weight);
    }

    public void info(){
        System.out.printf("Phone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
    }
}
