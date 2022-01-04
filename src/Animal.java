public class Animal {
    private int id;
    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj)  {
        Animal otherAnimal = (Animal) obj;  //применяем даункастинг, поскольку при перегрузке метода equals() класса Object мы должны в точности повторить сигнатуру метода. А в методе сравнивается объект класса Object
        return this.id == otherAnimal.id;
    }
}
