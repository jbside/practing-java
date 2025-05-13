package linkedlist;

import interfaces.IExecutorBase;

public class LinkedListExecute implements IExecutorBase{

    @Override
    public void Execute() {
        LinkedListClass<String> list = new LinkedListClass<>();
        System.out.print(list.getSize());
    }
    
}
