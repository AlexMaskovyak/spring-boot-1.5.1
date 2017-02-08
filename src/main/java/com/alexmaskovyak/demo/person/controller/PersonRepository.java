package com.alexmaskovyak.demo.person.controller;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.alexmaskovyak.demo.person.model.Person;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, UUID> {

}
