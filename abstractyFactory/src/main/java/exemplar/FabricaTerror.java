package exemplar;

public class FabricaTerror implements FabricaAbstrata{

    public Carimbo createCarimbo(){
        return new CarimboTerror();
    }

    public Categoria createCategoria(){
        return new CategoriaTerror();

    }
}
