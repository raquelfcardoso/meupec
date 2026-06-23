package modelo;

import java.time.LocalDate;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;

    public Paciente(String nome, String cpf, String telefone, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade () {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    @Override
    public String toString() {
        return """
                Paciente:
                    Nome: %s
                    CPF: %s
                    Telefone: %s
                    Data de Nascimento: %s
                    Idade: %d anos
                """.formatted(nome, cpf, telefone, dataNascimento, getIdade()
        );
    }
}
