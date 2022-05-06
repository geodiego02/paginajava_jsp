/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidades.Cliente;

/**
 *
 * @author Diego
 */
public interface ServicioLocal {
    void persist(Object object);
    void insertar(Object o);
    boolean iniciarSesion(String rut,String clave);
    
    boolean getSesion();
    
    boolean cerrarSesion();
    
    String getMD5(String input);
}
