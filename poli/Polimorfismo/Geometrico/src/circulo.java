public class circulo extends Figura {
    private double radio;

    public circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calculArea() {
        return Math.PI * radio * radio;
    }
    
}
