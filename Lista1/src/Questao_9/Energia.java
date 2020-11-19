package Questao_9;

public class Energia {
    private float custoKW;
    private static final float TAXA_DESCONTO=(float)0.15;

    public float getCustoKW() {
        return custoKW;
    }

    public void setCustoKW(float custoKW) {
        this.custoKW = custoKW;
    }

    public float calcularGasto(float consumo, boolean desconto) {
        float gasto = custoKW * consumo;
        return desconto ? gasto * (1-TAXA_DESCONTO) : gasto;
    }
}
