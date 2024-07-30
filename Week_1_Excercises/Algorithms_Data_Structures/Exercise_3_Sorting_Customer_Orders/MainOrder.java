// Step 1: Understanding the problem is completed in Understanding.txt
// Step 4: Analysis is completed in Analysis.txt


public class MainOrder{
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 300.0)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Orders after Bubble Sort:");
        printOrders(bubbleSortedOrders);

        Order[] quickSortedOrders = orders.clone();
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("Orders after Quick Sort:");
        printOrders(quickSortedOrders);

        if (areEqual(bubbleSortedOrders, quickSortedOrders)) {
            System.out.println("Both sorting algorithms produce the same result.");
        } else {
            System.out.println("The sorting algorithms produce different results.");
        }
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " " + order.getCustomerName() + " " + order.getTotalPrice());
        }
        System.out.println();
    }

    private static boolean areEqual(Order[] orders1, Order[] orders2) {
        if (orders1.length != orders2.length) {
            return false;
        }
        for (int i = 0; i < orders1.length; i++) {
            if (orders1[i].getOrderId() != orders2[i].getOrderId() ||
                !orders1[i].getCustomerName().equals(orders2[i].getCustomerName()) ||
                orders1[i].getTotalPrice() != orders2[i].getTotalPrice()) {
                return false;
            }
        }
        return true;
    }
}
