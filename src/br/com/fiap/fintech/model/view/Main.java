import br.com.fiap.fintech.model.classe.Gastos;
import br.com.fiap.fintech.model.Recebimento;
import br.com.fiap.fintech.model.usuario.Saldo;
import br.com.fiap.fintech.model.usuario.CadastroUsuario;

public static void main(String[] args) {
        CadastroUsuario usuario = new CadastroUsuario("João Silva", "joao.silva@email.com");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
// Criando e testando a classe br.com.fiap.fintech.model.usuario.br.com.fiap.fintech.model.usuario.Saldo
        Saldo saldo = new Saldo(1000.0);
        System.out.println("br.com.fiap.fintech.model.usuario.br.com.fiap.fintech.model.usuario.Saldo inicial: " + saldo.getSaldo());
        saldo.adicionarSaldo(500.0);
        System.out.println("br.com.fiap.fintech.model.usuario.br.com.fiap.fintech.model.usuario.Saldo após adição: " + saldo.getSaldo());
        saldo.subtrairSaldo(200.0);
        System.out.println("br.com.fiap.fintech.model.usuario.br.com.fiap.fintech.model.usuario.Saldo após subtração: " + saldo.getSaldo());
// Criando e testando a classe br.com.fiap.fintech.model.classe.br.com.fiap.fintech.model.Recebimento
        Recebimento recebimento = new Recebimento(300.0, "Salário");
        System.out.println("br.com.fiap.fintech.model.classe.br.com.fiap.fintech.model.Recebimento: " + recebimento.getDescricao() + " - Valor: " + recebimento.getValor());
// Criando e testando a classe br.com.fiap.fintech.model.classe.br.com.fiap.fintech.model.classe.Gastos
        Gastos gastos = new Gastos(150.0, "Compras");
        System.out.println("br.com.fiap.fintech.model.classe.br.com.fiap.fintech.model.classe.Gastos: " + gastos.getDescricao() + " - Valor: " +
                gastos.getValor());
    }


