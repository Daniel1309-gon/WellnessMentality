/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellness;

import javax.swing.JOptionPane;

/**
 *
 * @author danig
 */
public class Arbol implements InterfazArbol<Empleado> {

    private Empleado valor;

    private Arbol izdo, derecho;

    @Override
    public boolean esVacio() {
        return valor == null;
    }

    @Override
    public boolean esHoja() {
        return valor != null && izdo == null && derecho == null;
    }

    @Override
    public void insertar(Empleado em) {
        if (esVacio()) {
            this.valor = em;
        } else {
            if (em.compareTo(valor) < 0) {
                if (izdo == null) {
                    izdo = new Arbol();
                }
                izdo.insertar(em);
            } else if (em.compareTo(valor) > 0) {
                if (derecho == null) {
                    derecho = new Arbol();
                }
                derecho.insertar(em);
            } else {
                JOptionPane.showMessageDialog(null, "Este elemento ya existe");
            }
        }
    }

    @Override
    public boolean existe(int id) {
        if (valor != null) {
            if (id == valor.getID()) {
                return true;
            } else if (id < valor.getID() && izdo != null) {
                return izdo.existe(id);
            } else if (id > valor.getID() && derecho != null) {
                return derecho.existe(id);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Empleado obtener(int id) {
        if (valor != null) {
            if (id == valor.getID()) {
                return valor;
            } else if (id < valor.getID() && izdo != null) {
                return izdo.obtener(id);
            } else if (id > valor.getID() && derecho != null) {
                return derecho.obtener(id);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public void preOrder() {
        if(valor != null){
            System.out.println(valor);
            if(izdo != null) izdo.preOrder();
            if(derecho != null) derecho.preOrder();
        }
    }

    @Override
    public void inOrder() {
        if(valor != null){
            if(izdo != null) izdo.inOrder();
            System.out.println(valor);
            if(derecho != null) derecho.inOrder();
        }
    }

    @Override
    public void postOrden() {
        if(valor != null){
            if(izdo != null) izdo.postOrden();
            if(derecho != null) derecho.postOrden();
            System.out.println(valor);
        }
    }

    @Override
    public void eliminar(int id) {
        if(valor != null){
            
        }
    }

}
