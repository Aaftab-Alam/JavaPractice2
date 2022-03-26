package abc;
abstract class Parent{
    public abstract void abc();

    public void print(){
        System.out.println("Abc");
    }

}

class Child extends Parent{
   // @Override
    public void abc(){
        System.out.println("Hi my name is Aaftab");
    }

    public void print2(){
        System.out.println("this is print2 method");
    }
}
public class AbstractMain{
    public static void main(String[] args){
        Child obj=new Child();
        obj.abc();

    }
}