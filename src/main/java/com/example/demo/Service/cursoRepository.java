package com.example.demo.Service;


import com.example.demo.Bean.cursoBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface cursoRepository extends CrudRepository<cursoBean, Integer> {



}
