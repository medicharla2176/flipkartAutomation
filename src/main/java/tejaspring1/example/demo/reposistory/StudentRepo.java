package tejaspring1.example.demo.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tejaspring1.example.demo.entities.database;

@Repository
public interface StudentRepo extends JpaRepository<database, Integer> {

}
