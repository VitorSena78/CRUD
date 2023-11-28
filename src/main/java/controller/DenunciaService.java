package controller;

import DAO.CidadaoDAO;
import DAO.DenunciaDAO;
import model.Cidadao;
import model.Denuncia;

public class DenunciaService {
    Denuncia denuncia;

    public boolean registraDenuncia(Denuncia denuncia){
        DenunciaDAO denunciaDAO = new DenunciaDAO();
        //System.out.println(denuncia.toString());
        return denunciaDAO.inserir(denuncia);
    }



    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }
}
