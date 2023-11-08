public class Quadrado implements Forma {

    private int side;

    public void setSide(){
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}