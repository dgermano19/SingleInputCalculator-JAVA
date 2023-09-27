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

public class CalculadoraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ler string com expressão matemática
         * Remover espaços
         * Identificar numeros
         * Identificar operadores
         * Identificar parenteses
         * Resolver operações
         * Devolver resultado
        **/
        String exp = "50X*(320e+2555)- 2";
        
        //Removendo espaços e Letras da String
        exp = exp.replace(" ", "");
        exp = exp.replaceAll("([A-Z])","");
        exp = exp.replaceAll("([a-z])","");
        
        
        //Convertendo String tratada(expProcessed) em Array
        String[] expArray;
       
        expArray = exp.split("(?<=[-+*/()])|(?=[-+*/()])"); //Array é preenchido com cada elemento da Expressão (Output: [50, *, 320, +, 2555, -, 0])
        System.out.println(Arrays.toString(expArray));
        

    }
    
}
