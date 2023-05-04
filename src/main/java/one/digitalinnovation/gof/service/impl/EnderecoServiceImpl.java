package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.repository.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author falvojr
 */
@Service
public class EnderecoServiceImpl implements EnderecoService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private EnderecoRepository enderecoRepository;

	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Optional<Endereco> buscarEnderecoPorId(String cep) {
		return enderecoRepository.findById(cep);
	}

	@Override
	public void salvarEndereco(Endereco endereco) {
		enderecoRepository.save(endereco);
	}


}