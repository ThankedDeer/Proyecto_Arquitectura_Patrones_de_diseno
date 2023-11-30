package org.example.Observer;

public class Main {
    public static void main(String[] args) {
        // Crear un sujeto (ConcreteSubject)
        ConcreteSubject subject = new ConcreteSubject();

        // Crear observadores (ConcreteObserver)
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Registrar observadores con el sujeto
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Incrementar el contador en el sujeto (debería notificar a los observadores)
        subject.incrementCounter();
        subject.incrementCounter();
    }
}
