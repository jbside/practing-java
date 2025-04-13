import async.AsyncExecute;
import interfaces.IExecutorBase;


public class App {
    public static void main(String[] args) {
        IExecutorBase ayncClass = new AsyncExecute();
        ayncClass.Execute();
    }
}
