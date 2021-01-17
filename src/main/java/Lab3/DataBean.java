/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author student
 */
public class DataBean implements Serializable {
    
   
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String var_jsp;
    String ciag;
     
    private PropertyChangeSupport propertySupport;
    
    
    public DataBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getVar_jsp() {
        return var_jsp;
    }
    
    public void setVar_jsp(String value) {
        String oldValue = var_jsp;
        var_jsp = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, var_jsp);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public String dopisz(String tekst)
    {
        return var_jsp + tekst;
    }
    
   public String getWpisane(){
       return ciag;
       
   }
   
   public void setWpisane(String ciag){
       String oldValue = ciag;
        var_jsp = ciag;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, ciag);
       
   }
    public String toShow()
    {
        return "Wprowadzony ciag znakow to: " + ciag;
    }
}
