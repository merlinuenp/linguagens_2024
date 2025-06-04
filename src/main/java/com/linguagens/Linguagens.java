package com.linguagens;

import threads.Tarefa;
import threads.TarefaParalela;

public class Linguagens {

    public static void main(String[] args) throws InterruptedException {
                
//        Tarefa tarefa1 = new Tarefa(" 1");
//        Tarefa tarefa2 = new Tarefa(" 2");
//        tarefa1.run();
//        tarefa2.run();
//        System.out.println("Main terminou");

        
        
        
        
        
        
        
        
        
        
        
        
        

        TarefaParalela tarefa1 = new TarefaParalela(" 1");
        TarefaParalela tarefa2 = new TarefaParalela(" 2");
        tarefa1.start();
        tarefa2.start();
        System.out.println("Main terminou");
    }
}
