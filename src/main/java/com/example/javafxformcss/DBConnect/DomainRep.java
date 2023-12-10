package com.example.javafxformcss.DBConnect;

import com.example.javafxformcss.DBInfo.Domain;
import com.example.javafxformcss.DBInfo.Person;

import java.util.List;

public interface DomainRep {
    List<Domain> getDomains();
    List<Domain> getDomainByPerson(Person person);
    List<Domain> getDomainByPersonId(Integer personId);
}
