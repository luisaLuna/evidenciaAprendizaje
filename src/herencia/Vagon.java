package herencia;

public class Vagon {
    private String tipoCarga;

    public float calcularVolumen() {
        return 0;
    }

    public String getTipoCarga(){
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public static void main(String[] args) {
        VagonRectangular vRec = new VagonRectangular(7, 2, 2);
        System.out.printf("El volumen del vagon rectangular es: %.0f", vRec.calcularVolumen());
    }
}
