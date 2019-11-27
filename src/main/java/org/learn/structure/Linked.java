package org.learn.structure;

public class Linked {


    private Node tailNode;
    private Node headNode;

    private class Node{

        private Node next;
        private int value;

        public Node(Node next,int value){
            this.next = next;
            this.value = value;
        }
    }

    public void add(int i){

        if (headNode == null){
            headNode = new Node(null,i);
            tailNode = headNode;
        }else {
            Node node = new Node ( null,i);
            tailNode.next = node;
            tailNode = node;
        }
    }

    public void pr(){
        Node t = headNode;
        while (t !=null){
            System.out.println(t.value);
            t = t.next;
        }
    }


    public final static void  main(String str[]){
        Linked linked = new Linked();
        linked.add(0);
        linked.add(3);
        linked.add(2);

        linked.pr();
        System.out.println("test");

    }

}
