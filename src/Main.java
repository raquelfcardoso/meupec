import modelo.Paciente;
import modelo.Profissional;
import modelo.enuns.Status;

import java.time.LocalDate;


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

        Status status = Status.REALIZADA;
        System.out.println(status);
    }
}
