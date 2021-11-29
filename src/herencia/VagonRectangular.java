package herencia;

public class VagonRectangular extends Vagon{
    private int altura;
    private int longitud;
    private int ancho;

    public VagonRectangular(int altura, int longitud, int ancho) {
        this.altura = altura;
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public float calcularVolumen(){
        return longitud * ancho * altura;
    }
}
