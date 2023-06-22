// Douglas Aparecido Barbosa RA: 2268639

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerPedido{

    private Servicos servico;
    private static List<Servicos> bdPedidos = new ArrayList<>();

    public List<Servicos> getBdPedidos(){
        return bdPedidos;
    }

    public Servicos fazerPedido (Servicos servico){
        if(consultaPedido(servico.getCliente()) == null){
            getBdPedidos().add(servico);
            return servico;
        }
        else {
            return null;
        }
    }

    public Servicos consultaPedido (Cliente cliente){
        Servicos servEncontrado = null;
        for(Servicos serv : getBdPedidos()){
            if(serv.getCliente().getEmail().equalsIgnoreCase(cliente.getEmail())) {
                servEncontrado = serv;
                break;
            }
        }
        return servEncontrado;
    }

    public Servicos cancelaPedido(Servicos servico){
        servico = consultaPedido(servico.getCliente());
        Servicos servEncontrado = null;
        for (Servicos serv : getBdPedidos()) {
            if (serv.getCliente().equals(servico.getCliente())) {
                servEncontrado = serv;
                break;
            }
        }
        if (servEncontrado != null) {
            getBdPedidos().remove(servEncontrado);
        }
        return servEncontrado;
    }

    public Servicos atualizaPedido (Servicos servico){
        for(int i = 0; i < getBdPedidos().size(); i++){
            if(servico.getCliente().getEmail() == null ? bdPedidos.get(i).getCliente().getEmail() == null : servico.getCliente().getEmail().equals(bdPedidos.get(i).getCliente().getEmail())){
                String email = JOptionPane.showInputDialog(null, "Informe o novo E-mail", "Atualização de E-mail", JOptionPane.QUESTION_MESSAGE);
                servico.getCliente().setEmail(email);
                bdPedidos.get(i).getCliente().setEmail(email); 
                return getBdPedidos().get(i);
            }
        }
        return null;
    }
}