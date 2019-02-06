package com.compareTo;

/*java provided two interface sorting the object 
1 comparable interface 
2 comparaTo

a comparable object capable to sorting itself and outher object u just impliment ur class comparable interface
it will give compareTo() comparable is java.lang package
*/
public class Movie implements Comparable<Movie> {
	
	double rating;
	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", year=" + year + ", name=" + name + "]";
	}

	int year;
	String name;
	
	public Movie(double rating,int year,String name) {
		this.name=name;
		this.year=year;
		this.rating=rating;
		
	}

	@Override
	public int compareTo(Movie rate) {
		return this.year - rate.year ;
	}
	
	

}
