package com.tyranotyrano.creational.builder.v3.product;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String phone;
    private boolean isMale;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
        this.phone = builder.phone;
        this.isMale = builder.isMale;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private int height;
        private int weight;
        private String phone;
        private boolean isMale;

        public Builder() {}

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder isMale(boolean isMale) {
            this.isMale = isMale;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", height=" + height +
            ", weight=" + weight +
            ", phone='" + phone + '\'' +
            ", isMale=" + isMale +
            '}';
    }
}
