/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidades.Cliente;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego
 */
@Stateless
public class Servicio implements ServicioLocal{
    @PersistenceContext(unitName = "persistencia")
    private EntityManager em;
    private boolean sesion=false;

    public void persist(Object object) {
        em.persist(object);
    }
    
    public void insertar(Object o) {
        em.persist(o);
    }
    

    public boolean iniciarSesion(String rut,String clave){
        Cliente cli=new Cliente();
        
        String pass=getMD5(clave);
        
        
        
        if(rut.equals(cli.getRut()) && pass.equals(cli.getClave())){
            this.sesion=true;
        }
        
        return this.sesion;
    }
    
    public boolean getSesion(){
        return this.sesion;
    }
    
    public boolean cerrarSesion(){
        this.sesion=false;
        
        
        
        return this.sesion;
    }
    
    
    public String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
