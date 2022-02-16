
package Questoes;

import java.util.Arrays;

/**
 *
 * @author Thaua Magalhaes
 */
public class QuestaoUm {
    
    public void executar(int n){
        char asterisco = '*';
        char espaco = ' ';
        
        String stringAstericos;
        String stringEspacos;
        
        for (int i = 1; i<=n; i++)
        {
            char[] arrayDeAsteriscos = new char[i];
            Arrays.fill(arrayDeAsteriscos, asterisco);
            stringAstericos = new String(arrayDeAsteriscos);

            
            char[] arrayDeEspacos = new char[n-i];
            Arrays.fill(arrayDeEspacos, espaco);
            stringEspacos = new String(arrayDeEspacos);
            
            System.out.println(stringEspacos+stringAstericos);
        }
    }
    
}
