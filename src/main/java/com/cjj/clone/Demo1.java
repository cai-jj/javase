package com.cjj.clone;

public class Demo1 {
    public static void main(String[] args) {
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
        // true
        System.out.println(person1.getAddress() == person1Copy.getAddress());

    }
}

class Person implements Cloneable{

    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Person clone()  {
        try {

            Person p = (Person) super.clone();
            p.setAddress(p.getAddress().clone());
            return p;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Address implements Cloneable {
    public Address(String name) {
        this.name = name;
    }

    private String name;


    @Override
    protected Address clone()  {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
