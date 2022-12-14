package com.example.demo.Service;

import com.example.demo.Bean.estudianteBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudianteRepository extends CrudRepository<estudianteBean, Integer> {
}
