
package com.practica01.controller;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class EstadoController {
    
    @Autowired//esta etiqueta se da cuenta de que EstadoService es una interface, entonces busca que clase usa
    private EstadoService estadoService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var estados=estadoService.getEstados();
        model.addAttribute("estados", estados);
        return "index";
    }
    
    @GetMapping("/estado/nuevo")
    public String estadoNuevo(Estado estado){
        return "modificaEstado";
    }
    
    @PostMapping("/estado/guardar")
    public String estadoGuardar(Estado estado){
        estadoService.save(estado);
        return "redirect:/";
    }
    
    @GetMapping("/estado/eliminar/{idEstado}")
    public String estadoEliminar(Estado estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
    
    @GetMapping("/estado/modificar/{idEstado}")
    public String estadoModificar(Model model, Estado estado){
        estado=estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificaEstado";
    }
    
    
    

}
