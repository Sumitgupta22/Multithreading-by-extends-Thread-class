// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
class A extends Thread{
  public void run(){
    int i=0;
    while(i<10){
      System.out.println(i+ "Threade 1st is running : "+getPriority());
      i++;
    }
  }
}
class B extends Thread{
  public void run(){
    int i=0;
    while(i<10){
      System.out.println(i+ "Threade 2nd is running : "+getPriority());
      i++;
    }
  }
}
class C extends Thread{
  public void run(){
    int i=0;
    while(i<10){
      System.out.println(i+ "Threade 3rd is running : "+getPriority());
      i++;
    }
  }
}
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    A a=new A();
    B b=new B();
    C c=new C();
  //  System.out.println(a.getId());
    a.setPriority(7);
    b.setPriority(Thread.MIN_PRIORITY);
    c.setPriority(Thread.NORM_PRIORITY);
    a.start();
  //  System.out.println(b.getId());
    b.start();
  //  System.out.println(c.getId());
    c.start();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}