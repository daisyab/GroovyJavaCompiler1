/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package groovyjava.processor.classes;

/**
 *
 * @author guestu
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.Modifier;

/**
 *
 * @author guestu
 */
public class Classes {
    private String nameOfSuperClass;
    private String packageName;
    private String Name;
    private Collection<Method> methods = new ArrayList<Method>();
    private Map<String, Field> fields = new HashMap<String, Field>();
    private List<? extends Annotation> Annotations = new ArrayList<Annotation>(); 

    
    public Collection<Method> getMethods() {
        return methods;
    }

    public void setMethods(Collection<Method> methods) {
        this.methods = methods;
    }

    public Map<String, Field> getFields() {
        return fields;
    }

    public void setFields(Map<String, Field> fields) {
        this.fields = fields;
    }
    
    public List<? extends Annotation> getAnnotations(){
      return Annotations;
    }

    public void setAnnotations(List<? extends Annotation> annotations){
      this.Annotations = annotations;
    }
    
    public void setName(String setName){
    this.Name = setName;
    }

    public String getName(){
      return Name;
    }

    public String getNameOfSuperClass() {
      return nameOfSuperClass;
    }

    public void setNameOfSuperClass(String nameOfSuperClass) {
      this.nameOfSuperClass = nameOfSuperClass;
    }

    public String getPackageName() {
      return packageName;
    }

    public void setPackageName(String packageName) {
      this.packageName = packageName;
    }

    public void setModifiers(String thismodifier){
        Modifiers modifiers = new Modifiers();
        
            if(thismodifier.contains(Modifier.PUBLIC.toString())){
                modifiers.setTopublic(true);
            }
            else if(thismodifier.contains(Modifier.PRIVATE.toString())){
                modifiers.setToprivate(true);               
            }
            else if(thismodifier.contains(Modifier.PROTECTED.toString())){
                modifiers.setToprivate(true);
            }
            
            if(thismodifier.contains(Modifier.FINAL.toString())){
                modifiers.setTofinal(true);
            }
            
            if(thismodifier.contains(Modifier.ABSTRACT.toString())){
                modifiers.setToabstract(true);
            }
            
            if(thismodifier.contains(Modifier.STATIC.toString())){
                modifiers.setTostatic(true);
            }
    }
}
 
