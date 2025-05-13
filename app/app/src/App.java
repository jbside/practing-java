import java.util.Scanner;

import async.AsyncExecute;
import interfaces.IExecutorBase;
import lambda.LambdaExecute;
import linkedlist.LinkedListExecute;
import streams.StreamsExecute;
import threads.ThreadsExecute;


public class App {
    
    static final Integer EXIT_OPTION = 0;
    public static void main(String[] args) {
        Integer escolha;
        Scanner sc = new Scanner(System.in);

        do{
            escolha = executeProgram(sc);
        }while (escolha != EXIT_OPTION);

        sc.close();
    }

    private static int executeProgram(Scanner sc){
        IExecutorBase executorClass = null;
        
        System.out.println("Select an executor to run:");
        System.out.println("1 - Streams");
        System.out.println("2 - Async");
        System.out.println("3 - Lambda");
        System.out.println("4 - Threads");
        System.out.println("5 - Linkedlist");

        System.out.print("Choose: ");
        Integer escolha = sc.nextInt();
        
        switch(escolha){
            case 1:
                executorClass = new StreamsExecute();
                break;
            case 2:
                executorClass = new AsyncExecute();
                break;
            case 3:
                executorClass = new LambdaExecute();
                break;
            case 4:
                executorClass = new ThreadsExecute();
                break;
            case 5:
                executorClass = new LinkedListExecute();
                break;  
        }    
        
        if(executorClass != null){
            System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
            executorClass.Execute();
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        return executorClass != null ? escolha : EXIT_OPTION;
    }
}
