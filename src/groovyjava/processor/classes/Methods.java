/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package groovyjava.processor.classes;

import java.util.ArrayList;

/**
 *
 * @author guestu
 */
public class Methods {
    
    private ArrayList<String> parameters = new ArrayList<>();
    private String returnType;
    private ArrayList<String> exceptions = new ArrayList<>();
    
    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }

    public void addParameters(String parameter) {
        this.parameters.add(parameter);
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public ArrayList<String> getExceptions() {
        return exceptions;
    }

    public void setExceptions(ArrayList<String> exceptions) {
        this.exceptions = exceptions;
    }

}

