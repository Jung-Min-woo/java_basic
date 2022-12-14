class Person{
    long id;
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Person)
            return id == ((Person)obj).id;
        else
            return false;
    }
    Person(long id){
        this.id = id;
    }
}
class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1==p2) 
            System.out.println("p1 == p2");
        else
            System.out.println("p1 != p2");
        
        System.out.println(".equals");

        if(p1.equals(p2))
            System.out.println("p1 == p2");
        else   
            System.out.println("p1 != p2");
    }
}
    // p1 != p2
    // .equals
    // p1 == p2