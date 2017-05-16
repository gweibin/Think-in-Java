package chapter11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/16.
 */
class Command {
    String content;

    public Command(String content) {
        this.content = content;
    }

    public void operation() {
        System.out.println(content);
    }
}

class Build {
    Queue<Command> makeQ() {
        Queue<Command> queues = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queues.add(new Command("content" + i));
        }
        return queues;
    }
}

public class Ex27 {

    public static void main(String[] args) {
        useCommand(new Build().makeQ());
    }

    public static void useCommand(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.poll().operation();
        }
    }
}
