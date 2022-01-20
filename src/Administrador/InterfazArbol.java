/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Administrador;

/**
 *
 * @author danig
 */
public interface InterfazArbol<Empleado extends Comparable>{
    
    void insertar(Empleado em);
    
    boolean existe(int id);
    
    Empleado obtener(int id);
    
    boolean esHoja();
    
    boolean esVacio();
    
    void preOrder();
    
    void inOrder();
    
    void postOrden();
    
    void eliminar(int id);
    
}
