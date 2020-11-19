package Questao_8;

public class Tempo {
    private byte horas;
    private byte minutos;

    public byte getHoras() {
        return horas;
    }

    public void setHoras(byte horas) {
        if (horas >= 0) {
            this.horas = horas;
        }
    }

    public byte getMinutos() {
        return minutos;
    }

    public void setMinutos(byte minutos) {
        if (minutos >= 0) {
            this.minutos = minutos;
        }
    }

    public short horasParaMinutos() {
        return (short) (getHoras()*60);
    }

    public short minutosTotal() {
        return (short) (horas * 60 + minutos);
    }

    public int segundosTotal() {
        return (horas * 60 + minutos) * 60;
    }
}
