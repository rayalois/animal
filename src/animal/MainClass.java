/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author 75767
 */
public class MainClass {
 public static void main(String[] args) {
 Animal animal = new Animal();
 Bird bird = new Bird();
 Dog dog = new Dog();
 System.out.println();
 animal.sleep();
 animal.eat();
 bird.sleep();
 bird.eat();
 dog.sleep();
 dog.eat();
 }
}

