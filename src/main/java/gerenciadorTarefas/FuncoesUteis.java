package gerenciadorTarefas;

import dominio.Cidade;
import dominio.Marca;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import dominio.TipoEletronico;
import java.util.Comparator;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * FuncoesUteis - GerenciadorTarefas 
*/

public class FuncoesUteis {
    //==================================================================================
    //CONVERTE STRING PARA FORMATO DATE
    public static Date strToDate(String strDt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.parse(strDt);
    }
    
    //==================================================================================
    //CONVERTE DATE PARA FORMATO STRING
    public static String dateToStr(Date dt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.format(dt);
    }
    
    //==================================================================================
    //VALIDAR CPF
    public static boolean isCPF(String parCpf) {      
        String cpf;
        cpf = parCpf.replace(".", "");
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        
        if (cpf.equals("00000000000")
                || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
   
            return false;
        }

        char dig10, dig11;
        int sm, i, r, num, peso;
        
        sm = 0;
        peso = 10;
        for (i = 0; i < 9; i++) {        
            num = (int) (cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
            dig10 = '0';
        } else {
            dig10 = (char) (r + 48);
        }
        
        sm = 0;
        peso = 11;
        for (i = 0; i < 10; i++) {
            num = (int) (cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
            dig11 = '0';
        } else {
            dig11 = (char) (r + 48);
        }

        
        if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
            return (true);
        } else {
            return (false);
        }
    }
    
    
    //==================================================================================
    //ORDENAR LISTAS CARREGADAS EM COMBOBOX SEM CRITERIA
    public static List<Class> ordenarListaCombo(Class classe, List lista) {
        //ORDENAR COMBO TIPOS DE ELETRONICOS
        if(classe.getName().equals("dominio.TipoEletronico")){
            lista.sort(Comparator.comparing(TipoEletronico::getNomeTipoEletronico));
        }
        //ORDENAR COMBO MARCAS
        else if(classe.getName().equals("dominio.Marca")){
            lista.sort(Comparator.comparing(Marca::getNomeMarca));
        }
        //ORDENAR COMBO CIDADES
        else if(classe.getName().equals("dominio.Cidade")){
            lista.sort(Comparator.comparing(Cidade::getNomeCidade));
        }
        return lista;
    }
}
