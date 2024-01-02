
package teste.Conta;

import java.text.DecimalFormat;
import java.util.Scanner;
import modelo.Conta;
import persistencia.ContaDAO;


public class carregarSaldo {

  
    public static void main(String[] args) throws Exception{
        carregarSaldo carregaSaldo = new carregarSaldo();
        carregaSaldo.carregaSaldo();
        
        }
        public void carregaSaldo()throws Exception{            
            Scanner input = new Scanner(System.in);
            System.out.print("Usuario: "); String usuario = input.next();     
            System.out.println(df.format(ContaDAO.saldoConta(usuario)));            
    }
    DecimalFormat df = new DecimalFormat("#,##0.00");
}
