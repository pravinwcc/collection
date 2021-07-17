package collection.hashcodendequal;

import java.util.Date;

/**
 * Simple Java Class to represent Person with name, id and date of birth.
 *
 * @author Pravin
 */
public class Person {
   private String name;
   private int id;
   private Date dob;

   public Person() {}
    public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
	public Person(String name, int id, Date dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }
  
/*   @Override
   public boolean equals(Object other){
       if(this == other) return true;
      
       if(other == null || (this.getClass() != other.getClass())){
           return false;
       }
      
       Person guest = (Person) other;
       return (this.id == guest.id) &&
              (this.name != null && name.equals(guest.name)) &&
              (this.dob != null && dob.equals(guest.dob));
   }*/
  
    @Override
   public int hashCode()
    {
       int result = 10;
      /* result = 31*result + id;
       result = 31*result + (name !=null ? name.hashCode() : 0);
       result = 31*result + (dob  !=null ? dob.hashCode() : 0);*/
      
       return result;
   }

   /* @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    } */  
}