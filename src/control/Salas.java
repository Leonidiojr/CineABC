/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author dtic
 */
public class Salas {
    
    public static int[][] listaSalasCadastradas = new int[1000][4];
    
    //Código automático para preenchimento de dados
    public static void PreencheListaAtualSalasCadastradas() {
        
        int linhas, colunas, salas;
        
        linhas = listaSalasCadastradas.length;
        colunas =4;
        salas = 0;
                                      
        for (int i = 0; i < linhas; i++) {            
            listaSalasCadastradas[i][0] = i;
            listaSalasCadastradas[i][1] = 10;
            listaSalasCadastradas[i][2] = 5;
            listaSalasCadastradas[i][3] = 50;
            salas = salas + 1;   
        }            
                
    }
        
    //Função para obter quantidade de salas cadastradas para exibição
    public static int QuantidadeSalasCadastradasDisponiveis() {
    
        int linhas, colunas, salas, cadeiras;
        
        linhas = listaSalasCadastradas.length;
        colunas =4;
        salas = 0;
        cadeiras = 0;
        for (int i = 0; i < Salas.listaSalasCadastradas.length; i++) {
            if (listaSalasCadastradas[i][1] != 0)  {                    
                salas = salas + 1;    
                cadeiras = listaSalasCadastradas[i][1] * listaSalasCadastradas[i][2];
            }                                                                    
        }
        return salas;
        
    }
    
    public static int QuantidadeCadeirasSalasCadastradasDisponiveis() {
    
        int linhas, colunas, salas, cadeiras;
        
        linhas = listaSalasCadastradas.length;
        colunas =4;
        salas = 0;
        cadeiras = 0;
        for (int i = 0; i < Salas.listaSalasCadastradas.length; i++) {
            if (listaSalasCadastradas[i][0] != 0)  {                    
                cadeiras = listaSalasCadastradas[i][1] * listaSalasCadastradas[i][2];
            }                                                                    
        }
        return cadeiras;
        
    }
    
}
