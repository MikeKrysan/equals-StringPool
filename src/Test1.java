public class Test1 {
    public static void main(String[] args) {
//        String string1 = "Hello";
//        String string2 = "Hello";
//        System.out.println(string1.equals(string2));  //true
//        System.out.println(string1 == string2); //true - PoolString

//        String string1 = "hello";
//        String string2 = "hello456".substring(0, 5);
//        System.out.println(string1 == string2); //false  -  PoolString не сработает

//        String string = "Hello";
//        String string1 =  "Hello";
//        System.out.println(string.equals(string1));

        Animal1 animal1 = new Animal1(1);
        Animal1 animal2 = new Animal1(1);
//        System.out.println(animal1 == animal2); //false
        System.out.println(animal1.equals(animal2));    //true (1) - при переопределенном методе equals.При непереопределенном методе - false
    }
}

class Animal1 {
    private int id;

   public Animal1(int id) {
       this.id = id;
   }

//   public  boolean equals(Object object) {
//       Animal1 anotherAnimal = (Animal1) object;
//       return this.id == anotherAnimal.id;
//   }
}

/*
1.  Если метод equals не переопределить в классе Animal1, тогда в строке 19 будут сравниватся ссылки объектов, а не сами сущности.
    Если использовать переопределенный метод equals() - строки с 30 по 33, тогда мы будем сравнивать сущности объектов, а не ссылкы. Результатом строки 19 будет true
 */