import java.util.*;
public class RandomStringChooser
{
 private ArrayList<String> list;
 public RandomStringChooser(String[] wlist)
  {
    list = new ArrayList<String>();
    for (int i =0; i<wlist.length; i++)
      list.add(wlist[i]);
  }
  public String getNext()
  {
    if(list.size()==0)
      return "NONE";
    int r = (int)(Math.random()*list.size());
    return list.remove(r);
}
}
