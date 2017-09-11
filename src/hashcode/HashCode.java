
package hashcode;

public class HashCode {
    private String rank;
    private Integer suit;
    public HashCode(String r,Integer s){
        if(r==null || s==null)  // Make sure that both the values must not be Null.
            throw new IllegalArgumentException();
        rank=r;
        suit=s;
    }
    public boolean equals(Object obj){  //Created on our equals() method.
        if(!(obj instanceof HashCode))  return false;
        HashCode b=(HashCode)obj;
        return rank.equals(b.rank) && suit.equals(b.suit);
    }
    public int hashCode(){  // over-rides hashCode method from Object Class.
       return  rank.hashCode() + 7;
    }
    public static void main(String[] args) {
       HashCode code1=new HashCode("Beenish", 44);
       HashCode code2=new HashCode("Beenish",44);
       //Objects are equal so must returns same HashCode.
       System.out.println(code1.equals(code2));
       System.out.println(code1.hashCode());
       System.out.println(code2.hashCode());
       System.out.println("----Un-equal objects can not nessasarly be unique but some-times they can be unique---------------------");
       HashCode code3=new HashCode("Sajjad", 44);
       HashCode code4=new HashCode("sajj",44);
       System.out.println(code3.equals(code4));
       System.out.println(code3.hashCode());
       System.out.println(code4.hashCode());
       
    }
    
}
