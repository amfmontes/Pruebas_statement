/**
 * 
 */
package com.companyname.springapp.service;

import java.io.Serializable;
import java.util.List;

import com.companyname.springapp.domain.Product;

/**
 * @author Curso mañana
 *
 */
public interface ProductManager extends Serializable {
public void increasePrice(int percentage);
    
    public List<Product> getProducts();


}
