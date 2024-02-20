package ch20.mysql.sec09.exam2;

import java.sql.Blob;
import java.util.Date;
import lombok.Data;

@Data
public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfilename;
	private Blob bfiledata;
}
