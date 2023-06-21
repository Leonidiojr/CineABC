package control;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import control.Vendas;

 /* Informações da matriz Vendas 
 *   
 * coluna[0]  Sala
 * coluna[1]  Nome do filme
 * coluna[2]  Hora Inicio
 * coluna[3]  Cadeiras
 * coluna[4]  Quantidade
 * coluna[5]  Valor Pago
 * coluna[6]  Forma Pagamento
 * coluna[7]  Tipo de entrada
 * coluna[8]  Nome Cliente
 * coluna[9]  Data compra
 */

public class Cadeiras {
    public static int[][] cadeiras = new int[20][50];
    public static int novaCadeiraIndice=0;    

    public static void PreencheAleatorio() {
      int linhas, colunas, quantCadeira;

      linhas = cadeiras.length;
      colunas = 10; 
      quantCadeira = 0;

      for (int i = 0; i < 10; i++) {            
          for (int j= 0; j<50;j++){
              if ((j % (i+1)) ==0) {
                  cadeiras[i][j] = 0;
                  
              } else{
                cadeiras[i][j] = 1;             
                quantCadeira = quantCadeira + 1;                  
              }
          }                      
          Vendas.informacoesVendasEfetuadas[i][0] = String.valueOf(i); 
          Vendas.informacoesVendasEfetuadas[i][1] = Filmes.informacoesFilmesCadastrados[i][1]; 
          Vendas.informacoesVendasEfetuadas[i][2] = "19:00"; 
          Vendas.informacoesVendasEfetuadas[i][3] = "A1"; 
          Vendas.informacoesVendasEfetuadas[i][4] = String.valueOf(quantCadeira); 
          Vendas.informacoesVendasEfetuadas[i][5] = "100.0"; 
          Vendas.informacoesVendasEfetuadas[i][6] = "dinheiro"; 
          Vendas.informacoesVendasEfetuadas[i][7] = "normal"; 
          Vendas.informacoesVendasEfetuadas[i][8] = "Leonidio Alves";
          Vendas.informacoesVendasEfetuadas[i][9] = "19/05/2023 15:00";
          quantCadeira = 0;
      }

    }

      
    public static int aleatorioZeroUm(){
    
        Random random = new Random();
        int randomNumber = random.nextInt();
        return randomNumber;
}
      
    
    //Função para obter quantidade de filmes cadastrados para exibição   
    public static int QuantidadeAtualCadeirasOcupadas(int codigoSala) {
        
        int quantCadeira;
        
        quantCadeira = 0;                                
        for (int i = codigoSala; i < codigoSala+1; i++) {            
            for (int j = 0; j<50;j++){                
                //System.out.println( cadeiras[i][j]);
                if (cadeiras[i][j] == 1) {                    
                    quantCadeira = quantCadeira + 1;                        
                }
            }            
        }
        return quantCadeira;
                                        
    }
    
    
    //Função para obter quantidade de filmes cadastrados para exibição   
    public static int QuantidadeAtualCadeirasLivres(int codigoSala) {
        
        int quantCadeira;
        
        quantCadeira = 0;                                
        for (int i = codigoSala; i < codigoSala+1; i++) {            
            for (int j = 0; j<50;j++){                
                //System.out.println( cadeiras[i][j]);
                if (cadeiras[i][j] == 0) {                    
                    quantCadeira = quantCadeira + 1;                        
                }
            }            
        }
        
        return quantCadeira;
                                        
    }
    
}


