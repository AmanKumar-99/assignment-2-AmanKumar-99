/*
 *  User: Aman
 *  Date: 26-Mar-20
 *  Time: 6:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;
import java.util.Scanner;

public class MyMain {

public static void main(String[] args)
    {
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue queue=new MyQueue();
        //setting root
        m.setRoot();
        System.out.println("root set : " + m.getRoot().getData());


        //insertion
        for (int i = 0; i <5; i++)
        {
            m.insert(m.getRoot());
        }


        //printing left children
        queue.queuePrint(m.getPre());
        //counting nodes Not having left children
        m.countNotLeft(m.getRoot());
        //printing count
        System.out.println(m.getCount());
    }
}
