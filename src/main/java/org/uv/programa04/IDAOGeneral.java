/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.util.List;

/**
 *
 * @author Itzel
 */
public interface IDAOGeneral <T, ID> {
    public T create(T p); //T es tipo de dato del pojo
    public boolean delete(ID id); //ID es el tipo de dato del id
    public T update(T p, ID id); //pasa tod el pojo
    
    public List<T> findAll(); //regresaria un array
    public T findById(ID id); //solo regresa 1
}
