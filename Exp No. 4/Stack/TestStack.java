public class TestStack {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();

        // Testing push
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60); // should trigger overflow

        // Display contents
        s.display();

        // Testing pop
        s.pop();
        s.pop();

        // Display again
        s.display();

        // Pop all to test underflow
        s.pop();
        s.pop();
        s.pop();
        s.pop(); // should trigger underflow
    }
}

