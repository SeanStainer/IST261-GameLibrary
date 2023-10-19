package Model;

public interface comparable 
{
	
	//Get year from release date
	int releaseDateYear(String releaseDate);
	
	//compares two games to see which one released first
	boolean compareReleaseDates(Object game);
	
}
