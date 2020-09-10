package jpa.model;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = factory.createEntityManager();




//        Query query = em.createQuery("select e.lastName from Employee e");
//        query.getResultList().forEach(System.out::println);  // wyswietla po nazwiskach liste

//        TypedQuery<Employee> byFirstName = em.createNamedQuery(Employee.BY_FIRST_NAME, Employee.class);
//        byFirstName.setParameter("firstName", "Jan");  // po imieniu
//        byFirstName.getResultList().forEach(System.out::println);

//        TypedQuery<Employee> byLastName = em.createNamedQuery(Employee.BY_LAST_NAME, Employee.class);
//        byLastName.setParameter(1, "Rydz"); // po nazwiskach
//        byLastName.getResultList().forEach(System.out::println);




//        TypedQuery<Employee> tq = em.createQuery("select e from Employee e where e.firstName like 'A%'", Employee.class);
//        tq.getResultList().forEach(System.out::println);  // wyciaganie po A



//        TypedQuery<Employee> tq = em.createQuery("select e from Employee e where e.firstName = :firstName", Employee.class);
//        tq.setParameter("firstName", "Barbara");  // wyciąganie po imieniu
//        tq.getResultList().forEach(System.out::println);

//        TypedQuery<Employee> tq = em.createQuery("select e from Employee e", Employee.class);  // nazwa tabeli pierwsze Employe e
//        tq.getResultList().forEach(System.out::println);  // wyswiatlanie calej tabeli

//        Employee employee = em.find(Employee.class, 2);  // wyciąganie z bazy danych (znalezienie)
//        System.out.println(employee);
//
//        employee.setFirstName("Jaroslaw");
//        em.getTransaction().begin();
//        em.persist(employee);// zmnienianie w bazie danych
//        em.getTransaction().commit();
//        em.close();

//        em.getTransaction().begin();
//        em.remove(employee);// kasowanie z bazy danych
//        em.getTransaction().commit();
//        em.close();


//        Employee e = new Employee();// wrzucanie do bazy danych
//        e.setFirstName("Pawel");
//        e.setLastName("Nowak");
//        e.setAge(28);
//        Employee e1 = new Employee();
//        e1.setFirstName("Dariusz");
//        e1.setLastName("Smiglo");
       // e1.setAge(32);
//        Employee e2 = new Employee();
//        e2.setFirstName("Barbara");
//        e2.setLastName("Rydz");
//        e2.setAge(45);
////        Employee e3 = new Employee();
////        e3.setFirstName("Jan");
////        e3.setLastName("Kowalski");
////        e3.setAge(55);
//        em.getTransaction().begin();
////
////        em.persist(e);
////        em.persist(e1);
//        em.persist(e2);
////        em.persist(e3);
////
//        em.getTransaction().commit();
        em.close();
    }
}
