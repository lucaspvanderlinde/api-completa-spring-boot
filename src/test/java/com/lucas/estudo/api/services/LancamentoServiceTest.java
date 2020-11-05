package com.lucas.estudo.api.services;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class LancamentoServiceTest {
	
//	@MockBean
//	private LancamentoRepository lancamentoRepository;
//
//	@Autowired
//	private LancamentoService lancamentoService;
//
//	@Before
//	public void setUp() throws Exception {
//		BDDMockito
//				.given(this.lancamentoRepository.findByFuncionarioId(Mockito.anyLong(), Mockito.any(PageRequest.class)))
//				.willReturn(new PageImpl<Lancamento>(new ArrayList<Lancamento>()));
//		BDDMockito.given(this.lancamentoRepository.findById(Mockito.anyLong())).willReturn(new Lancamento());
//		BDDMockito.given(this.lancamentoRepository.save(Mockito.any(Lancamento.class))).willReturn(new Lancamento());
//	}
//
//	@Test
//	public void testBuscarLancamentoPorFuncionarioId() {
//		
//		Page<Lancamento> lancamento = this.lancamentoService.buscarPorFuncionarioId(1L, new PageRequest(0, 10));
//
//		assertNotNull(lancamento);
//	}
//
//	@Test
//	public void testBuscarLancamentoPorId() {
//		Optional<Lancamento> lancamento = this.lancamentoService.buscarPorId(1L);
//
//		assertTrue(lancamento.isPresent());
//	}
//
//	@Test
//	public void testPersistirLancamento() {
//		Lancamento lancamento = this.lancamentoService.persistir(new Lancamento());
//
//		assertNotNull(lancamento);
//	}

}
