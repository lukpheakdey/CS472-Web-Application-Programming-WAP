
/**
 * @author lukpheakdey
 */
import java.util.*;

public class BeerExpert {
    public List getBrands(String color){
        List brands = new ArrayList();
        if(color.equals("amber")){
            brands.add("Jack Amer");
            brands.add("Red Moose");
        } else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}