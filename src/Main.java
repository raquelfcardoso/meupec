import modelo.Consulta;
import modelo.Paciente;
import modelo.Profissional;
import modelo.enuns.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(
                "Raquel Ferreira Cardoso",
                "01591783208",
                "91981695223",
                LocalDate.of(1992, 9, 6)
        );
        Profissional[] profissionais = new Profissional[3];
        profissionais[0] = new Profissional("Gleywson Ribeiro", "Clínico Geral");
        profissionais[1] = new Profissional("Jakeline de Oliveira", "Enfermeira");
        profissionais[2] = new Profissional("Vinicius Botelho", "Otorrinolaringologista");



        System.out.println(paciente);

        for (Profissional profissional : profissionais) {
            System.out.println(profissional);
        }

        Consulta consulta = new Consulta(
                paciente, profissionais[1],
                LocalDateTime.of(2026, 7, 30, 11, 0)
        );
        System.out.println("===Mostrando Consulta===");
        System.out.println(consulta);
    }
}
