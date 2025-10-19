public class main1 {
    public static void main(String[] args) {
        SimpleStack<Integer> stack = new SimpleStack<>();
        System.out.println("Adding items to stack...");
        stack.addItem(10);
        stack.addItem(20);
        stack.addItem(30);
        stack.addItem(40);
        stack.showStack();
        System.out.println("Top item: " + stack.topItem());
        System.out.println("Removing top item: " + stack.removeItem());
        stack.showStack();
        System.out.println("Stack size: " + stack.getSize());
        while (!stack.isstckEmpty()) {
            System.out.println("itempop: " + stack.removeItem());

        }}
}
