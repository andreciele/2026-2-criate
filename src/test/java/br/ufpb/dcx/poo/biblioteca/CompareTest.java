package br.ufpb.dcx.poo.biblioteca;

import br.ufpb.dcx.poo.biblioteca.contrato.Biblioteca;
import br.ufpb.dcx.poo.biblioteca.contrato.ItemView;
import br.ufpb.dcx.poo.biblioteca.contrato.excecoes.BibliotecaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CompareTest {
    @Test
    void buscarComCodigoMontado() throws BibliotecaException {
        Biblioteca biblioteca = Fabrica.novaBiblioteca();
        biblioteca.acervo().cadastrarItem("L1", "POO em Java",
                "Ayla", "livro", 2020);

        String codigo = new StringBuilder("L").append(1).toString();
        ItemView item = biblioteca.acervo().buscarItem(codigo);

        assertEquals("L1", item.codigo());
    }
}