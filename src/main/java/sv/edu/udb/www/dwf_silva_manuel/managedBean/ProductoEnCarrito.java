package sv.edu.udb.www.dwf_silva_manuel.managedBean;

public class ProductoEnCarrito {
    private Producto producto;
    private int cantidad;

    public ProductoEnCarrito(sv.edu.udb.www.dwf_silva_manuel.managedBean.Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public sv.edu.udb.www.dwf_silva_manuel.managedBean.Producto getProducto() {
        return producto;
    }

    public void setProducto(sv.edu.udb.www.dwf_silva_manuel.managedBean.Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return producto.getPrecio() * cantidad;
    }
}