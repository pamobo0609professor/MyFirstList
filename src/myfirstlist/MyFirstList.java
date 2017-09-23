/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstlist;

import container.List;

/**
 *
 * @author laboratorio
 */
public class MyFirstList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List list = new List();

//        list.add(0);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

        System.out.println(list.toString());
        System.out.println(list.size());
        
        list.remove(6);
        
        System.out.println(list.toString());
        System.out.println(list.size());
    }

}
