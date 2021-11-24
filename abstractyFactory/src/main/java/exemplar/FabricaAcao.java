package exemplar;

public class FabricaAcao implements FabricaAbstrata{

    public Carimbo createCarimbo(){
        return new CarimboAcao();
    }

    public Categoria createCategoria(){
        return new CategoriaAcao();

    }
}
