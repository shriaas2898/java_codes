class Grandparent
{
  public void Print()
  {
    System.out.println("Grand parent");
  }
}
class Parent extends Grandparent
  {
    public void Print()
    {
      super.Print();
      System.out.println("parent");
    }
}
class Child extends Parent
  {
    public void Print()
    {
        super.Print();
        System.out.println("child");
    }
}

class Main
{
  public static void main(String[] args) {
    Child c= new Child();
    c.Print();
  }
}
