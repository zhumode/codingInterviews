import java.util.Stack;

/**
 * @author zhumode
 * @date 2018/9/21
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution21 {

    /**
     * 定义一个栈满足压栈跟弹栈的要求
     * 定义一个辅助栈，保存大小顺序
     */

    Stack<Integer> stack1 = new Stack();  // 保证栈的基本操作
    Stack<Integer> stack2 = new Stack();  // 最小值压入栈

    public void push(int node) {
        if (stack2.isEmpty()) {
            stack2.push(node);
        } else if (node < stack2.peek()) {
            stack2.push(node);
        }
        stack1.push(node);
    }

    public void pop() {
        int node = stack1.pop();

        if (node == stack2.peek()) {
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
