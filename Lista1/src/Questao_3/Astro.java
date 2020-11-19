package Questao_3;

public class Astro {
    private float taxaConversaoPeso;

    public float getTaxaConversaoPeso() {
        return taxaConversaoPeso;
    }

    public void setTaxaConversaoPeso(float taxaConversaoPeso) {
        if (taxaConversaoPeso >= 0 && taxaConversaoPeso <= 1) {
            this.taxaConversaoPeso = taxaConversaoPeso;
        }
    }

    public float calcularPeso(float massa) {
        return massa * taxaConversaoPeso;
    }
}
