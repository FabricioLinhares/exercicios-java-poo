package Questao_10;

public class AppQuadrado {
    public static void main(String[] args) {
        Quadrado[] quadrado = new Quadrado[3];

        quadrado[0] = new Quadrado();
        quadrado[1] = new Quadrado();
        quadrado[2] = new Quadrado();

        quadrado[0].setLado(3.5);
        quadrado[1].setLado(4.6);
        quadrado[2].setLado(2.4);

        byte maiorAreaId=0, menorPerimetroId=0;
        for(byte i=0; i < 3; i++) {
            System.out.println("Lado do Quadrado " + i + ": " + quadrado[i].getLado());

            if (quadrado[i].calcularArea() > quadrado[maiorAreaId].calcularArea())
                maiorAreaId = i;
            if (quadrado[i].calcularPerimetro() < quadrado[menorPerimetroId].calcularPerimetro())
                menorPerimetroId = i;
        }

        System.out.println("\nQuadro com maior área: " + maiorAreaId);
        System.out.println("Quadro com menor perímetro: " + menorPerimetroId);
    }
}
