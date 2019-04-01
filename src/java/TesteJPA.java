
import dao.CursoDAO;
import dao.ProfessorDAO;
import model.Curso;
import model.Professor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yukas
 */
public class TesteJPA {
    
    public static void main(String[] args)
    {
        Professor professor = new Professor("Marco");
        ProfessorDAO.getInstance().salvar(professor);
      
        Curso curso = new Curso("Eng Computacao", 3000, "Graduacao", 10, professor);
        CursoDAO.getInstance().salvar(curso);
        
        
    }
    
}
