
import com.jhopes.controllerimpl.UsuarioCtrlImpl;
import com.jhopes.dao.UsuarioDAO;
import com.jhopes.modell.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P&D
 */
public class TestUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario us = new Usuario();
        UsuarioDAO usdao = new UsuarioCtrlImpl();
        int id = usdao.createUsuario(new Usuario("", "4", "jhopes", "123", "1"));
        System.out.println("return id:"+id);
    }
    
}
