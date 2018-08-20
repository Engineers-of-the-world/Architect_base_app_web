/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.bean.categoria;
import java.util.ArrayList;

/**
 *
 * @author P&D
 */
public interface categoriaDAO {
    public boolean createCategoria();
    public ArrayList<categoria> readCategoria();
    public boolean updateCategoria();
    public boolean deleteCategoria();
}
