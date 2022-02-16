/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questoes;

import java.util.Scanner;

/**
 *
 * @author Thaua Magalhaes
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        QuestaoUm questaoUm = new QuestaoUm();
        QuestaoDois questaoDois = new QuestaoDois();
        QuestaoTres questaoTres = new QuestaoTres();
        
        int seletor;
        String stringAux;
        
        while(true){
            System.out.println("Indique o numero da Questão de deseja EXECUTAR: \n"
                    + "1 - Questão 1 \n"
                    + "2 - Questão 2\n"
                    + "3 - Questão 3\n");
            
            seletor = entrada.nextInt();
           
            switch (seletor) {
                case 1 -> {
                    do{
                        System.out.println("Questão 1 - Indique um numero INTEIRO: ");
                        questaoUm.executar(entrada.nextInt());
                        
                        System.out.println("\n Indique uma ação: \n "
                                + "1 - Indicar outro número \n "
                                + "0 - Voltar \n");
                        
                        seletor = entrada.nextInt();
                        
                        if (seletor == 0){
                            break;
                        }
                    } while(true);
                }
                case 2 -> {
                    do{
                        System.out.println("Questão 2 - Indique uma STRING: ");
                        stringAux = entrada.next();
                        questaoDois.executar(stringAux);
                        
                        System.out.println("\n Indique uma ação: \n "
                                + "1 - Indicar outra String \n "
                                + "0 - Voltar \n");
                        
                        seletor = entrada.nextInt();
                        
                        if (seletor == 0){
                            break;
                        }
                    } while(true);
                }
                case 3 -> {
                    do{
                        System.out.println("Questão 3 - Indique uma STRING: ");
                        stringAux = entrada.next();
                        questaoTres.executar(stringAux);
                        
                        System.out.println("\n Indique uma ação: \n "
                                + "1 - Indicar outra String \n "
                                + "0 - Voltar \n");
                        
                        seletor = entrada.nextInt();
                        
                        if (seletor == 0){
                            break;
                        }
                    } while(true);
                }
                default -> System.out.println("\n Opção inválida, tente novamente");
            }
            
            
                   
        }
    }
}
