import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    int calcularIdade(){
        Period p = Period.between(this.dataNascimento, LocalDate.now());
        return p.getYears();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate DataNascimento){
        this.dataNascimento = DataNascimento;
    }
    Cliente(char g){
        this.setCpf("12345678910");
        this.setNome("Gabriel");
        this.dataNascimento = LocalDate.of(2005, 9, 19);
    }
}
