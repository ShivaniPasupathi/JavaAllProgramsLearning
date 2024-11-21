package Strings;

public class IndexOF {
    public static void main(String args[]) {
        String s1 = "this is index of example";
        //passing substring
        int index1 = s1.indexOf("is");//returns the index of is substring
        System.out.println(index1);

        int index2 = s1.indexOf("index");//returns the index of index substring
        System.out.println(index1 + " " + index2); //2 8

        int index3 = s1.indexOf("ex", 12);
        //returns the index of ex substring after 4th or 12th index
        System.out.println(index3); //5

        int index4 = s1.indexOf('s', 10);//returns the index of s char value
        System.out.println(index4); //3

        int itr = 65;
        System.out.println((char) itr);
    }
}

//Parameter	Description
//str	A String value, representing the string to search for
//fromIndex	An int value, representing the index position to start the search from
//char	An int value, representing a single character, e.g 'A', or a Unicode value

//public int indexOf(String str)
//public int indexOf(String str, int fromIndex)
//public int indexOf(int char)
//public int indexOf(int char, int fromIndex)
