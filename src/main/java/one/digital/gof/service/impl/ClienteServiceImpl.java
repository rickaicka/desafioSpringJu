//package one.digital.gof.service.impl;
//
//import one.digital.gof.model.cliente.Cliente;
//import one.digital.gof.model.cliente.ClienteRepositorio;
//import one.digital.gof.model.cliente.Endereco;
//import one.digital.gof.model.cliente.EnderecoRepositorio;
//import one.digital.gof.service.ClienteService;
//import one.digital.gof.service.ViaCepService;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class ClienteServiceImpl implements ClienteService {
//
//    // Singleton: Injetar os componentes do Spring com @Autowired.
//    private final ClienteRepositorio clienteRepository;
//    private final EnderecoRepositorio enderecoRepository;
//    private final ViaCepService viaCepService;
//
//    public ClienteServiceImpl(ClienteRepositorio clienteRepository, EnderecoRepositorio enderecoRepository, ViaCepService viaCepService) {
//        this.clienteRepository = clienteRepository;
//        this.enderecoRepository = enderecoRepository;
//        this.viaCepService = viaCepService;
//    }
//
//    // Strategy: Implementar os métodos definidos na interface.
//    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
//
//    @Override
//    public Iterable<Cliente> buscarTodos() {
//        // Buscar todos os Clientes.
//        return clienteRepository.findAll();
//    }
//
//    @Override
//    public Cliente buscarPorId(Long id) {
//        // Buscar Cliente por ID.
//        Optional<Cliente> cliente = clienteRepository.findById(id);
//        //noinspection OptionalGetWithoutIsPresent
//        return cliente.get();
//    }
//
//    @Override
//    public void inserir(Cliente cliente) {
//        salvarClienteCep(cliente);
//    }
//
//    @Override
//    public void atualizar(Long id, Cliente cliente) {
//        Optional<Cliente> clienteBd = clienteRepository.findById(id);
//        if(clienteBd.isPresent()){
//            salvarClienteCep(cliente);
//        }
//    }
//
//    @Override
//    public void deletar(Long id) {
//        // Deletar Cliente por ID.
//        clienteRepository.deleteById(id);
//    }
//
//    private void salvarClienteCep(Cliente cliente) {
//        String cep = cliente.getEndereco().getCep();
//        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
//            Endereco novoEndereco = viaCepService.consultarCep(cep);
//            enderecoRepository.save(novoEndereco);
//            return novoEndereco;
//        });
//        cliente.setEndereco(endereco);
//        clienteRepository.save(cliente);
//    }
//}