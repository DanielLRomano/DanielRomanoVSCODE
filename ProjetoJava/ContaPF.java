package ProjetoJava;

import javax.swing.JOptionPane;

public class ContaPF extends Conta {

    String nCpf;
    int salario;

    public String getnCpf() {
        return nCpf;
    }

    public void setnCpf(String nCpf) {
        this.nCpf = nCpf;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void emprestimoPF() {
        if (salario >= 1500) {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$2500 para empréstimo \n Digite a quantidade solicitada."));
            saldo += emprestimo;
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!"
                    + "\n Valor solicitado: R$" + emprestimo
                    + "\n Saldo após empréstimo: R$" + saldo);
        }
    }

}
