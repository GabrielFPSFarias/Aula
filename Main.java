import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto();
        p1.setNome("Produto 01");
        p2.setNome("Produto 02");
        p3.setNome("Produto 03");
        p4.setNome("Produto 04");
        p1.setPreco(10.00);
        p2.setPreco(5.00);
        p3.setPreco(20.00);
        p4.setPreco(15.00);
        ItemVenda v1 = new ItemVenda();
        ItemVenda v2 = new ItemVenda();
        ItemVenda v3 = new ItemVenda();
        ItemVenda v4 = new ItemVenda();
        v1.setProduto(p1);
        v2.setProduto(p2);
        v3.setProduto(p3);
        v4.setProduto(p4);
        v1.setQuantidade(10);
        v2.setQuantidade(5);
        v3.setQuantidade(10);
        v4.setQuantidade(2);
        Cliente c = new Cliente();
        c.setCpf("123456");
        c.setNome("José Maria Marques");
        c.setDataNascimento(LocalDate.of(1997, 9, 19));
        Venda v = new Venda();
        v.setItensVenda(new ArrayList<ItemVenda>());
        v.adicionarItem(v1);
        v.adicionarItem(v2);
        v.adicionarItem(v3);
        v.adicionarItem(v4);
        v.setData(LocalDateTime.of(2020, 12, 23,12,30));
        v.setAtendente("Maria Dolores Sampaio");
        v.setCliente(c);
        System.out.println(v.listarItensVenda());
    }
}
