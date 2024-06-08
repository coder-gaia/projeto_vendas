/**
 * @author alexandre.gaia
 */
package com.alexandreG.VendaService.service;



import com.alexandreG.VendaService.domain.Produto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "produto", url = "${application.produtoService.endpointConsultarProduto}")
public interface IProdutoService {

    @RequestMapping(method = RequestMethod.GET, value = "/{codigo}", produces = "application/json", headers = "application/json")
    Produto buscarProduto(@RequestParam("codigo") String codigo);
}
