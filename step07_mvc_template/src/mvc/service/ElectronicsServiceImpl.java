package mvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//dbInfo.properties
        for(String key : rb.keySet()) {
     	  String value =  rb.getString(key);
     	   String data[] = value.split(",");
     	   //System.out.println(key +" = " + value);
     	  
     	     list.add(new Electronics( Integer.parseInt(data[0]) ,data[1],   
     	    		 Integer.parseInt( data[2]), data[3]) );
     	  
        }
        
        //System.out.println(list);
      
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException {
		
	}

	@Override
	public List<Electronics> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		// TODO Auto-generated method stub
		return null;
	}
    
} // 클래스 끝 