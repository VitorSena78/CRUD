package controller;

import DAO.DenunciaDAO;
import model.Cidadao;
import model.Denuncia;

import java.util.List;

public class DenunciaService {
    Denuncia denuncia;

    public boolean registraDenuncia(Denuncia denuncia) {
        DenunciaDAO denunciaDAO = new DenunciaDAO();
        //System.out.println(denuncia.toString());
        return denunciaDAO.inserir(denuncia);
    }

    public boolean apagarDenuncia(int id) {
        DenunciaDAO denunciaDAO = new DenunciaDAO();
        return denunciaDAO.remover(id);
    }

    public boolean editarDenuncia(Denuncia denuncia) {
        DenunciaDAO denunciaDAO = new DenunciaDAO();
        return denunciaDAO.alterar(denuncia);
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    public List<Denuncia> listarDenuncia() {
        DenunciaDAO denunciaDAO = new DenunciaDAO();
        return denunciaDAO.listar();
    }

    public List<Denuncia> listarMinhasDenuncias(Cidadao cidadao) {
        DenunciaDAO denunciaDAO = new DenunciaDAO();
        return denunciaDAO.listarById(cidadao);
    }
}   
