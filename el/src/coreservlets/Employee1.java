package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class Employee1 extends Employee {
  public Employee1() {
    super(new Name("Muhammad Fadhli", "Hisyam"),
          new Company("gagalmoveon",
                      "Sadboi"));
  }
}
