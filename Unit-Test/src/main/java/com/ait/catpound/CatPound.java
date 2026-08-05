package com.ait.catpound;

import java.util.ArrayList;

public class CatPound {    // catPound and create a arraylist to add Cats objects. 
	private ArrayList<Cat> cats;
	
	public CatPound() { 
	      this.cats = new ArrayList<>();
	  }
public int getnumberOfCats() { //on. of cats?
	return cats.size();
}
	
	public String addCat(Cat cat) {  // add cats
		  if (cat.getName().isEmpty()) {         //(cat.getName()).equals("")
	          return "NAME EMPTY"; 
	       }
		  
		 
		  for (Cat catInPound :cats) {         // short version of for loop 
		      	if (catInPound.getName().equals(cat.getName())) {
		      		return "CAT ALREADY IN POUND";
		      	}
		      }
			  cats.add(cat);
			  return "CAT ADDED";
			 
		  }
	
	public String removeCat(String name) { // remove cates
		  for (Cat catInPound :cats) {
	      	if (catInPound.getName().equals(name)) {
	      		cats.remove(catInPound);
	      		return "CAT REMOVED";
	      	}
	      }
	      return "CAT NOT IN POUND";
	  }
		
		 public boolean isCatInPound(String name){ // is cat in pound?
			  for (Cat catInPound :cats){
				  if (catInPound.getName().equals(name)){
						return true;
					}
			  }
			  return false;
		  }
		  
		  public int getnumberOfCatsOlderThan(int age){ //get no of cates?
				int numberOlder=0;
				for (Cat catInPound :cats){
					if (catInPound.getAge()>age){
						numberOlder++;
					}
				}
				return numberOlder;
			}
		  
		}

		  
	



