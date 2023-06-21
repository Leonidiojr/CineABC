package control;

import java.util.Iterator;
import javax.swing.JOptionPane;
import view.TelaPrincipal;

/**
 *
 * @author dtic
 */
public class Filmes {
    
    public static String[][] informacoesFilmesCadastrados = new String[1000][6]; 
    public static int novoFilmeIndice=0;    
    

    //Código automático para preenchimento de dados
    public static void PreencheListaAtualFilmesCadastrados() {
        
        int linhas, colunas, filmes;
        
        linhas = 20;
        colunas =6;
        filmes = 0;
        for (int i = 0; i < linhas; i++) {            
            informacoesFilmesCadastrados[i][0] = String.valueOf(i);
            informacoesFilmesCadastrados[i][1] = "A volta dos que não foram "+i;
            informacoesFilmesCadastrados[i][2] = "Suspense";
            informacoesFilmesCadastrados[i][3] = "Áudio Original";                
            informacoesFilmesCadastrados[i][4] = "180";
            informacoesFilmesCadastrados[i][5] = "Livre";
            filmes = filmes + 1;   
        }          
        
        informacoesFilmesCadastrados[0][1]="O Senhor dos Anéis: O Retorno do Rei";
        informacoesFilmesCadastrados[1][1]="Interestelar";
        informacoesFilmesCadastrados[2][1]="Pulp Fiction: Tempo de Violência";
        informacoesFilmesCadastrados[3][1]="A Origem";
        informacoesFilmesCadastrados[4][1]="Clube da Luta";
        informacoesFilmesCadastrados[5][1]="Matrix";
        informacoesFilmesCadastrados[6][1]="O Poderoso Chefão";
        informacoesFilmesCadastrados[7][1]="A Viagem de Chihiro";
        informacoesFilmesCadastrados[8][1]="Interestelar";
        informacoesFilmesCadastrados[9][1]="Cidade de Deus";
        informacoesFilmesCadastrados[10][1]="Gladiador";
        informacoesFilmesCadastrados[11][1]="O Labirinto do Fauno";
        informacoesFilmesCadastrados[12][1]="Os Infiltrados";
        informacoesFilmesCadastrados[13][1]="Clube dos Cinco";
        informacoesFilmesCadastrados[14][1]="A Trilha das Sombras";
        informacoesFilmesCadastrados[15][1]="O Grande Lebowski";
        informacoesFilmesCadastrados[16][1]="A Vida é Bela";
        informacoesFilmesCadastrados[17][1]="O Fabuloso Destino de Amélie Poulain";
        informacoesFilmesCadastrados[18][1]="Cisne Negro";
        informacoesFilmesCadastrados[19][1]="Ponte para Terabítia";
        informacoesFilmesCadastrados[0][2]="Fantasia";
        informacoesFilmesCadastrados[1][2]="Ficção Científica";
        informacoesFilmesCadastrados[2][2]="Crime";
        informacoesFilmesCadastrados[3][2]="Ficção Científica";
        informacoesFilmesCadastrados[4][2]="Drama";
        informacoesFilmesCadastrados[5][2]="Ficção Científica,";
        informacoesFilmesCadastrados[6][2]="Crime";
        informacoesFilmesCadastrados[7][2]="Animação";
        informacoesFilmesCadastrados[8][2]="Ficção Científica";
        informacoesFilmesCadastrados[9][2]="Drama";
        informacoesFilmesCadastrados[10][2]="Ação";
        informacoesFilmesCadastrados[11][2]="Fantasia";
        informacoesFilmesCadastrados[12][2]="Crime";
        informacoesFilmesCadastrados[13][2]="Comédia";
        informacoesFilmesCadastrados[14][2]=" Suspense";
        informacoesFilmesCadastrados[15][2]="Comédia";
        informacoesFilmesCadastrados[16][2]="Comédia Dramática";
        informacoesFilmesCadastrados[17][2]="Comédia Romântica";
        informacoesFilmesCadastrados[18][2]="Drama";
        informacoesFilmesCadastrados[19][2]="Aventura";
        informacoesFilmesCadastrados[0][3]="Dublado";
        informacoesFilmesCadastrados[1][3]="Dublado";
        informacoesFilmesCadastrados[2][3]="Legendado";
        informacoesFilmesCadastrados[3][3]="Legendado";
        informacoesFilmesCadastrados[4][3]="Legendado";
        informacoesFilmesCadastrados[5][3]="Legendado";
        informacoesFilmesCadastrados[6][3]="Legendado";
        informacoesFilmesCadastrados[7][3]="Dublado";
        informacoesFilmesCadastrados[8][3]="Áudio Original";
        informacoesFilmesCadastrados[9][3]="Áudio Original";
        informacoesFilmesCadastrados[10][3]="Dublado";
        informacoesFilmesCadastrados[11][3]="Legendado";
        informacoesFilmesCadastrados[12][3]="Dublado";
        informacoesFilmesCadastrados[13][3]="Dublado";
        informacoesFilmesCadastrados[14][3]="Legendado";
        informacoesFilmesCadastrados[15][3]="Áudio Original";
        informacoesFilmesCadastrados[16][3]="Áudio Original";
        informacoesFilmesCadastrados[17][3]="Dublado";
        informacoesFilmesCadastrados[18][3]="Legendado";
        informacoesFilmesCadastrados[19][3]="Dublado";
        informacoesFilmesCadastrados[0][4]="201";
        informacoesFilmesCadastrados[1][4]="169";
        informacoesFilmesCadastrados[2][4]="154";
        informacoesFilmesCadastrados[3][4]="48";
        informacoesFilmesCadastrados[4][4]="139";
        informacoesFilmesCadastrados[5][4]="136,";
        informacoesFilmesCadastrados[6][4]="175";
        informacoesFilmesCadastrados[7][4]="125";
        informacoesFilmesCadastrados[8][4]="169";
        informacoesFilmesCadastrados[9][4]="130";
        informacoesFilmesCadastrados[10][4]="155,";
        informacoesFilmesCadastrados[11][4]="118";
        informacoesFilmesCadastrados[12][4]="151,";
        informacoesFilmesCadastrados[13][4]="97";
        informacoesFilmesCadastrados[14][4]="142";
        informacoesFilmesCadastrados[15][4]="117";
        informacoesFilmesCadastrados[16][4]="116";
        informacoesFilmesCadastrados[17][4]="122";
        informacoesFilmesCadastrados[18][4]="108";
        informacoesFilmesCadastrados[19][4]="96";
        informacoesFilmesCadastrados[0][5]="14";
        informacoesFilmesCadastrados[1][5]="10";
        informacoesFilmesCadastrados[2][5]="18";
        informacoesFilmesCadastrados[3][5]="14";
        informacoesFilmesCadastrados[4][5]="18";
        informacoesFilmesCadastrados[5][5]="14";
        informacoesFilmesCadastrados[6][5]="16";
        informacoesFilmesCadastrados[7][5]="livre";
        informacoesFilmesCadastrados[8][5]="10";
        informacoesFilmesCadastrados[9][5]="16";
        informacoesFilmesCadastrados[10][5]="16";
        informacoesFilmesCadastrados[11][5]="16";
        informacoesFilmesCadastrados[12][5]="16";
        informacoesFilmesCadastrados[13][5]="14";
        informacoesFilmesCadastrados[14][5]="14";
        informacoesFilmesCadastrados[15][5]="18";
        informacoesFilmesCadastrados[16][5]="12";
        informacoesFilmesCadastrados[17][5]="12";
        informacoesFilmesCadastrados[18][5]="16";
        informacoesFilmesCadastrados[19][5]="16";                                           
        novoFilmeIndice = 20;
                        
    }

    //Função para obter quantidade de filmes cadastrados para exibição   
    public static int QuantidadeAtualFilmesCadastrados() {
        int filmes;        
        try {
            
            filmes = 0;                      
            for (int i = 0; i < 1000; i++) {
                if (informacoesFilmesCadastrados[i][1] == null) {                    
                }else filmes = filmes + 1;    
            }                        
        } catch (Exception e) {
            filmes =0;            
        }
        return filmes;
    }

                

    
    
    public static boolean adicionarNovoFilme(String[][] NovoFilmea){
    
        
        
        //localizar se a compra ja existe                                     
        //for (int i = 0; i < 1000; i++) {
          //  if (informacoesFilmesCadastrados[i][0] == ""){
            //    novoFilmeIndice  = i;
            //}                        
//        } 
        
        
        novoFilmeIndice = Integer.valueOf(NovoFilmea[0][0]);
        
        informacoesFilmesCadastrados[novoFilmeIndice][0] = NovoFilmea[0][0];
        informacoesFilmesCadastrados[novoFilmeIndice][1] = NovoFilmea[0][1];
        informacoesFilmesCadastrados[novoFilmeIndice][2] = NovoFilmea[0][2];
        informacoesFilmesCadastrados[novoFilmeIndice][3] = NovoFilmea[0][3];
        informacoesFilmesCadastrados[novoFilmeIndice][4] = NovoFilmea[0][4];
        informacoesFilmesCadastrados[novoFilmeIndice][5] = NovoFilmea[0][5];
        
        //Atualiza indice para nova compra
        if (Integer.valueOf(NovoFilmea[0][0])>novoFilmeIndice){
            novoFilmeIndice = novoFilmeIndice +1;
        }        
        
        return true;               
    }
    
    
}
  
