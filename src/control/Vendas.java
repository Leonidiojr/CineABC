/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.VendasIngressos;
import view.TelaCadastro;
import view.Reports1;

/**
 *
 * @author leonidiojr
 * 
 * Informaóes da matriz Vendas 
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
 *
 */
//Infomrações da matriz Sessoes
/**
 * 0 - codigo sessao 
 * 1 - codigo da sala
 * 2 - hora
 * 3 - Filme
 * 4 - Valor da Seçao
 * 5 - ? 
 * 6-Cadeiras usadaas
 * 7-Valor Arrecadado 
 * 8 - Encerrada?
 */         

public class Vendas {    

    public static int novaVendaIndice=0;    
    
    public static String[][] informacoesVendasEfetuadas = new String[1000][10];    
    
public static String MelhorOcupacaodeCadeirasPorSessao(){
        

        
/*        
        
        for (int i = 0; i < Filmes.informacoesFilmesCadastrados.length; i++){
            for (int j = 0; j < Filmes.informacoesFilmesCadastrados[i].length; j++) {
                valor = Integer.valueOf(Filmes.informacoesFilmesCadastrados[i][j]);
                if (valor > ValorMaximo){
                    ValorMaximo =valor;                  
                }
                if (valor<ValorMinimo){
                    ValorMinimo = valor;
                }
            }
            
        }
     */
        
        
        
        return "";
        
        
    }


//Adiciona uma nova venda
    public static boolean adicionarNovaCompra(String[][] VendaEfetivada){
        
        //localizar se a compra ja existe                                     
        for (int i = 0; i < 1000; i++) {
            if (informacoesVendasEfetuadas[i][0] == ""){
                novaVendaIndice  = i;
            }                        
        }        
        informacoesVendasEfetuadas[novaVendaIndice][0] = VendaEfetivada[0][0];
        informacoesVendasEfetuadas[novaVendaIndice][1] = VendaEfetivada[0][1];
        informacoesVendasEfetuadas[novaVendaIndice][2] = VendaEfetivada[0][2];
        informacoesVendasEfetuadas[novaVendaIndice][3] = VendaEfetivada[0][3];
        informacoesVendasEfetuadas[novaVendaIndice][4] = VendaEfetivada[0][4];
        informacoesVendasEfetuadas[novaVendaIndice][5] = VendaEfetivada[0][5];
        informacoesVendasEfetuadas[novaVendaIndice][6] = VendaEfetivada[0][6];
        informacoesVendasEfetuadas[novaVendaIndice][7] = VendaEfetivada[0][7];
        informacoesVendasEfetuadas[novaVendaIndice][8] = VendaEfetivada[0][8];
        informacoesVendasEfetuadas[novaVendaIndice][9] = VendaEfetivada[0][9];
        
        //Atualiza indice para nova compra
        novaVendaIndice = novaVendaIndice +1;
        
        
        return true;              
    }
    
    public static int numeroTickets(String nomeFilme){
        
        int somaCadeiras = 0;
        
        for (int i = 0; i < Vendas.informacoesVendasEfetuadas.length; i++) {            
           if (nomeFilme == informacoesVendasEfetuadas[i][1] && informacoesVendasEfetuadas[i][1] != ""){
                somaCadeiras = somaCadeiras + Integer.valueOf(informacoesVendasEfetuadas[i][4]);
           }
            
        }
        
        return somaCadeiras;
    }
    
    
    public static double SomaValorTickets(String nomeFilme){
        
        double somaValorCadeiras = 0;
        
        for (int i = 0; i < Vendas.informacoesVendasEfetuadas.length; i++) {            
           if (nomeFilme == informacoesVendasEfetuadas[i][1] && informacoesVendasEfetuadas[i][1] != ""){
                somaValorCadeiras = somaValorCadeiras + Double.valueOf(informacoesVendasEfetuadas[i][5]);
           }
            
        }
        
        return somaValorCadeiras;
    }
    
    
    public static String[][] MelhorFilmeVendas(){
        

        String[][] TopListFilmes = new String[Filmes.QuantidadeAtualFilmesCadastrados()][3];        
                
        double valorVenda = 0;
        int quantTickets = 0;        
        String nomeFilme ="";
                
        for (int i = 0; i < Filmes.QuantidadeAtualFilmesCadastrados(); i++) {                                                                                                                                
        
            nomeFilme = Filmes.informacoesFilmesCadastrados[i][1];
            TopListFilmes[i][0]= nomeFilme;
            quantTickets = Vendas.numeroTickets(nomeFilme);
            valorVenda = Vendas.SomaValorTickets(nomeFilme);                        
            TopListFilmes[i][1]= String.valueOf(quantTickets);
            TopListFilmes[i][2]= String.valueOf(valorVenda);                                                                                                                                                    
            
        }            
        
        return TopListFilmes;           
        
    }     
    
    
}


    

            

            
        
        
    
    


    
