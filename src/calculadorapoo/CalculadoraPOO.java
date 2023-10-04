/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

/**
Exercício 4

* Crie uma calculadora com cinco botões (soma, subtração, divisão, multiplicação e limpar).
* Essa calculadora deverá possui três TextFields (num1, num2 e total).
* 
* Dois TextFields serão usados para captura dos números para realizar a operação desejada.
* 
* O terceiro será para mostrar ao usuário o resultado da operação.
* Em seguida, adicione um botão com o texto "Potência" que eleve um número a uma determinadapotência, 
* isto é, ao pressionar esse botão, o primeiro número (num. 1) será elevado ao segundo número (num. 2).
* 
* Obs.: Caso o aluno opte por criar uma interface com apenas um TextField o argumento final terá nota diferenciada.
 */

import java.util.*;  
import javax.swing.JOptionPane;

public class CalculadoraPOO {

    /**
     * @param args the command line arguments
     */
    
    static String exp;
    static String[] expArray;
    static String[] currentOperation;
    
    public static void main(String[] args) {
                
        writeExp();
       
        try{
            int i=0;
            int c=0;
            
            if(expArray[i]=="("){
                
                while(expArray[c] != ")"){
                        currentOperation[c] = expArray[c];
                        c++;
                }
                
            }else{
                    i++;
                }
            
        }catch(NumberFormatException numberException){
            System.out.println("Invalid Expression, try again");
            writeExp();
        }
    }
    
    static void writeExp(){
        exp = JOptionPane.showInputDialog("Calculator");
        
        //Removendo espaços e Letras da String
        exp = exp.replace(" ", "");
        exp = exp.replaceAll("([A-Z])","");
        exp = exp.replaceAll("([a-z])","");
        
        //Convertendo String tratada(expProcessed) em Array
        expArray = exp.split("(?<=[-+*/()])|(?=[-+*/()])"); //Array é preenchido com cada elemento da Expressão (Output: [50, *, 320, +, 2555, -, 0])
        System.out.println(Arrays.toString(expArray)); 
    } 
    
    //Efetuar operação com dois elementos
}
