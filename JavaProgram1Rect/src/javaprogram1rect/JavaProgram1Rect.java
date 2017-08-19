/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram1rect;

/**
 *
 * @author Karson
 */
public class JavaProgram1Rect {

    public static void main(String args[]) {
        class Rect{
            double width=5; 
            double height=5;
        }
        Rect rect1 = new Rect();
        System.out.println(rect1.width * rect1.height);
        System.out.println(rect1.width*2 + rect1.height*2);
    }
}