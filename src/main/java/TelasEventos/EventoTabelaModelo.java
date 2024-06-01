/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelasEventos;

/**
 *
 * @author Alexandre
 */
import Conexao.Evento;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class EventoTabelaModelo extends AbstractTableModel{
    private List<Evento> eventos;
    public EventoTabelaModelo(List<Evento> eventos){
        this.eventos = eventos;
    }

    @Override
    public int getRowCount() {
        return eventos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Evento e = eventos.get(rowIndex);
        if (columnIndex == 0)
            return e.getCodigo();
        return null;
        
    }
    
}
