import java.util.ArrayList;

public class Main {
    public static void Main(String[] args) {

        ArrayList<DesenharForma> formas = new ArrayList<DesenharForma>();
        formas.add(new DrawCircle());
        formas.add(new DrawTriangle());
        formas.add(new DrawRetangle());

        for(DesenharForma forma : forma){
            formas.desenhar();
        }

        //formas.forEach((formas)->formas.desenhar())
    }
}