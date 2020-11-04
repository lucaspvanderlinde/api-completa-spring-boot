package com.lucas.estudo.api.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucas.estudo.api.entities.Empresa;
import com.lucas.estudo.api.repositories.EmpresaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class EmpresaServiceTest {

	// Essa anotação @MockBean cria um objeto falso pra representar a
	// empresaRepository
	@MockBean
	private EmpresaRepository empresaRepository;

	@Autowired
	private EmpresaService empresaService;

	private static final String CNPJ = "51463654000100";

	@Before
	public void setUp() throws Exception {
		// Criando mock para cada método passado, findByCnpj e save.
		// BDDMockito.given passando o metodo
		// Utilizando esse metodo utilitaria Mockito.anyString() pra retornar qualquer
		// coisa
		// Utilizando esse metodo utilitaria Mockito.any(Empresa.class)) pra retornar
		// qualquer objeto do tipo Empresa
		// .willReturn passando um novo objeto de retorno.
		BDDMockito.given(this.empresaRepository.findByCnpj(Mockito.anyString())).willReturn(new Empresa());
		BDDMockito.given(this.empresaRepository.save(Mockito.any(Empresa.class))).willReturn(new Empresa());
	}

	@Test
	public void testBuscarEmpresaPorCnpj() {

		Optional<Empresa> empresa = this.empresaService.buscarPorCnpj(CNPJ);

		assertTrue(empresa.isPresent());
	}

	@Test
	public void testPersistirEmpresa() {
		Empresa empresa = this.empresaService.persistir(new Empresa());

		assertNotNull(empresa);
	}
}
