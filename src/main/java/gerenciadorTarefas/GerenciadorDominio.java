package gerenciadorTarefas;

import dao.*;
import dominio.*;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * GerenciadorDominio - GerenciadorTarefas 
*/

public class GerenciadorDominio {
    
    GenericDAO genDao = null;
    ClienteDAO clienteDao = null;
    EletronicoRefDAO eletronicoRefDao = null;
    TipoEletronicoDAO tipoEletronicoDao = null;
    ServicoDAO servicoDao = null;
    VendaDAO vendaDao = null;
    
    
    public GerenciadorDominio() throws ClassNotFoundException {
        ConnectionHibernate.getSessionFactory();
        genDao = new GenericDAO();
        clienteDao = new ClienteDAO();
        eletronicoRefDao = new EletronicoRefDAO();
        tipoEletronicoDao = new TipoEletronicoDAO();
        servicoDao = new ServicoDAO();
        vendaDao = new VendaDAO();
    }
    
    
    
    //==================================================================================
    //INSERIR
    public int inserirEletronicoReformado(String descricao, String reparos, int valor, TipoEletronico tipo) throws HibernateException {
        EletronicoReformado eletronicoRef = new EletronicoReformado(descricao, reparos, valor, tipo);
        eletronicoRefDao.inserir(eletronicoRef);
        return eletronicoRef.getIdEletronicoRef();
    }
    
    public int inserirCidade(String nome) throws HibernateException {
        Cidade cidade = new Cidade(nome);
        genDao.inserir(cidade);
        return cidade.getIdCidade();
    }
    
    public int inserirServico(Cliente cliente, String descricaoElet, String descricaoSer, TipoEletronico tipo, int valor, Date dataInicio, Date dataFim, String local, String problemas) throws HibernateException {
        EletronicoCliente eletronicoCli = new EletronicoCliente(descricaoElet, problemas, tipo);
        Servico servico = new Servico(local, descricaoSer, "", false, valor, dataInicio, dataFim, cliente, eletronicoCli);
        genDao.inserir(servico);
        return servico.getIdServico();
    }
    
    public int inserirTipoEletronico(String nome, Marca marca) throws HibernateException {
        TipoEletronico tipo = new TipoEletronico(nome, marca);
        genDao.inserir(tipo);
        return tipo.getIdTipoEletronico();
    }
    
    public int inserirMarca(String nome) throws HibernateException {
        Marca marca = new Marca(nome);
        genDao.inserir(marca);
        return marca.getIdMarca();
    }
    
    public int inserirCliente(String nome, String telefone, String cpf, Cidade cidade, char sexo, String email) throws ClassNotFoundException, HibernateException {
        Cliente cliente = new Cliente(nome, telefone, cpf, sexo, email, cidade);
        clienteDao.inserir(cliente);
        return cliente.getIdCliente();
    }
    
    public int inserirVenda(Date data, String desc, int valor, Cliente cli, EletronicoReformado elet){
        VendaReformado venda = new VendaReformado(data, desc, valor, cli, elet);
        genDao.inserir(venda);
        return venda.getIdVenda();
    }
    
    
    
    //==================================================================================
    //LISTAR
    public List listar(Class classe) throws HibernateException {        
        return genDao.listar(classe);        
    }
    
    public List listarNomeTipoElet(Class classe) throws HibernateException {        
        return tipoEletronicoDao.listarNomeTipo();        
    }
    
    
    //==================================================================================
    //PESQUISAR
    public List<Cliente> pesquisarCliente (String pesq, int tipo) throws ClassNotFoundException, HibernateException {
        List<Cliente> lista = null;
        switch (tipo) {
            case 0: lista = clienteDao.listar(Cliente.class);
            case 1: lista = clienteDao.pesqClienteNome(pesq); break;
            case 2: lista = clienteDao.pesqClienteCidade(pesq); break;
            case 3: lista = clienteDao.pesqClienteCPF(pesq); break;
        }
        return lista;
    }
    
    public List<EletronicoReformado> pesquisarEletronico (String pesq, int tipo) throws ClassNotFoundException, HibernateException {
        List<EletronicoReformado> lista = null;
        switch (tipo) {
            case 0: lista = eletronicoRefDao.pesqEletronicoDisponivel(pesq, tipo); break;
            case 1: lista = eletronicoRefDao.pesqEletronicoVendido(pesq, tipo); break;
        }
        return lista;
    }
    
    public List<Servico> pesquisarServicos (String pesq, int tipo, char status) throws ClassNotFoundException, HibernateException {
        List<Servico> lista = null;
        if(tipo >= 0){
            switch (tipo) {
                case 0: lista = servicoDao.pesqServicosNomeCliente(pesq, tipo, status); break;
                case 1: lista = servicoDao.pesqServicosMesPedido(pesq, tipo, status); break;
            }
        }else{
            switch (status) {
                case 'E': lista = servicoDao.pesqServicosEmAndamento(pesq, tipo, status); break;
                case 'C': lista = servicoDao.pesqServicosConcluidos(pesq, tipo, status); break;
                case 'T': lista = servicoDao.listar(Servico.class); break;
            }
        }
        return lista;
    }
    
    public List<VendaReformado> pesquisarVendas (String pesq, int tipo) throws ClassNotFoundException, HibernateException {
        List<VendaReformado> lista = null;
        switch (tipo) {
            case 0: lista = genDao.listar(VendaReformado.class); break;
            case 1: lista = vendaDao.pesqVendaNomeCliente(pesq, tipo);
        }
        return lista;
    }
     
    
    
    //==================================================================================
    //EXCLUIR
    public void excluirCliente(Cliente cliente){
        clienteDao.excluir(cliente);
    }
    
    public void excluirEletReformado(EletronicoReformado elet){
        eletronicoRefDao.excluir(elet);
    }
    
    
    
    //==================================================================================
    //ALTERAR
    public void alterarCliente(Cliente cli, String nome, String telefone, String cpf, Cidade cidade, char sexo, String email){
        cli.setNome(nome);
        cli.setTelefone(telefone);
        cli.setCpf(cpf);
        cli.setEmail(email);
        cli.setSexo(sexo);
        cli.setCidade(cidade);
        clienteDao.alterar(cli);
    }
    
    public void alterarEletronicoReformado(EletronicoReformado elet, String descricao, String reparos, int valor, TipoEletronico tipo){
        elet.setDescricao(descricao);
        elet.setReparos(reparos);
        elet.setValor(valor);
        eletronicoRefDao.alterar(elet);
    }
    
    
    
    //==================================================================================
    //FINALIZAR SERVICO
    public void finalizarServico(Servico servico){
        servico.setDataFim(new Date());
        servico.setFinalizado(true);
        servicoDao.alterar(servico);
    }
    
}
