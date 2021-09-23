package com.nestedClasses.anonymousClasses;

public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello(){

        // local class
        class EnglishGreeting implements HelloWorld{
            String name = "world";

            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        // anonymous class declaration and instantiation at the same time
        // anonymous class is an expression consisting of:
        // - the new operator
        // - name of an interface to implement or class to extend
        // - parentheses that contains arguments to a constructor (interfaces don't have a constructor)
        // - a body, which is the class declaration body
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        // anonymous class that is part of the statement that instantiates the spanishGreeting object
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
