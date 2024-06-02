package com.ocjpraj;

import java.util.*;

//Here two most useful concepts are there first is constructor can be only public,private,default
//and protected but not any other like final, abstract and static.

//Other imp logic is for ch1 and ch2 it stores hashcode value of objects but for
// Strings it stores value raj only so total size is 3 instead of 4.

public class CollHashset 
{
  private String s;
  private CollHashset(String s)
  {
	  this.s= s;
  }
  public static void main(String[] args)
  {
	  HashSet<Object> hs = new HashSet<Object>();
	  CollHashset ch1 = new CollHashset("raj");
	  CollHashset ch2 = new CollHashset("raj");
	  String s1 = new String("raj");
	  String s2 = new String("raj");
	  hs.add(ch1);
	  hs.add(ch2);
	  hs.add(s1);
	  //hs.add(s2);
	  Iterator<Object> itr = hs.iterator();
	  while(itr.hasNext())
		  System.out.println(itr.next());
	  System.out.println(hs.size());
	  System.out.println(s1.equals(s2));
	  
  }
}
