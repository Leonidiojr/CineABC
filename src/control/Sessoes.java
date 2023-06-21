/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author dtic
 */
public class Sessoes {
    public static int contador = 0;
    

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
    
    public static String[][] cadastroSessoes = new String[100][8];
    
    
    public static int TopListSessoesPorCadeiras(int codigoSessao){
        
        String[][] TopListSessoesPorCadeirasTmp = new String[10][8];
        
        
        
        for (int i = 0; i < Sessoes.QuantidadeAtualSessoesCadastradas(); i++) {
            //if  (Cadeiras.QuantidadeAtualCadeirasOcupadas(i);
            
        }
        
        
        return 0;
    }
    
    
   
    //Código automático para preenchimento de dados    
    public static void PreencheListaSessoes() {
        
        int linhas, colunas, sessoes;
        
        linhas = cadastroSessoes.length;
        colunas =1;
        sessoes = 0;
                      
        for (int i = 0; i < 10; i++) {
            cadastroSessoes[i][0] = String.valueOf(i);
            cadastroSessoes[i][1] = "1";
            cadastroSessoes[i][2] = "19:00";                            
            cadastroSessoes[i][3] = Filmes.informacoesFilmesCadastrados[i][1];                
            cadastroSessoes[i][4] = "25";                                        
            
            sessoes = sessoes + 1;    
        }                              
        
                              
    }
    
    //Função para obter quantidade de sessoes cadastradas para exibição
    public static int QuantidadeAtualSessoesCadastradas() {
        int linhas, colunas, sessoes;
        
        linhas = cadastroSessoes.length;
        colunas =1;
        sessoes = 0;
                      
        for (int i = 0; i < 10; i++) {
            if (cadastroSessoes[i][1] != null) {                    
                sessoes = sessoes + 1;    
            }            
        }
        return sessoes;
                
    }
    
    public static String FormataDouble(double numeroSemFormato){
        
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();        
        formatoNumero.setMaximumFractionDigits(2);
        formatoNumero.setGroupingUsed(true);
        
        String numeroFormatado = formatoNumero.format(numeroSemFormato);            
        
        System.out.println(numeroFormatado);
        
        return numeroFormatado;
        
    }
    
    
}

