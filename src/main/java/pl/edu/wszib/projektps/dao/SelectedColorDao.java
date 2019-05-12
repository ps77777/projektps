package pl.edu.wszib.projektps.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektps.domain.SelectedColor;

import java.util.List;

@Repository
public interface SelectedColorDao extends CrudRepository<SelectedColor,Integer> {//odczytywanie danych z db (dao vs domain)

    List<SelectedColor> findByColor(String color);
}
