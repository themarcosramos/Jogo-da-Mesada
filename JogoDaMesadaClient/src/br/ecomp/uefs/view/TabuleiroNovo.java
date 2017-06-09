/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ecomp.uefs.view;

import br.com.uefs.model.Player;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Ramos
 */
public final class TabuleiroNovo extends JFrame {
    //Player player;
    //List<Player> jogadors;
    private final Container principal = getContentPane();
    private final JLabel jogador1;
    private final JLabel jogador2;
    private final JLabel jogador3;
    private final JLabel jogador4;
    private final JLabel jogador5;
    private final JLabel jogador6;
     private String nomeSala;
    private javax.swing.JLabel jLabel4;
    private int p;
    
    public TabuleiroNovo(){
        super("JOGO DA MESADA");
        
        this.p = 0;        
        this.principal.setLayout(null);
        this.principal.setBackground(Color.WHITE);
        
        this.jogador1 = new JLabel(new ImageIcon("img/amarela.png"));
        this.jogador2 = new JLabel(new ImageIcon("img/pink.png"));
        this.jogador3 = new JLabel(new ImageIcon("img/branca.png"));
        this.jogador4 = new JLabel(new ImageIcon("img/laranja.png"));
        this.jogador5 = new JLabel(new ImageIcon("img/azul.png"));
        this.jogador6 = new JLabel(new ImageIcon("img/vermelha.png"));
        
        this.init();
        this.setLayoutPainel1();
        this.setLayoutPainel2();
        this.setLayoutPainel3();
        this.setLayoutPainel4();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 720);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
     public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
        jLabel4.setText(nomeSala);
    }
    
    public void init(){
        jogador1.setBounds(185, 104, 50, 50);
        jogador2.setBounds(185, 139, 50, 50);
        jogador3.setBounds(185, 174, 50, 50);
        jogador4.setBounds(240, 104, 50, 50);
        jogador5.setBounds(240, 139, 50, 50);
        jogador6.setBounds(240, 174, 50, 50);
        
        principal.add(jogador1);
        principal.add(jogador2);
        principal.add(jogador3);
        principal.add(jogador4);
        principal.add(jogador5);
        principal.add(jogador6);
    }
    
    public void setPosicao(int x){
        if(x == 0){
            jogador1.setBounds(185, 104, 50, 50);
        }
        if(x == 1){
            jogador1.setBounds(295, 104, 50, 50);
            JOptionPane.showMessageDialog(null,"CASA CORREIOS  ! " );
            JOptionPane.showMessageDialog(null,"PUXE 1 CARTA DO TIPO CORREIOS!");
             // exemplo de  com vai ficar as outras cartas do jogo  o que você acha 
        }
        else if(x == 2){
           jogador1.setBounds(410, 104, 50, 50);
           JOptionPane.showMessageDialog(null,"CASA COMPRAS E ENTRETENIMENTOS ! " );
           JOptionPane.showMessageDialog(null,"PUXE 1 COMPRAS E ENTRETENIMENTOS ! ");
        }
        else if(x == 3){
            jogador1.setBounds(520, 104, 50, 50);
            String valor = JOptionPane.showInputDialog(rootPane, "INSIARA $100", JOptionPane.QUESTION_MESSAGE);
            int v= Integer.parseInt(valor);
            JOptionPane.showMessageDialog(null, "VALOR INSERIDO COM SUCESSO: " + v);
        }
        else if(x == 4){
            jogador1.setBounds(630, 104, 50, 50);
            boolean premio=false;
           
            JOptionPane.showMessageDialog(null,"PRÊMIO!- RETIRE $5.000 DO BANCO !");
            
            premio=true;
            
        }
        else if(x == 5){
            jogador1.setBounds(742, 104, 50, 50);
            JOptionPane.showMessageDialog(null,"PRAIA DOMINGO!");
            JOptionPane.showMessageDialog(null,"ADICIONE A QUANTIA QUE ESTÁ EM SORTE GRANDE! \n CASO NÃO TENHA DINHEIRO UM EMPRESTIMO .");
            String op = JOptionPane.showInputDialog(rootPane, "1-FAZER EMPRESTIMO  \n 2- NÃO FAZER EMPRESTINO ", JOptionPane.QUESTION_MESSAGE);
            int p= Integer.parseInt(op);
            if(p==1){
               String rs = JOptionPane.showInputDialog(rootPane, "INSIARA O VALOR DO EMPRÉSTIMO A SER FEITO ", JOptionPane.QUESTION_MESSAGE);  
               int S= Integer.parseInt(rs);
            }else{
                 
             JOptionPane.showMessageDialog(null,"SEGUE  O JOGO !");    
            }
        }
        else if(x == 6){
            jogador1.setBounds(854, 104, 50, 50);
            JOptionPane.showMessageDialog(null,"CONCURSO DE BANDA  DE ARROCHA !");
            
            boolean opcao= false;
            JOptionPane.showMessageDialog(null,"APERTE AQUI PARA RODAR O DADOS DA CASA!"); 
            
           do{
             Random rand = new Random();
             int dado = rand.nextInt(6) + 1; 
            
            if(dado==3){
                 
                 JOptionPane.showMessageDialog(null,"PARABÉNS VOCÊ ACABAR DE GANHAR $1000!");
                 opcao=true;
             }
               
           } while(opcao!=true);
              
        }
        else if(x == 7){
            jogador1.setBounds(185, 218, 50, 50);
            JOptionPane.showMessageDialog(null,"MARATONA BENEFICENTE!");
            
            JOptionPane.showMessageDialog(null,"TODO MUNDO VAI JOGAR O DADO AÍ ,\n E CADA UMA AÍ VAI  TER  QUE PAGARA $100  vezes x  \n QUE ELES SORTEAREM!");
            
            JOptionPane.showMessageDialog(null," FOI PESSOA !");
        }
        else if(x == 8){
            jogador1.setBounds(295, 218, 50, 50);
             
            JOptionPane.showMessageDialog(null," VENDE-SE ! \n NEGÓCIO DE OCASIÃO ! \n SEU POR APENAS $100 VEZES O NÚMERO QUE FOI SORETEADO");
            int a= 8* 100;      
            JOptionPane.showMessageDialog(null,"  NO CASO  :!"+ a+ " VALOR QUE O BANCO VAI PAGAR ");
            JOptionPane.showMessageDialog(null," PUXE  1 CARTA  DE COMPRA E ENTRETENIMENTOS !");
        }
        else if(x == 9){
            jogador1.setBounds(410, 218, 50, 50);
            JOptionPane.showMessageDialog(null,"AJUDE A FLORESTA AMAZÔNICA !");
            JOptionPane.showMessageDialog(null,"ADICIONE A QUANTIA QUE ESTÁ EM SORTE GRANDE! \n CASO NÃO TENHA DINHEIRO UM EMPRESTIMO .");
            String op = JOptionPane.showInputDialog(rootPane, "1-FAZER EMPRESTIMO  \n 2- NÃO FAZER EMPRESTINO ", JOptionPane.QUESTION_MESSAGE);
            int p= Integer.parseInt(op);
            if(p==1){
               String rs = JOptionPane.showInputDialog(rootPane, "INSIRA O VALOR DO EMPRÉSTIMO A SER FEITO ", JOptionPane.QUESTION_MESSAGE);  
               int S= Integer.parseInt(rs);
            }else{

             JOptionPane.showMessageDialog(null,"SEGUE  O JOGO !");    
             }
        }
        else if(x == 10){
            jogador1.setBounds(520, 218, 50, 50);
            JOptionPane.showMessageDialog(null," LANCHONETE  !");
            JOptionPane.showMessageDialog(null,"ADICIONE A QUANTIA QUE ESTÁ EM SORTE GRANDE! \n CASO NÃO TENHA DINHEIRO UM EMPRESTIMO .");
            String op = JOptionPane.showInputDialog(rootPane, "1-FAZER EMPRESTIMO \n 2- NÃO FAZER EMPRESTINO ", JOptionPane.QUESTION_MESSAGE);
            int p = Integer.parseInt(op);
            if(p==1){
               String rs = JOptionPane.showInputDialog(rootPane, "INSIRA O VALOR DO EMPRÉSTIMO A SER FEITO ", JOptionPane.QUESTION_MESSAGE);  
               int S= Integer.parseInt(rs);
            }else{
                 
             JOptionPane.showMessageDialog(null,"SEGUE  O JOGO !");    
             }
        }
        else if(x == 11){
            jogador1.setBounds(630, 218, 50, 50);
            JOptionPane.showMessageDialog(null,"  COMPRAS NO SHOPPING  !");
            JOptionPane.showMessageDialog(null,"ADICIONE A QUANTIA QUE ESTÁ EM SORTE GRANDE! CASO NÃO TENHA DINHEIRO UM EMPRESTIMO .");
            String op = JOptionPane.showInputDialog(rootPane, "1-FAZER EMPRESTIMO  \n 2- NÃO FAZER EMPRESTINO ", JOptionPane.QUESTION_MESSAGE);
            int p= Integer.parseInt(op);
            if(p==1){
               String rs = JOptionPane.showInputDialog(rootPane, "INSIRA O VALOR DO EMPRÉSTIMO A SER FEITO ", JOptionPane.QUESTION_MESSAGE);  
               int S= Integer.parseInt(rs);
            }else{
                 
             JOptionPane.showMessageDialog(null,"SEGUE  O JOGO !");    
            }
        }
        else if(x == 12){
            jogador1.setBounds(742, 218, 50, 50);
        }
        else if(x == 13){
            jogador1.setBounds(854, 218, 50, 50);
        }
        else if(x == 14){
            jogador1.setBounds(185, 330, 50, 50);
        }
        else if(x == 15){
            jogador1.setBounds(295, 330, 50, 50);
        }
        else if(x == 16){
            jogador1.setBounds(410, 330, 50, 50);
        }
        else if(x == 17){
            jogador1.setBounds(520, 330, 50, 50);
        }
        else if(x == 18){
            jogador1.setBounds(630, 330, 50, 50);
        }
        else if(x == 19){
            jogador1.setBounds(742, 330, 50, 50);
        }
        else if(x == 20){
            jogador1.setBounds(854, 330, 50, 50);
        }
        else if(x == 21){
            jogador1.setBounds(185, 442, 50, 50);
        }
        else if(x == 22){
            jogador1.setBounds(295, 442, 50, 50);
        }
        else if(x == 23){
            jogador1.setBounds(410, 442, 50, 50);
        }
        else if(x == 24){
            jogador1.setBounds(520, 442, 50, 50);
        }
        else if(x == 25){
            jogador1.setBounds(630, 442, 50, 50);
        }
        else if(x == 26){
            jogador1.setBounds(742, 442, 50, 50);
        }
        else if(x == 27){
            jogador1.setBounds(854, 442, 50, 50);
        }
        else if(x == 28){
            jogador1.setBounds(185, 554, 50, 50);
        }
        else if(x == 29){
            jogador1.setBounds(295, 554, 50, 50);
        }
        else if(x == 30){
            jogador1.setBounds(410, 554, 50, 50);
        }
        else if(x == 31){
            jogador1.setBounds(520, 554, 50, 50);
        }
    }
    
    /*public static void main(String[] args) {
        new TabuleiroNovo();
    }*/
    
    private void setLayoutPainel1(){
        JPanel painel1 = new JPanel();
        JButton correio = new JButton("Cartas Correio");
        JButton compra = new JButton("Cartas para Compra");
        
        painel1.setBounds(980, 20, 190, 285);
        painel1.setBorder(new LineBorder(Color.BLACK, 2, true));
        painel1.setBackground(Color.WHITE);
        
        correio.setBounds(995, 35, 160, 120);
        correio.setFont(new Font("Tahoma", 0, 14));
        
        compra.setBounds(995, 170, 160, 120);
        compra.setFont(new Font("Tahoma", 0, 14));
        
        principal.add(correio);
        principal.add(compra);
        principal.add(painel1);
    }
    
    private void setLayoutPainel2(){
        JPanel painel2 = new JPanel();
        JPanel branco = new JPanel();
        JButton jogar = new JButton("Jogar");
        JButton sair = new JButton("Sair");
        JLabel sala = new JLabel("Sala: ");
        JLabel saldo = new JLabel("Seu saldo é: ");
        JLabel dado = new JLabel(new ImageIcon("img/dadoPreto.gif"));
        
        painel2.setBounds(980, 320, 190, 200);
        painel2.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 2, true), "Opções ", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 2, 20), Color.RED));
        painel2.setBackground(Color.WHITE);
        
        branco.setBackground(Color.WHITE);
        branco.setBounds(980, 540, 190, 130);
        branco.setBorder(new LineBorder(Color.BLACK, 2, true));
        
        jogar.setBounds(1015, 410, 120, 50);
        jogar.setFont(new Font("Tahoma", 0, 20));
        
        sair.setBounds(1015, 470, 120, 30);
        sair.setFont(new Font("Tahoma", 0, 15));
        
        sala.setBounds(1000, 330, 180, 50);
        sala.setFont(new Font("Tahoma", 0, 17));
        
        saldo.setBounds(1000, 360, 180, 50);
        saldo.setFont(new Font("Tahoma", 0, 17));
        
        dado.setBounds(995, 535, 150, 150);
        
        principal.add(sala);
        principal.add(saldo);
        principal.add(jogar);
        principal.add(sair);
        principal.add(painel2);
        principal.add(dado);
        principal.add(branco);
        
        jogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                 
                 int Dado = random.nextInt(6) + 1; 
                 
                 p=p+Dado;
<<<<<<< HEAD
                JOptionPane.showMessageDialog(null, "SEU NÚMERO FOI: " + Dado); 
                 // passar o valor do dado para todos os tabuleiros
=======
                 
                 JOptionPane.showMessageDialog(null,"SEU NÚMERO FOI: " + Dado); 
                  
>>>>>>> master
                if(p>=31){ 
                    
                   p=31;
                   
                   JOptionPane.showMessageDialog(null,"VOCÊ CHEGOU NO FIM DO MÊS");  
                   
                   setPosicao(p);
                   
                  }else{
                      
                     setPosicao(p); 
                  }

            }
        });
    }
    
    private void setLayoutPainel3(){
        JPanel painel3 = new JPanel();
        painel3.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 2, true), "Suas Cartas ", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 2, 18), Color.RED));
        painel3.setBounds(20, 10, 150, 663);
        painel3.setBackground(Color.WHITE);
        principal.add(painel3);
    }
    
    private void setLayoutPainel4(){
        JLabel tab = new JLabel(new ImageIcon("img/tabuleiro.jpg"));
        tab.setBounds(180, 25, 785, 645);
        principal.add(tab);
    }
}