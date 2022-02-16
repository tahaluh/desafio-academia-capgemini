
package Questoes;

/**
 *
 * @author Thaua Magalhaes
 */
public class QuestaoDois {
   
    public void executar(String senhaAvaliada){
        
        boolean temNumero = false;
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temCaractereEspecial = false;
        int caracteresFaltando = 0;
        
        for (char c : senhaAvaliada.toCharArray()){
            
            if(c >= '0' && c <= '9'){
                temNumero = true;
            } else if(c >= 'A' && c<= 'Z'){
                temMaiuscula = true;
            } else if(c >= 'a' && c<= 'z'){
                temMinuscula = true;
            } else {
                temCaractereEspecial = true;
            }
        }
        
        if (temNumero && temMaiuscula && temMinuscula && temCaractereEspecial){
            if (senhaAvaliada.length() >= 6){
                caracteresFaltando = 0;
            }else {
                caracteresFaltando = ( 6 - senhaAvaliada.length() );
            }
        }else{
            if (!temNumero){
                caracteresFaltando +=1;
            } 
            
            if (!temMaiuscula){
                caracteresFaltando +=1;
            } 
            
            if (!temMinuscula){
                caracteresFaltando +=1;
            } 
            
            if (!temCaractereEspecial){
                caracteresFaltando +=1;
            }
            
            if (caracteresFaltando + senhaAvaliada.length() < 6){
                caracteresFaltando = (6 - senhaAvaliada.length());
            }
        }
        
        System.out.println(caracteresFaltando);
    }
    
    
}
