package com.example.demo.Controller;


import com.example.demo.Bean.cursoBean;
import com.example.demo.Service.cursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class cursosController {

    @Autowired
    private cursoRepository curRepo;

    @GetMapping("/Obtener")
    public List<cursoBean> obtenerCurso(){
        return (List<cursoBean>)curRepo.findAll();
    }

    @PostMapping("/Insertar")
    public void modificarCurso(@RequestBody cursoBean curBean){
        curRepo.save(curBean);
    }

    @PutMapping("/Modificar")
    public void modificar(@RequestBody cursoBean curBean){
        curRepo.save(curBean);
    }

    @DeleteMapping(value="/{idRecibido}")
    public void eliminarCurso(@PathVariable("idRecibido") Integer id){
        curRepo.deleteById(id);
    }
}
