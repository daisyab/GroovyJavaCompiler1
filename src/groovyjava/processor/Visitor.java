/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package groovyjava.processor;

/**
 *
 * @author guestu
 */
import com.sun.source.tree.ClassTree;
import com.sun.source.util.TreePath;
import com.sun.source.util.TreePathScanner;
import com.sun.source.util.Trees;
import groovyjava.processor.classes.Classes;
import java.lang.annotation.Annotation;
import java.util.List;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

/**
 *f
 * @author guestu
 */
public class Visitor extends TreePathScanner<Object, Trees> {

    Classes classes = new Classes();
    
   @Override
   public Object visitClass(ClassTree classTree, Trees trees){
      
        
        // Get to   he current path of the node    
        TreePath path = getCurrentPath();

        //Get the type element corresponding to the class
        TypeElement e = (TypeElement) trees.getElement(path);
        
        //Set qualified class name into model
        classes.setName(e.getQualifiedName().toString());

        //Set extending class info
        classes.setNameOfSuperClass(e.getSuperclass().toString());
            
        //set modifiers
        for (Modifier modifier : e.getModifiers()) {
            classes.setModifiers(modifier.toString());
        }
        
        //set package
        classes.setPackageName(e.getEnclosingElement().toString());
        //set methods
        //classes.setMethods(e.accept(null, e));
        
        //set fields
        classes.setFields(null);
        //set annotations
        
        //FIXME
            classes.setAnnotations((List<? extends Annotation>) e.getAnnotationMirrors());
             
    return super.visitClass(classTree, trees);
   } 
  
 
   
   /*@Override
   public Object visitMethod(MethodTree classTree, Trees trees){
       
   }*/  
}