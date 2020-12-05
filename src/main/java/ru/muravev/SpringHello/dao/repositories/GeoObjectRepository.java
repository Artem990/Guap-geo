package ru.muravev.SpringHello.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.muravev.SpringHello.model.Dump;


@Repository
public interface GeoObjectRepository extends JpaRepository<Dump, Long> {

}
