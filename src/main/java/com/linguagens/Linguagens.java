package com.linguagens;

import threads.TarefaParalela;

public class Linguagens {

    public static void main(String[] args) throws InterruptedException {
        TarefaParalela tarefa1 = new TarefaParalela(" 1");
        TarefaParalela tarefa2 = new TarefaParalela(" 2");
        tarefa1.start();
        tarefa2.start();
        tarefa1.join();
        tarefa2.join();
        System.out.println("Main terminou");

    }
}
