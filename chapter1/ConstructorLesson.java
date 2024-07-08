package chapter1;

public class ConstructorLesson {
    
    public static void main(String[] args) {
        Chick chooks = new Chick();
        Chick andoks = new Chick();
        Chick tamtam;
        Chick diwata = chooks;
    
    }
}

class Chick(){
    System.out.println("a new chick has hatched");
}