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
public class Modifiers {
    private boolean topublic;
    private boolean toprivate;
    private boolean toprotected;
    private boolean tofinal;
    private boolean toabstract;
    private boolean tostatic;
    
    
    public boolean isTopublic() {
        return topublic;
    }

    public void setTopublic(boolean topublic) {
        this.topublic = topublic;
    }

    public boolean isToprivate() {
        return toprivate;
    }

    public void setToprivate(boolean toprivate) {
        this.toprivate = toprivate;
    }

    public boolean isToprotected() {
        return toprotected;
    }

    public void setToprotected(boolean toprotected) {
        this.toprotected = toprotected;
    }

    public boolean isTofinal() {
        return tofinal;
    }

    public void setTofinal(boolean tofinal) {
        this.tofinal = tofinal;
    }

    public boolean isToabstract() {
        return toabstract;
    }

    public void setToabstract(boolean toabstract) {
        this.toabstract = toabstract;
    }

    public boolean isTostatic() {
        return tostatic;
    }

    public void setTostatic(boolean tostatic) {
        this.tostatic = tostatic;
    }
    
    
    
    
}

