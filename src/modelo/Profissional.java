package modelo;

public class Profissional {
    private String nome;
    private String especialidade;

    public Profissional(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return """
                Profissional:
                    Nome: %s
                    Especialidade: %s
                """.formatted(nome, especialidade);
    }
}
