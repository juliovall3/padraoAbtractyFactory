package exemplar;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void deveEmitirCarimboAcao() {
        FabricaAbstrata fabrica = new FabricaAcao();
        Livro livro = new Livro(fabrica);
        assertEquals("carimbo ação",livro.emitirCarimbo());
    }

    @Test
    void deveEmitirCategoriaAcao(){
        FabricaAbstrata fabrica = new FabricaAcao();
        Livro livro = new Livro(fabrica);
        assertEquals("categoria ação", livro.emitirCategoria());
    }

    @Test
    void deveEmitirCarimboTerror(){
        FabricaAbstrata fabrica = new FabricaTerror();
        Livro livro = new Livro(fabrica);
        assertEquals("carimbo terror", livro.emitirCarimbo());
    }

    @Test
    void deveEmitirCategoriaTerror(){
        FabricaAbstrata fabrica = new FabricaTerror();
        Livro livro = new Livro(fabrica);
        assertEquals("categoria terror", livro.emitirCategoria());
    }

}
