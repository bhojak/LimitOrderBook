/*
Created by Bhupendra Bhojak
Date: 14 Mar.2023
*/

public class OrderMain {
    static OrderBook appleBook = new OrderBook();

    public  static void main(String[] args){
        appleBook.addOrder(1, 175,   "B",  100);
        appleBook.addOrder(2, 175,   "B",  100);
        appleBook.addOrder(3, 176.8, "O",  100);
        appleBook.addOrder(4, 177,   "O",  100);
        appleBook.addOrder(5, 174,   "B",  100);
        appleBook.addOrder(6, 175,   "B",  100);
        appleBook.addOrder(7, 178,   "B",  100);

        System.out.println(appleBook);

        delteId(6);
        delteId(2);
        delteId(1);
        delteId(4);

        System.out.println("Highest b: " + appleBook.getHighestB().getPrice());
        System.out.println("Lowest O: " + appleBook.getLowestO().getPrice());

    }

    private static void delteId(int id) {
        if(appleBook.deleteOrder(id)){
            System.out.println("order deleted successfully "+ id +", Book after deletion ---------\n" + appleBook );
        }else {
            System.out.println("order" + id + "doesn't exist");
        }
    }
}
