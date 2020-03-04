package assigment;

import lab.Flower;
import lab.Herb;
import lab.Plant;

public class invoke {
	static int l=0;
	
	static void add(Plant[] plants,Plant p)
	{
		plants[l] = p;
		l++;
	}
	static Plant[] remove (Plant [] plants,String n)
	{
		//Plant[] arr = new Plant[l-1];
		int k=-1;
		for(int i=0;i<l;i++) {
		
			if(plants[i].getName()==n) {
				k=i;}
			
		}if(k>-1){
			Plant[] arr= new Plant[l-1];
			for(int i=0;i<l;i++) {
				if(plants[i].getName()==n) {
					arr [i]= plants[i+1];
					l--;
				}
				else {
					arr [i]=plants[i];
				}
			}
			return arr;
		
		
	}
		else {
			return plants;}
	}
	static Plant search(Plant [] plants ,String n)
	{
		Plant z = null;
		for(int i =0;i<l;i++)
		{
			if(plants[i].getName()==n)
			{
				z = plants[i];
				
			}
			
		}
		
			return z;
		
		
		//else return "not found";
		
		
	}
	static void display (Plant [] plants) {
		for (int i=0;i<l-1;i++) {
			System.out.println(plants[i].toString());
		}
	}
	public static void main(String args[])
	{
		Plant[] p = new Plant[50];
		Plant p1= new Flower("Tree", "green",true,false);
		Plant p2= new Herb("Tr", "Blue",true, "January");
		Plant p3= new Plant("Treeee", "Ash");
		Plant p4= new Plant("Tre", "Blue");
		Plant p5= new Plant("Tee", "Red");
		add(p,p1);
		add(p,p2);
		add(p,p3);
		add(p,p4);
		add(p,p5);
		
		display(p);
		
		Plant obj =search(p,"ksajkdjks");
		if(obj==null) {System.out.println("Search result Not found");}else
		{
		System.out.println("Searching result "+obj.toString());}
		
		p = remove(p, "Tr");
		System.out.println("After removing : ");
		display(p);
		
	}

}
