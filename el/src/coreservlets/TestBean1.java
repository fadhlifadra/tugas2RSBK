package coreservlets;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped // Safe since no user state
public class TestBean1 {
  private Date creationTime = new Date();
  private String greeting = "Selamat pagi, siang sore dan malam dimanapun anda berada";

  public Date getCreationTime() {
    return(creationTime);
  }

  public String getGreeting() {
    return(greeting);
  }

  public double getRandomNumber() {
    return(Math.random());
  }
}