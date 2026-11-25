import java.util.*;

class Node{
  int val;
  Node next;
  Node(){
    this.val=0;
    this.next=null;
  }
  Node(int val){
    this.val=val;
    this.next=null;
  }
}
public class Program1 {
    public static void main(String[] args) {
      Node head=null,prev=null;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
        Node node=new Node(sc.nextInt());
        if(head==null){
          head=node;
        }else{
          prev.next=node;
        }
        prev=node;
      }
      int c=0;
      for(Node temp=head;temp!=null;temp=temp.next){
        //c++;
        System.out.print(temp.val+" ");
      }
      //System.out.print(c);
    }
}
