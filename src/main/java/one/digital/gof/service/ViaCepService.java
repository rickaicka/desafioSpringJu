//package one.digital.gof.service;
//
//import one.digital.gof.model.cliente.Endereco;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import org.springframework.web.bind.annotation.GetMapping;
//
//@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
//public interface ViaCepService {
//
//    @GetMapping("/{cep}/json/")
//    Endereco consultarCep(@PathVariable("cep") String cep);
//}
