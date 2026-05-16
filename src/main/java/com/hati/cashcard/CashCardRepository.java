package com.hati.cashcard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//repository interface, extends CrudRepository to get basic CRUD operations for free, no need to implement it
// such as save(), findById(), findAll(), deleteById() etc.
interface CashCardRepository extends CrudRepository<CashCard, Long>, PagingAndSortingRepository<CashCard, Long> {
}