package exemplar;

public class Livro {

    private Carimbo carimbo;
    private Categoria categoria;

    public Livro (FabricaAbstrata fabrica){
        this.carimbo = fabrica.createCarimbo();
        this.categoria = fabrica.createCategoria();
    }

    public String emitirCarimbo(){
        return this.carimbo.emitir();
    }
    
    public String emitirCategoria(){
        return this.categoria.emitir();
    }

}
