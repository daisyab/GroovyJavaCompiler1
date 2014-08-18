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
import com.sun.source.util.TreePath;
import com.sun.source.util.Trees;
import com.sun.tools.javac.main.JavaCompiler;
import com.sun.tools.javac.util.Context;
import groovy.lang.GroovyClassLoader;
import groovyjava.GroovyJava;
import java.io.File;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import com.sun.tools.javac.main.JavaCompiler;
import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.CompilationUnit;

 
/**
 *
 * @author guestu
 */

@SupportedAnnotationTypes("groovyjava.GroovyJava")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class GroovyJavaProcessor extends AbstractProcessor {
    private Trees trees;
    
    public GroovyJavaProcessor(){
        
    }
    
    @Override
    public boolean process(Set<? extends TypeElement> annotations,
            RoundEnvironment roundEnv){
        Visitor visitor = new Visitor();
        for(Element e : roundEnv.getElementsAnnotatedWith(GroovyJava.class)){ //element could be field, class ...
            if(e.getKind() != ElementKind.CLASS){
                processingEnv.getMessager().printMessage(
                Diagnostic.Kind.NOTE, "Not a class", e);
                continue;
            }            
            //TypeElement clazz = (TypeElement) e;
            
            TreePath tp = trees.getPath(e);
            visitor.scan(tp, trees);
                       
            ClassNode classNode = ClassHelper.make(Visitor.class);
            File file = new File("/home/guestu/NetBeansProjects/JointCompiler1/src/jointcompiler1/JointCompiler1.groovy");            
            
            ClassLoader parent = getClass().getClassLoader();
            GroovyClassLoader gcl = new GroovyClassLoader(parent);
            CompilationUnit cu = new CompilationUnit(gcl); 
            cu.addSource(cu.addSource(file));
            cu.addClassNode(classNode);
            cu.compile();   
            
            
        }
                              
                
                
                         
                
                
                //get it to be a closure
                //String codeString = code.toString();
                
                
               // List<ASTNode> astNodes = new AstBuilder().buildFromCode(CompilePhase.CANONICALIZATION, Closure.IDENTITY);
                
               // GroovyClassLoader gcl = new GroovyClassLoader();
                //CompilationUnit cu = new CompilationUnit(CompilerConfiguration.DEFAULT, null, gcl);
                //cu.addClassNode((ClassNode) astNodes.iterator());
                //cu.compile();
                return true;
                }
                
                
            }     
            