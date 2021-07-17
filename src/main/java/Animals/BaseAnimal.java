package Animals;

public abstract class BaseAnimal {
    private String name;
    private Double weight; //lbs
    private Double height; //inches
    private String color;

    public BaseAnimal(){
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}