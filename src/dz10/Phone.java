package dz10;

public abstract class Phone implements Callable<String>, Informable<String>{

   private String number;
   private String model;
   private double weight;

    public Phone() {
        System.out.println("Phone is created");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) throws NameException{
        if (name.length()<4) throw new NameException("Длина имени меньше 4 символов");
        System.out.printf("Call %s\n", name);
    }

    public abstract void info();

    public void inform(String mes) {
        System.out.println("Message: " + mes);
    }
}
