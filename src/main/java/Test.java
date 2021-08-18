import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author xuzj157
 * @date 2021/8/9 9:59
 */
public class Test {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.peek();
        stack.pop();
        stack.push("");
        Queue<String> queue = new ArrayBlockingQueue<>(10);
        queue.offer("");
        queue.poll();
        Deque<String> deque = new ArrayDeque<>();
    }

}
