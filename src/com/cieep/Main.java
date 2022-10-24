package com.cieep;

import com.cieep.modelos.Alumno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        Alumno alumno= new Alumno("Viviana","Paton","12334564H");

        // crea la variable que puede conectar
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        // la variable de la conexion
        Session session= sessionFactory.openSession();
        session.beginTransaction();

        // CREAT
        session.persist(alumno);

        //READ
       // Alumno a = session.get(Alumno.class, 3);
        //System.out.println(a.toString());

        //UPDATE
       // a.setNombre("Lucia");
       // session.merge(a);

        //DELETE
       // session.remove(a);

        session.getTransaction().commit();
        session.close();
    }
}