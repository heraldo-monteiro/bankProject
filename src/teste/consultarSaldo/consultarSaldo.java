
package teste.consultarSaldo;

import java.util.Scanner;
import persistencia.TransferenciaDAO;

public class consultarSaldo {


    public static void main(String[] args) throws Exception {
        int agencia = 3513;
        int operacao = 13;
        String conta = "00002063";
        System.out.println("Saldo: R$"+TransferenciaDAO.consultarSaldo(agencia, operacao, conta));
    }
    
}
