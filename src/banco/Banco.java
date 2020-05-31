
package banco;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        
        Projeto_Banco dados = new Projeto_Banco();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua agência: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: ")));
        dados.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
        
        dados.logar(dados.getAgencia(), dados.getNumConta(), dados.getSenha());
        
    }

    }
    
