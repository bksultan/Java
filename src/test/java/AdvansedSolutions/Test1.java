package AdvansedSolutions;
    class Dog {
        String name;
        public Dog(String name){
            this.name=name;
        }

        public String setName(String name) {
            this.name=name;
            return name;
        }

        public String getName() {
            return name;
        }
    }

    class MyCode  {

        public static void main (String[] args) { // Entry point
            Dog aDog = new Dog("Max");
            foo(aDog);
            bar(aDog);
            System.out.println(aDog.getName());
        }

        public static void bar(Dog d) {
            Dog newDog = new Dog("");
            newDog = d; //
            newDog.setName("Fred");
        }

        public static void foo(Dog d) {
            d.setName("Sparky");
        }
    }