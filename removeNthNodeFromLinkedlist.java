//Dry run
// 10    20    30    40    50    60   null
// head
// slow
// fast   
// i=1   fast
// i=2          fast
// while loop 
//        slow        fast
//              slow       fast
//                    slow        fast now fast.next=null
// so, remove it by slow.next=slow.next.next;
public class deleteNthNodefFromEnd {
    public static Node deleteNthNodeFromEnd(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null){              // if n =mth node from the end(where m=no.of nodes)
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
        
    }
     public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node a= new Node(10);
     Node b = new Node(20);
      Node c = new Node(30);
      Node d = new Node(40);
      Node e = new Node(50);
      Node f = new Node(60);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
       // 10 20 30 40 50 60
       //Node q=nthNode(a,3);
       //System.out.println(q.data);
       //Node q1=nthNode2(a,2);
       //System.out.println(q1.data);
       display(a);
       a=deleteNthNodeFromEnd(a, 6);
       display(a);





    }
}
// all cases included when n =6 where n= no. of nodes size k equal
// n=tail node
