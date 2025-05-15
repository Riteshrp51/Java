public interface Stack {
    int size = 5; // Stack size is constant for simplicity
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}