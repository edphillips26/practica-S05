
package com.practica01.service.impl;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService{
    
    @Autowired//Debe haber 1 solo objeto ClienteDao, si ya existe se usa y si no existe se crea automaticamente sin usar new.
    private EstadoDao estadoDao;
   
    @Override
    @Transactional(readOnly=true)
    public List<Estado> getEstados() {
        return (List<Estado>)estadoDao.findAll();
    }
    
    @Transactional(readOnly=true)
    @Override
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.delete(estado);
    }
    
       
}
