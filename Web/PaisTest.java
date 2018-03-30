package test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import model.Pais;
import service.PaisService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, copia;
	PaisService paisService;
	static int id = 0;

	
	 
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		Pais pais = new Pais();
		pais.setId(id);
		pais.setNome("Brasil");
		pais.setPopulacao("200.000.000");
		pais.setArea("8.516.000");
		copia = new Pais();
		copia.setId(id);
		copia.setNome("Brasil");
		copia.setPopulacao("200.000.000");
		copia.setArea("8.516.000");
		paisService = new PaisService();
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() throws Exception {
		System.out.println("carregar");
		Pais fixture = new Pais();
		fixture.setId(1);
		fixture.setNome("BRASIL");
		fixture.setPopulacao("200.000.000");
		fixture.setArea("8.516.000");
		Pais novo = PaisService.carregar(1);
		assertEquals("testa carregar", novo, fixture);
	}

	@Test
	public void test01Criar() throws Exception {
		Pais pais = new Pais();
		System.out.println("criar");
		id = PaisService.criar(pais);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() throws Exception {
		Pais pais = new Pais();
		System.out.println("atualizar");
		pais.setArea("8.516.000");
		copia.setArea("8.516.000");		
		paisService.atualizar(pais);
		pais = PaisService.carregar(pais.getId());
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() throws Exception {
		PaisService paisService = new PaisService();
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(null);
		copia.setArea(null);
		paisService.excluir(id);
		PaisService.carregar(id);
		assertEquals("testa atualizacao", paisService, copia);
		
	}
}