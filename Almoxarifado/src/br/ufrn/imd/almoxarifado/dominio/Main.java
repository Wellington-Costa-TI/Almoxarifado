/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import br.ufrn.imd.almoxarifado.coq.MetodoEspecificoAnalise;
import br.ufrn.imd.almoxarifado.coq.SolicitacaoAnalise;
import br.ufrn.imd.almoxarifado.rh.Contato;
import br.ufrn.imd.almoxarifado.rh.Endereco;
import br.ufrn.imd.almoxarifado.rh.Funcionario;
import br.ufrn.imd.almoxarifado.rh.PessoaJuridica;
import br.ufrn.imd.almoxarifado.rh.Setor;

/**
 * Classe Principal
 * 
 * @author Wellington Costa
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	//	 <<RH>>	
		Contato contato = new Contato();
		Endereco endereco = new Endereco();
		Funcionario funcionario = new Funcionario();
		PessoaJuridica pessoaJuridica =  new PessoaJuridica();
		Setor setor = new Setor();
		
	//	<<Dominio>>	
		Almoxarifado almoxarifado = new Almoxarifado();
		ChecklistRecebimentoComum checklistRecebimentoComum = new ChecklistRecebimentoComum();
		ChecklistTransferencia checklistTransferencia = new ChecklistTransferencia();
		ClassificacaoMaterial classificacaoMaterial = new ClassificacaoMaterial();
		DadosEntrega dadosEntrega = new DadosEntrega();
		DadosFrete dadosFrete = new DadosFrete();
		DadosPagamento dadosPagamento = new DadosPagamento();
		DimensaoUnidade dimensaoUnidade = new DimensaoUnidade();
		Documento documento = new Documento();
		EntradaEstoque entradaEstoque = new EntradaEstoque();
		Estoque estoque =  new Estoque();
		GrupoMaterial grupoMaterial =  new GrupoMaterial();
		GuiaRemessa guiaRemessa =  new GuiaRemessa();
		HistoricoRequisicao historicoRequisicao = new HistoricoRequisicao();
		ItemRequisicao itemRequisicao =  new ItemRequisicao();
		LocalizacaoAlmoxarifado localizacaoAlmoxarifado =  new LocalizacaoAlmoxarifado();
		LoteMaterial loteMaterial = new LoteMaterial();
		Material material =  new Material();
		MaterialAnalisavel materialAnalisavel = new MaterialAnalisavel();
		MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
		NaturezaOperacao naturezaOperacao = new NaturezaOperacao();
		NotaFiscal notaFiscal =  new NotaFiscal();
		PesagemVolume pesagemVolume = new PesagemVolume();
		ReservaMaterial reservaMaterial =  new ReservaMaterial();
		SaidaEstoque saidaEstoque = new SaidaEstoque();
		SaidaRequisicaoInterna saidaRequisicaoInterna =  new SaidaRequisicaoInterna();
		UnidadeMedida unidadeMedida =  new UnidadeMedida();
		Usuario usuario = new Usuario();
		VolumeMaterial volumeMaterial =  new VolumeMaterial();
		
	//	<<COQ>>
		MetodoEspecificoAnalise metodoEspecificoAnalise =  new MetodoEspecificoAnalise();
		SolicitacaoAnalise  solicitacaoAnalise =  new SolicitacaoAnalise();
				
		
		
		
		
		

	}

}
