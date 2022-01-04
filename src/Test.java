public class Test {
    public static void main(String[] args) {
        //   animal1 ->       {1}
        //    animal2 ->      {1}
//        Animal animal1 = new Animal(1);
//        Animal animal2 = animal1;

        //System.out.println(animal1==animal2); //сравнивает ссылки на объекты, а не сами объекты (1)
//        System.out.println(animal1==animal2);    //Здесь мы также сравниваем объекты как ссылки (2)

//        Object object = new Object();
//        object.equals();


//        String string1 = "Hello";
//        String string2 = "Hello";   //Java автоматически ссылает вторую ссылку на первый объект, если создавваемый новый строковый объект равен предыдущему. Это наз. StringPool. Поэтому при сравнении == ссылки будут равны и выдаст true

//        String string1 = new String("Hello");   //В таком случае PoolString не будет кешироватся, создадутся два объекта класса String. И сравнение == уже не сработает
//        String string2 = new String("Hello");
//        System.out.println(string1.equals(string2));
//        System.out.println(string1==string2);   //тонкий момент!(true). StringPool

        String a = "hello";
        String b = "hello123".substring(0, 5);
        System.out.println(a == b); //(3)

    }
}

/*
1. Для примитивных типов данных такое сравнение работает, для ссылочных - нет.
2. Для того, чтобы сравнивать наши объекты структурно, нам нужно переопределить метод equels() в классе Animal
3. Сравнение == нас подвело, так как у нас были созданы два разных объекта. Поэтому всегда, когда нам нужно структурно сравнить
    два объекта, нужно использовать метод equals()
 */