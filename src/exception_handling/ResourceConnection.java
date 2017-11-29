package exception_handling;

public class ResourceConnection {
	try{
		ResourceConnection con = resourceFactory.getConnection();
		Results r = con.query("GET INFO FROM CUSTOMER");
		info = r.getData();
		con.close();
	}catch (ResourceException re){
		errorLog.write(re.getMessage());
	}
}
return info;
//Ans:
//The resource connection will not be closed on line 88