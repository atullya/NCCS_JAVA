package JavaHomework.ConstructorOverloading;

public class Box {
    int length, breadth, height;

  
    public Box() {
        length = 0;
        breadth = 0;
        height = 0;
    }

   
    public Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.height = 0;
    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

   
    public int volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
       
        Box box1 = new Box();             
        Box box2 = new Box(5, 7);          
        Box box3 = new Box(3, 4, 6);         

        
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
        System.out.println("Volume of Box 3: " + box3.volume());
    }
}
