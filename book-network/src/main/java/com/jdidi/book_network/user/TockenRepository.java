package com.jdidi.book_network.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TockenRepository extends JpaRepository<Tocken,Integer> {

    Optional<Tocken> findByTocken(String tocken);
}
