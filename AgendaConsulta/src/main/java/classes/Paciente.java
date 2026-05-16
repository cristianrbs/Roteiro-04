
package classes;

public class Paciente {
    
    private String nome;
    private String CPF;
    private String data_nascimento;
    private String historico_medico;
    
    public void adicionarPacientes(Paciente NovoPaciente){
        
    }
    
    public void removePaciente(Paciente paciente){
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getHistorico_medico() {
        return historico_medico;
    }

    public void setHistorico_medico(String historico_medico) {
        this.historico_medico = historico_medico;
    }
    
    
}
