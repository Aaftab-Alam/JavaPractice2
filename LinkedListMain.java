import java.util.Scanner;
class Node{
    String info;
    Node address;
}
class LinkedList{
    Node start=null;
    
    public void create(){
        Node temp=new Node();
        while (true){
            Scanner sc=new Scanner(System.in);
            Node node=new Node();
            System.out.print("Enter info: ");
            node.info=sc.nextLine();
            if(start==null){
                start=node;
            }
            else{
                temp.address=node;
            }
            temp=node;
            System.out.println("Do you want more terms? y or n");
            String ch=sc.next();
            if(ch.equals("n")){
                break;
            }
       // sc.close();
        }
    }
    public void display(){
       // Node temp=new Node();
        Node temp=start;
        if(temp==null){
            System.out.println("No LinkedList found");
        }
        else{
        while(temp.address!=null){
            System.out.print(temp.info+"->");
            temp=temp.address;
        }
        System.out.println(temp.info);
        }
    }
}
class LinkedListMain{
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.create();
        obj.display();
        
    }
}