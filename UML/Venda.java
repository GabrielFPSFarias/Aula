import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Venda {
    private List<ItemVenda> itensVenda;
    private LocalDateTime data;
    private String atendente;
    private Cliente cliente;

    public void adicionarItem(ItemVenda item){
        this.itensVenda.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.itensVenda.size(); i++){
            total += this.itensVenda.get(i).calcularTotal();
        }
        return total;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public String getData() {
        DateTimeFormatter formatador  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatador.format(this.data);
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String listarItensVenda(){
        String txt = "Data da Venda: " + this.getData() + "\nCliente: " + this.getCliente().getNome() + "| CPF: " + this.getCliente().getCpf() + "| idade: " + this.cliente.calcularIdade() + "\nAtendente: " + this.getAtendente() + "\n\nNome do produto | Preço      | Quantidade  | Total\n_____________________________________________________";
        for(int i = 0; i < this.itensVenda.size(); i++){
            txt += "\n" + this.itensVenda.get(i).getProduto().getNome() + "      |    R$ " + this.itensVenda.get(i).getProduto().getPreco() + " |          " + this.itensVenda.get(i).getQuantidade() + " | R$ " + this.itensVenda.get(i).calcularTotal();
        }
        txt += "\n_____________________________________________________\nTotal da Venda:                             R$ " + this.calcularTotal();
        return txt;
    }
}
