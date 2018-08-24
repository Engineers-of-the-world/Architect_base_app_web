
import com.jhopes.modell.Categoria;
import com.jhopes.controllerimpl.CategoriaCtrlImpl;
import java.util.ArrayList;
import com.jhopes.dao.CategoriaDAO;

/**
 *
 * @author P&D
 */
public class TestCategoria {
    static ArrayList<Categoria> list = new ArrayList<>();
    
    public static void main(String[] args) {
        CategoriaDAO catdao;
        catdao = new CategoriaCtrlImpl();
        /*list = catdao.readCategoria();
        for(Categoria item: list){
            System.out.println(""+item.getName_cat());
        }*/
        Categoria cat = new Categoria();
        cat.setId_categoria("9");
        cat.setName_cat("lacteos");
        cat.setEstado("1");
        if(catdao.createCategoria(cat)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
}
