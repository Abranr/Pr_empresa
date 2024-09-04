/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Andre
 */
   public class Cliente extends Persona {
    private String nit;

    public Cliente() {}

    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha) {
        super(nombres, apellidos, direccion, telefono, fecha);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    protected String[] crear() {
        try {
            String datos[] = new String[6];
            datos[0] = this.getNit();
            datos[1] = this.getNombres();
            datos[2] = this.getApellidos();
            datos[3] = this.getDireccion(); // Corregido el índice para la dirección
            datos[4] = this.getTelefono(); // Añadido teléfono
            datos[5] = this.getFecha();
            return datos; // Devuelve el array de datos
        } catch (Exception ex) {
            System.out.println("Hay un problema: " + ex.getMessage());
            return null;
        }
    }
}