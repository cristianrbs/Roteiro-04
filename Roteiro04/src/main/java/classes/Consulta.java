package classes;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String dataHora;

    public Consulta(Paciente paciente, Medico medico, String dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public Consulta(){
        this.paciente = null;
        this.medico = null;
        this.dataHora = "";
    }

    @Override
    public String toString() {
        return "Consulta{paciente=" + paciente.getNome() +
               ", medico=" + medico.getNome() +
               ", dataHora=" + dataHora + "}";
    }

   
    //getters e setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }  
}