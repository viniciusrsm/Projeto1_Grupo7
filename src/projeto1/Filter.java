package projeto1;
// Filtro Generico em Java
public interface Filter <Type> {
    // Retorna True se o obj está no filtro
    public boolean contains(Type obj);
}