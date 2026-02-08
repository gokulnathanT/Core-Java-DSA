package Tasks.Task3;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<Integer> {

    int data=0;
    public CustomCallable(int data) {
        this.data=data;
    }

    @Override
    public Integer call() throws Exception {
        return data;
    }
}
