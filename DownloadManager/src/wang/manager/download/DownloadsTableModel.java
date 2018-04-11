package wang.manager.download;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JProgressBar;
import javax.swing.table.AbstractTableModel;

public class DownloadsTableModel extends AbstractTableModel
implements Observer{

	private static final String[] columnNames = {"URL", "Size", "Progress" , "Status"};
	
	private  static final Class[] columnClass = {String.class,String.class,JProgressBar.class,String.class};
	
	private ArrayList<Download> downloadlist = new ArrayList<Download>();
	
	public void addDownload(Download download){
		download.addObserver(this);
		
		downloadlist.add(download);
	     
		fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
	}
	
	private Download getDownload(int row) {
		return downloadlist.get(row);
	}
	
	private void clearDownload(int row) {
      downloadlist.remove(row);
	  
      fireTableRowsDeleted(row, row);
	}
	
	
	
	
	@Override
	public int getRowCount() {
     		return downloadlist.size();
	}

	@Override
	public int getColumnCount() {

		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int column) {
		return getColumnName(column);
	}

	@Override
	public Class<?> getColumnClass(int col) {
		// TODO 自动生成的方法存根
		return getColumnClass(col);
	}
	@Override
	public Object getValueAt(int row, int col) {
        Download download = downloadlist.get(row);
        switch (col) {
		case 0:
			return download.getUrl();
		case 1:
			int size = download.getSize();
			return (size == -1)? "" : Integer.toString(size);
		case 2:
			return new Float(download.getProgress());
        
		case 3:
			return download.STATUSES[download.getStatus()];
		default:
			break;
		}
		return "";
	}

	@Override
	public void update(Observable o, Object arg) {
       int index = downloadlist.indexOf(o);

       fireTableRowsUpdated(index, index);
	}

}
