package modelo;

import modelo.enuns.Status;

import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Profissional profissional;
    private LocalDateTime dataHora;
    private Status status;

    public Consulta(Paciente paciente, Profissional profissional, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.dataHora = dataHora;
        this.status = Status.AGENDADA;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return """
                Consulta:
                    %s
                    %s
                    Data/Hora agendamento: %s
                    Status: %s
                """.formatted(paciente, profissional, dataHora, status);
    }
}
