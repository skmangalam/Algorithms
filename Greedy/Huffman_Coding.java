package Greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class HuffManNode {
    int data;
    char c;

    HuffManNode left;
    HuffManNode right;
}

class MyComparator implements Comparator<HuffManNode> {

    @Override
    public int compare(HuffManNode o1, HuffManNode o2) {
        return o1.data-o2.data;
    }
}
public class Huffman_Coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=6;
        char[] charArray = {'a', 'b', 'c', 'c', 'e', 'f'};
        int[] charfreq = {5,9,12,13,16,45};

        PriorityQueue<HuffManNode> q = new PriorityQueue<>(n, new MyComparator());

        for(int i=0; i<6; i++){
            HuffManNode h = new HuffManNode();
            h.data = charfreq[i];
            h.c = charArray[i];
            h.left = null;
            h.right = null;
            q.add(h);
        }

        HuffManNode root=null;

        while(q.size()>=2){
            HuffManNode x = q.poll();
            HuffManNode y = q.poll();

            HuffManNode f = new HuffManNode();
            f.data = x.data+y.data;
            f.c = '-';

            f.left = x;
            f.right = y;

            root = f;

            q.add(f);
        }

        printCode(root,"");

    }

    public static void printCode(HuffManNode root, String str){

        if(root.left==null && root.right==null &&
                Character.isLetter(root.c)){
            System.out.println(root.c +" : "+str);
            return;
        }

        printCode(root.left, str+"0");
        printCode(root.right, str+"1");

    }

}
