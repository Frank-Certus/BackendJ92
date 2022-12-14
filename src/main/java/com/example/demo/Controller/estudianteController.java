package com.example.demo.Controller;

import com.example.demo.Bean.estudianteBean;
import com.example.demo.Service.estudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins = "http://localhost:4200/")
public class estudianteController {

    @Autowired
    private estudianteBean estuBean;

    @Autowired
    private estudianteRepository estuRepo;

    @GetMapping("/Obtener")
    public List<estudianteBean> obtenerEstudiante(){
        List<estudianteBean> ListaEstudiante = new ArrayList<>();
        ListaEstudiante = (List<estudianteBean>) estuRepo.findAll();

        return ListaEstudiante;
    }

    @PostMapping("/Insertar")
    public void insertarEstudiante(@RequestBody estudianteBean estuBean){

        estuRepo.save(estuBean);
    }

    @PutMapping("/Modificar")
    public void modificarAlumno(@RequestBody estudianteBean estuBean){
        estuRepo.save(estuBean);
    }

    @DeleteMapping("/Eliminar")
    public void eliminar(@RequestBody estudianteBean estuBean){
        estuRepo.deleteById(estuBean.getIdestudiante());
    }

    @PutMapping("/Modificar/{idestudiante}")
    public void modificarAlumnoID( @PathVariable("idestudiante") Integer idestudiante, @RequestBody estudianteBean estuBean){
        estuBean.setIdestudiante(idestudiante);
        estuRepo.save(estuBean);
    }

    @GetMapping("/Obtener/{idestudiante}")
    public ResponseEntity<estudianteBean> obtenerEstudianteUnico(@PathVariable ("idestudiante") Integer idestudiante){
        estudianteBean listEstudianteEncontrado =  estuRepo.findById(idestudiante).orElseThrow();
        return ResponseEntity.ok(listEstudianteEncontrado);
    }

    @DeleteMapping("/Eliminar/{idestudiante}")
    public void eliminar (@PathVariable ("idestudiante") Integer idestudiante){
        estuRepo.deleteById(idestudiante);
    }

}
