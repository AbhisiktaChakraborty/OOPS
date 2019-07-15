class Car
{
  int fuel_cap,miles_perunit_fuel;
  int range()
  {
    int x = fuel_cap*miles_perunit_fuel;
    return x;
  }

  void diff(Car car1,Car car2)
  {
    if(car1.fuel_cap>car2.fuel_cap)
    System.out.println("Car 1");
    else if (car1.fuel_cap<car2.fuel_cap)
    System.out.println("Car 2");
    else
    System.out.println("Equal");

  }
}

class CarMain
{
  public static void main(String a[]) {

  /*  Car obj_car = new Car();
    obj_car.fuel_cap=10;
    obj_car.miles_perunit_fuel=15;
    System.out.println(obj_car.fuel_cap + " " + obj_car.miles_perunit_fuel);
    System.out.println(obj_car);
    System.out.println("Range = " + obj_car.range());*/

    Car car1 = new Car();
    car1.fuel_cap=10;
    car1.miles_perunit_fuel=15;

    Car car2 = new Car();
    car2.fuel_cap=11;
    car2.miles_perunit_fuel=14;


    Car car = new Car();
    car.diff(car1,car2);

  }
}
