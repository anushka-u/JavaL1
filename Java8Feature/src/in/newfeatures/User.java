package in.newfeatures;

import java.util.Optional;

public class User {
	
	public Optional<String> getUserNameById(Integer id)
	{
		String name = null;
		if(id ==100)
		{
			return Optional.ofNullable("Raju");
		}
		else if(id == 101)
		{
			return Optional.ofNullable("Rani");
		}
		else if(id ==102)
		{
			return Optional.ofNullable("Avni");
		}
		else
		{
			return Optional.ofNullable(name);
		}
		
	}
	

}
