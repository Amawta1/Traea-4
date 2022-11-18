/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Empleado;
import java.util.List;

/**
 *
 * @author amawta
 */
public interface EmpleadoService {
    
    public abstract void crear(Empleado empleado);
    public abstract void modificar(int codigo,Empleado empleadoModificado);
    public abstract void eliminar(int codigo);
    public abstract List<Empleado> listar();
    
}
