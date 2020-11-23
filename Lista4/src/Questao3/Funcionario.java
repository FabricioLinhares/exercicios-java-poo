package Questao3;

public class Funcionario {
    private String nome;
    private String sexo;
    private String departamento;
    private float salario;

    public Funcionario(String nome, String sexo, String departamento, float salario) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setDepartamento(departamento);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario > 0)
            this.salario = salario;
    }

    public void bonificar(float aumento) {
        if (aumento > 0)
            setSalario(getSalario() * (1+aumento));
    }

    public float ganhoAnual() {
        return getSalario() * 13;
    }
}
