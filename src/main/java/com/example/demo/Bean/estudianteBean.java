package com.example.demo.Bean;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiante")
public class estudianteBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiante;

    @Column(name = "dni")
    private String DNI;

    private String nombrestudiante;

    private String apellidopaterno;

    private String apellidomaterno;

    private Integer edad;

    private Date Fechanacimiento;

    private Boolean estado;

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombrestudiante() {
        return nombrestudiante;
    }

    public void setNombrestudiante(String nombrestudiante) {
        this.nombrestudiante = nombrestudiante;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        Fechanacimiento = fechanacimiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
