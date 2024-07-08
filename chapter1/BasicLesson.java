package chapter1;
public class BasicLesson{

}
class Main {
    //public static void main(string[] args) {}
    //static public void main(string[] args) {}
    //public static void main(string[] marc) {}
    //psvm
    public static void main(String[] args) { 
        Client c1 = new Client();
        System.out.println("Hello World");
    }
        
    }

/* This is a
 * muliple line
 * comment
 */

/**
 * documentation comment
 * client object
 * @author Marco Yimyaem
 * @param not applicable
 */
class Client{
    String Lname; // clients last name
    String Fname;
    String Address; 
    int idNum;
    String acctType;
}


class Transactions{
    String transType;
    int amount;
    int idNum;
}

public class Salmon {
    int count;
    public void Salmon() {
       count = 4;
    }
    public static void main(String[] args) {
    Salmon s = new Salmon();
    System.out.println(s.count);
    } 
}