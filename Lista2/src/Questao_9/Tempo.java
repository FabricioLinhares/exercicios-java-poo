package Questao_9;

public class Tempo {
    private byte horas;
    private byte minutos;
    private byte segundos;

    public byte getHora() {
        return horas;
    }

    public void setHoras(byte hora) {
        this.horas = hora;
    }

    public byte getMinutos() {
        return minutos;
    }

    public void setMinutos(byte minutos) {
        this.minutos = minutos;
    }

    public byte getSegundos() {
        return segundos;
    }

    public void setSegundos(byte segundos) {
        this.segundos = segundos;
    }

    public int totalSegundos() {
        return segundos + (minutos*60) + (horas*60*60);
    }
}
