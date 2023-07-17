
public class IslandTourCourse {
    private Node start;
    public IslandTourCourse() {
        start=null;
    }

    public class Node{
        private char name;
        private Node left, right;
        public Node(char newIsland, Node left, Node right) {
            name=newIsland; left=this.left; right=this.right;
        }
    }

    public Node map(){
        Node n1=new Node('H', null, null);
        Node n2=new Node('F', null, null);
        Node n3=new Node('S', null, null);
        Node n4=new Node('U', null, null);
        Node n5=new Node('E', null, null);
        Node n6=new Node('Z', null, null);
        Node n7=new Node('K', null, null);
        Node n8=new Node('N', null, null);
        Node n9=new Node('A', null, null);
        Node n10=new Node('Y', null, null);
        Node n11=new Node('T', null, null);
        
        n1.left=n2; n1.right=n3;
        n2.left=n4; n2.right=n5;
        n3.left=n6; n3.right=n7;
        n4.left=n8; n7.right=n10;
        n5.left=n9; n9.right=null;
        return n1;
    }
    public void A_Course(Node n){
        if(n!=null){
            System.out.print(n.name+"-> ");
            A_Course(n.left);
            A_Course(n.right);
        }
    }

    public void B_Course(Node n){
        if(n!=null){
            B_Course(n.left);
            System.out.print(n.name+"-> ");
            B_Course(n.right);
        }
    }
    
    public void C_Course(Node n){
        if(n!=null){
            C_Course(n.left);
            C_Course(n.right);
            System.out.print(n.name+"-> ");
        }
    }

    public static void main(String[] args) {
        IslandTourCourse itc=new IslandTourCourse();
        itc.start=itc.map();
        System.out.print("A-코스: ");
        itc.A_Course(itc.start);
        System.out.print("\nB-코스: ");
        itc.B_Course(itc.start);
        System.out.print("\nC-코스: ");
        itc.C_Course(itc.start);
    }
}
