
package Questoes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Thaua Magalhaes
 */
public class QuestaoTres {
     // Método que retorna uma Lista com todas as Substring de uma String
    private ArrayList<String> substrings(int caracteres, String entrada){
        ArrayList<String> substrings = new ArrayList();
        
        for(int i = 0; i <= caracteres; i++){
            for(int j = i+1; j <= caracteres; j++){
                substrings.add(entrada.substring(i,j));
            }
        }
        return substrings;
    }
    // Método que verifica se dois elementos da Lista são anagramas
    private boolean saoAnagramas(String a, String b){
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        String aOrdenada = new String(arrayA);
        String bOrdenada = new String(arrayB);
        
        return aOrdenada.equals(bOrdenada);
    }
    
    public void executar(String entrada){
        int qntdAnagramas = 0;
        int caracteres = entrada.length();
        
        ArrayList<String> substrings = this.substrings(caracteres, entrada);
        
        for (int i = 0; i < substrings.size(); i++){
            for (int j = i+1; j < substrings.size(); j++){
                if(saoAnagramas(substrings.get(i),substrings.get(j))){
                    qntdAnagramas +=1;
                }
            }
        }
        
        System.out.println(qntdAnagramas);
    }
}
