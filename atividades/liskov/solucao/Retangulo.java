public class Retangulo implements Forma {

    private int height;
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }


}