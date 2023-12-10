package com.example.javafxformcss.DBConnect;


import com.example.javafxformcss.DBInfo.Person;

import java.util.List;

public interface PersonRep {
    List<Person> getPersons();
    Person getPersonById(int id);

}
