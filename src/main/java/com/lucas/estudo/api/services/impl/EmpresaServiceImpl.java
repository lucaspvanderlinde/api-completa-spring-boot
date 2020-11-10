package com.lucas.estudo.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.estudo.api.entities.Empresa;
import com.lucas.estudo.api.repositories.EmpresaRepository;
import com.lucas.estudo.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresa para o CNPJ: {}", cnpj);
		// Retorno do tipo Optional.ofNullable, como pode ser nullo isso evita dar NullPointerException.
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa: {}", empresa);
		return this.empresaRepository.save(empresa);
	}

	@Override
	public void delete(Long id) {
		log.info("Deletando uma empresa: {}", id);
		this.empresaRepository.deleteById(id);
	}
}
