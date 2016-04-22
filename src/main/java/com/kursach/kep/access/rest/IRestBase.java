package com.kursach.kep.access.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * by Mr Skip on 21.03.2016.
 */
public interface IRestBase<S> {

    ResponseEntity<S> update(@RequestBody S s);
    ResponseEntity delete(@PathVariable Long id);
    ResponseEntity<S> getOne(@PathVariable Long id);
    ResponseEntity<List<S>> getAll();
    ResponseEntity<S> save(@RequestBody S s);

}
