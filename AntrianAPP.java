package Queue;
public class AntrianAPP {
    public static void main(String[] args) {
        Antrian antrian = new Antrian(10);
        antrian.Enqueue(40);
        antrian.display();
        antrian.Enqueue(33);
        antrian.display();
        System.out.println("stack yang paling depan = "+antrian.peek());
        antrian.Enqueue(60);
        antrian.display();
        System.out.println("yang diambil dari stack = "+antrian.Dequeue());
        antrian.display();
        System.out.println("yang diambil dari stack = "+antrian.Dequeue());
        antrian.display();
        antrian.Enqueue(54);
        antrian.display();
        System.out.println("stack yang paling depan = "+antrian.peek());
        System.out.print("Muhammad Haidar Rasyiq ");
    }
}
